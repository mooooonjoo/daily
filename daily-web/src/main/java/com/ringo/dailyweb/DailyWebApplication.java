package com.ringo.dailyweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.ringo.dailyweb", "com.ringo.dailycore"})
public class DailyWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DailyWebApplication.class, args);
    }

}
