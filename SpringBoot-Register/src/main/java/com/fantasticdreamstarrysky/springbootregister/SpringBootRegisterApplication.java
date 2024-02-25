package com.fantasticdreamstarrysky.springbootregister;

import cn.itcast.pojo.Country;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author 🌃梦幻◎星空🌃
 */
@SpringBootApplication
public class SpringBootRegisterApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootRegisterApplication.class, args);

        Country country = context.getBean(Country.class);
        System.out.println(country);

        System.out.println(context.getBean("province"));
    }

}
