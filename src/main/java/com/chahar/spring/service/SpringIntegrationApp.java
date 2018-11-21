package com.chahar.spring.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIntegrationApp {

    public  static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-integration-context.xml");


    }
}
