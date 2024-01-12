package com.example.springbootaop.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public void myMethod() {
        System.out.println("Executing myMethod");
    }
}
