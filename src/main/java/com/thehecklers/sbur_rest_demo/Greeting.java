package com.thehecklers.sbur_rest_demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "greeting")
public class Greeting {

    private String name;
    private String coffee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }

    public String getCoffee() {
        return coffee;
    }
}
