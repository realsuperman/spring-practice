package com.example.ecommerce.controller;

import com.example.ecommerce.domain.Member;
import com.example.ecommerce.domain.Payment;
import com.example.ecommerce.service.MemberService;
import com.example.ecommerce.service.PaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation;
import org.springframework.restdocs.operation.preprocess.Preprocessors;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;

@AutoConfigureRestDocs
@WebMvcTest(CommerceController.class)
class CommerceControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    MemberService memberService;
    @MockBean
    PaymentService paymentService;

    @Test
    void findMember() throws Exception {
        List<Payment> fakePayments = new ArrayList<>();
        fakePayments.add(Payment.builder().paymentId(1L).payDate(LocalDateTime.now()).member(Member.builder().memberId(1L).name("csh").build()).build());
        fakePayments.add(Payment.builder().paymentId(2L).payDate(LocalDateTime.now()).member(Member.builder().memberId(2L).name("csh2").build()).build());
        when(paymentService.getPaymentList()).thenReturn(fakePayments);

        mockMvc.perform(MockMvcRequestBuilders.get("/api" ))
                .andDo(MockMvcResultHandlers.print())
                .andDo(MockMvcRestDocumentation.document("memberPayment",
                        Preprocessors.preprocessRequest(prettyPrint()),
                        Preprocessors.preprocessResponse(prettyPrint())))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void createMember() throws Exception {
        String requestJson = "{\"name\": \"csh\"}";
        when(memberService.createMember(any())).thenReturn(Member.builder().memberId(1L).name("최성훈").build());

        mockMvc.perform(MockMvcRequestBuilders.post("/api" ).contentType(MediaType.APPLICATION_JSON).content(requestJson))
                .andDo(MockMvcResultHandlers.print())
                .andDo(MockMvcRestDocumentation.document("createMember",
                        Preprocessors.preprocessRequest(prettyPrint()),
                        Preprocessors.preprocessResponse(prettyPrint())))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}