package com.fantasticdreamstarrysky.springbootregister;

import cn.itcast.pojo.Country;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author 🌃梦幻◎星空🌃
 */
@SpringBootApplication
public class SpringBootRegisterApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootRegisterApplication.class, args);

        Country country = context.getBean(Country.class);
        System.out.println(country);
    }

    /**
     * 注入Country对象
     */
    @Bean
    public Country country() {
        return new Country();
    }

}
