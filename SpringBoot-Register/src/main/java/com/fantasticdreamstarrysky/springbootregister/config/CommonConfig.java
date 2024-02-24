package com.fantasticdreamstarrysky.springbootregister.config;

import cn.itcast.pojo.Country;
import cn.itcast.pojo.Province;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 🌃梦幻◎星空🌃
 */
@Configuration
public class CommonConfig {

    /**
     * 注入Country对象
     */
    @Bean
    public Country country(@Value("${country.name}") String name, @Value("${country.system}") String system) {
        Country country = new Country();
        country.setName(name);
        country.setSystem(system);
        return country;
    }

    /**
     * 注入Province对象
     * 对象默认的名字是方法名
     */
    @Bean
    public Province province() {
        return new Province();
    }

}
