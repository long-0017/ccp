package com.allinfinance.ccp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.allinfinance.ccp.mapper")
public class CcpApplication {

    public static void main(String[] args) {
        SpringApplication.run(CcpApplication.class, args);
    }

}
