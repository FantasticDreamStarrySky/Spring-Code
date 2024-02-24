package com.fantasticdreamstarrysky.springbootregister.config;

import cn.itcast.pojo.Country;
import cn.itcast.pojo.Province;
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
    public Country country() {
        return new Country();
    }

    /**
     * 注入Province对象
     * 对象默认的名字是方法名
     */
    @Bean
    public Province province(){
        return new Province();
    }

}
