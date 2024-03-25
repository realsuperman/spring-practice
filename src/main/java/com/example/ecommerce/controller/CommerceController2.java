package com.example.ecommerce.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@Controller
@Slf4j
@RequestMapping("/csv")
@RequiredArgsConstructor
public class CommerceController2 {

    @GetMapping
    @ResponseBody
    public String getMemberPayment() throws IOException {
        try {
            // 파일 경로 설정
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("input.csv").getFile());

            // 파일 읽기
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "EUC-KR"));

            // 파일 내용 출력
            String line = br.readLine();
            Map<String, Integer> result = new HashMap<>();

            while ((line = br.readLine()) != null) {
                String[] splitStr = line.split(",");
                String[] splitStr2 = splitStr[1].split(":");

            }
            br.close();
        } catch (Exception e) {
            throw e;
        }

        return "hello";
    }
}
