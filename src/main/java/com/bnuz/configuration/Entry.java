package com.bnuz.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by QuanQqqqq on 2018/2/26
 * 项目启动入口，配置包根路径
 */
@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = "com.bnuz")
public class Entry {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Entry.class, args);
    }
}