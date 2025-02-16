package com.overthecam.battlereport.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class OpenAiConfig {
    @Bean
    public RestTemplate restTemplate() {
        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        requestFactory.setConnectTimeout(5000);     // 연결 타임아웃 5초
        requestFactory.setReadTimeout(30000);        // 읽기 타임아웃 5초

        return new RestTemplate(requestFactory);
    }
}