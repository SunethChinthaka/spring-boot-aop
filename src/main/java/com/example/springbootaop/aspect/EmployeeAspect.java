package com.example.springbootaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class EmployeeAspect {
    /**
     * Before executing any method in the EmployeeController with any number of arguments do this pointcut expression
     */
    @Before(value = "execution(* com.example.springbootaop.controller.EmployeeController.*(..))")
    public void beforeAdviceForController(JoinPoint joinPoint) {
        System.out.println("Request to EmployeeController " + joinPoint.getSignature() + "started at " + new Date());
    }

    @After(value = "execution(* com.example.springbootaop.controller.EmployeeController.*(..))")
    public void afterAdviceForController(JoinPoint joinPoint) {
        System.out.println("Request to EmployeeController " + joinPoint.getSignature() + "ended at " + new Date());
    }

    /**
     * Before executing any method in the EmployeeService with any number of arguments do this pointcut expression
     */
    @Before(value = "execution(* com.example.springbootaop.service.EmployeeService.*(..))")
    public void beforeAdviceForService(JoinPoint joinPoint) {
        System.out.println("Request to EmployeeService " + joinPoint.getSignature() + "started at " + new Date());
    }

    @After(value = "execution(* com.example.springbootaop.service.EmployeeService.*(..))")
    public void afterAdviceForService(JoinPoint joinPoint) {
        System.out.println("Request to EmployeeService " + joinPoint.getSignature() + "ended at " + new Date());
    }
}
