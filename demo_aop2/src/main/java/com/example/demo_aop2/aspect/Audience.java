package com.example.demo_aop2.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {

    @Around("execution(* com.example.demo_aop2.model.Performance.perform())")
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("Silent mode");
            joinPoint.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        } catch (Throwable e) {
            System.out.println("BOOOO!!!");
        } finally {
            System.out.println("Leaving the performance");
        }
    }
}
