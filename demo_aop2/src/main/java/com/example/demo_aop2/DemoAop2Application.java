package com.example.demo_aop2;

import com.example.demo_aop2.model.Performance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoAop2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoAop2Application.class, args);
        Performance performance = context.getBean("concert", Performance.class);
        performance.perform();
    }

}
