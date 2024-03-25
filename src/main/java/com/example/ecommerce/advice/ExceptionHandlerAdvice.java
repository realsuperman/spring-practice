package com.example.ecommerce.advice;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String methodArgumentNotValidException(MethodArgumentNotValidException e){
        StringBuilder sb = new StringBuilder();
        for(FieldError fieldError : e.getBindingResult().getFieldErrors()){
            sb.append(fieldError.getDefaultMessage());
        }

        return sb.toString();
    }
}