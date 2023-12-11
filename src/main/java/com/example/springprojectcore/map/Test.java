package com.example.springprojectcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("springcore/mapconfig.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer);
        System.out.println(customer.getId());
        System.out.println(customer.getProducts());
        System.out.println(customer.getId() +" "+ customer.getProducts());
    }
}
