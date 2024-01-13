package com.example.springbootaop;

import com.example.springbootaop.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAopApplication {

    public static void main(String[] args) {
         SpringApplication.run(SpringBootAopApplication.class, args);

       /* ConfigurableApplicationContext context = SpringApplication.run(SpringBootAopApplication.class, args);

        // Get the MyService bean and call myMethod
        MyService myService = context.getBean(MyService.class);
        myService.myMethod();

        // Close the application context
        context.close();*/
    }

}
