package com.silvercherry.maoka;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
@SpringBootApplication
@MapperScan(basePackages = "com.silvercherry.maoka.mapper")
public class WxMaDemoApplication {

    
    public static void main(String[] args) {

        SpringApplication.run(WxMaDemoApplication.class, args);
    }
}
