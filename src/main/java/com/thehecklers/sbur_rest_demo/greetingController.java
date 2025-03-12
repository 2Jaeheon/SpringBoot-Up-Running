package com.thehecklers.sbur_rest_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/greeting")
public class greetingController {

    // 다음의 예제에서는 Mirage, Ganador로 설정했으나, properties에 다르게 설정해서
    // 설정 파일의 정보가 먼저 반영됨.

    @Value("${greeting-name: Mirage}")
    private String name;


    @Value("${greeting-coffee: ${greeting-name} is drinking Cafe Ganador}")
    private String coffee;

    @GetMapping
    String getGreeting() {
        return name;
    }

    @GetMapping("/coffee")
    String getNameAndCoffee() {
        return coffee;
    }
}
