package com.fantasticdreamstarrysky.springbootautoconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author 🌃梦幻◎星空🌃
 */
@SpringBootApplication
public class SpringBootAutoConfigApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootAutoConfigApplication.class, args);
        System.out.println(context.getBean("dispatcherServlet"));
        System.out.println(context.getBean("province"));
    }
}
