package com.example.demo_aop2.model;

public class BadConcert implements Performance {
    @Override
    public void perform() {
        System.out.println("The concert was terrible!");
    }
}
