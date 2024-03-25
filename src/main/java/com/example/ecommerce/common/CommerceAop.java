package com.example.ecommerce.common;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class CommerceAop {
    @Around("execution(* com.example.ecommerce.controller..getMemberPayment(..))")
    public Object doLog(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("before");
        return joinPoint.proceed();
    }
}
