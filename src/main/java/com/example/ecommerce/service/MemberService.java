package com.example.ecommerce.service;

import com.example.ecommerce.domain.Member;
import com.example.ecommerce.domain.Payment;
import com.example.ecommerce.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {
    private final PaymentService paymentService;
    private final MemberRepository memberRepository;

    @Transactional
    public Member createMember(Member member){
        Member returnMember = memberRepository.save(member);
        paymentService.createPayment(Payment.builder().member(member).payDate(LocalDateTime.now()).build());
        return returnMember;
    }
}
