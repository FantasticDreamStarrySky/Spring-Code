package com.fantasticdreamstarrysky.springbootconfigfile.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 🌃梦幻◎星空🌃
 */
@Component
@ConfigurationProperties(prefix = "email")
public class EmailProperties {


    /**
     * 发件人邮箱
     */
    public String user;

    /**
     * 发件人邮箱授权码
     */
    public String code;

    /**
     * 发件人邮箱对应的服务器域名,如果是163邮箱:smtp.163.com   qq邮箱: smtp.qq.com
     */
    public String host;

    /**
     * 身份验证开关
     */
    private boolean auth;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public boolean isAuth() {
        return auth;
    }

    public void setAuth(boolean auth) {
        this.auth = auth;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "EmailProperties{" +
                "host='" + host + '\'' +
                ", auth=" + auth +
                ", user='" + user + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}

