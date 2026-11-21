package com.example.demo_aop2.model;

import org.springframework.stereotype.Component;

@Component
public class Concert implements Performance {
    @Override
    public void perform() {
        System.out.println("The concert was incredible!");
    }
}
