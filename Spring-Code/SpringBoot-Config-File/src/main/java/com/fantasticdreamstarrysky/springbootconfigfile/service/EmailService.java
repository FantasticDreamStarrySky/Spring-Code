package com.fantasticdreamstarrysky.springbootconfigfile.service;

/**
 * @author 🌃梦幻◎星空🌃
 */
public interface EmailService {

    /**
     * @param to      收件人邮箱
     * @param title   邮件标题
     * @param content 邮件正文
     * @return 是否成功
     */
    boolean send(String to, String title, String content);

}
