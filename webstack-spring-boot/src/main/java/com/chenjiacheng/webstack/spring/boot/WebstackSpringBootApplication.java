package com.chenjiacheng.webstack.spring.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * WebstackSpringBootApplication
 *
 * @author chenjiacheng
 * @since 2025/11/23 17:34
 */
@Slf4j
@SpringBootApplication
public class WebstackSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebstackSpringBootApplication.class, args);
        log.info("WebstackSpringBootApplication started successfully.");
    }

}
