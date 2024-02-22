package com.fantasticdreamstarrysky.springbootconfigfile.service.impl;

import com.fantasticdreamstarrysky.springbootconfigfile.pojo.EmailProperties;
import com.fantasticdreamstarrysky.springbootconfigfile.service.EmailService;
import com.fantasticdreamstarrysky.springbootconfigfile.utils.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 🌃梦幻◎星空🌃
 */
@Service
public class EmailServiceImpl implements EmailService {
    /**
     * 注入email配置信息实体类
     */
    @Autowired
    private EmailProperties emailProperties;

    /**
     * @param to      收件人邮箱
     * @param title   邮件标题
     * @param content 邮件正文
     * @return 是否成功
     */
    @Override
    public boolean send(String to, String title, String content) {
        //打印email配置信息
        System.out.println(emailProperties);
        //发送邮件
        return MailUtil.sendMail(emailProperties, to, title, content);
    }
}
