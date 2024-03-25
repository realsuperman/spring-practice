package com.example.ecommerce.dto;

import com.example.ecommerce.domain.Member;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    @NotEmpty(message = "이름은 필수 입니다.")
    private String name;

    @NotNull(message = "나이는 필수 입니다.")
    private int age;

    public Member memberDtoToMember(){
        return Member.builder().name(name).build();
    }
}
