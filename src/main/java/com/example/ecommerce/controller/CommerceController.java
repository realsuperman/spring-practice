package com.example.ecommerce.controller;

import com.example.ecommerce.controller.response.SuccessFormat;
import com.example.ecommerce.domain.Member;
import com.example.ecommerce.domain.Payment;
import com.example.ecommerce.dto.MemberDto;
import com.example.ecommerce.service.MemberService;
import com.example.ecommerce.service.PaymentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/")
@RequiredArgsConstructor
public class CommerceController {
    private final MemberService memberService;
    private final PaymentService paymentService;

    @GetMapping
    public SuccessFormat<Payment> getMemberPayment(){
        return SuccessFormat.<Payment>builder()
                .success(true)
                .response(paymentService.getPaymentList())
        .build();
    }

    @PostMapping
    public ResponseEntity<Member> createMember(@Valid @RequestBody MemberDto memberDto){
        return ResponseEntity.ok(memberService.createMember(memberDto.memberDtoToMember()));
    }
}
