package com.example.springbootaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Aspect class for logging method entry in the com.example.springbootaop.service package.
 */
@Aspect
@Component
public class LoggingAspect {
    /**
     * Advice method executed before the execution of methods in the com.example.springbootaop.service package.
     *
     * @param joinPoint the JoinPoint representing the intercepted method
     */
    @Before("execution(* com.example.springbootaop.service.*.*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        // Extracting the method name from the JoinPoint
        String methodName = joinPoint.getSignature().getName();

        // Logging the method entry
        System.out.println("Entering method: " + methodName);
    }
}
