package com.example.springprojectadvanced.injectedinterfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO{
    @Override
    public void createOrder() {
        System.out.println("Inside DAOImpl2 createOrder()");
    }
}
