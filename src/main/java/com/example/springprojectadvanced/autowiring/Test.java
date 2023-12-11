package com.example.springprojectadvanced.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springadvanced/autowiringconfig.xml");
        Employee employee = (Employee) ctx.getBean("employee");
        System.out.println(employee);


    }
}
