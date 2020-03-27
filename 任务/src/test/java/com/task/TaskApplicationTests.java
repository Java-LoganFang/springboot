package com.task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class TaskApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();

        //邮件测试
        message.setSubject("通知-今晚开会");
        message.setText("今晚7:30开会");

        message.setTo("3095329264@qq.com");
        message.setFrom("3095329264@qq.com");

        mailSender.send(message);
    }


    @Test
    void test() throws Exception{
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);



        //邮件测试
        helper.setSubject("通知-今晚开会");
        helper.setText("<b style='color:red'>今晚7:30开会</b>",true);

        helper.setTo("3095329264@qq.com");
        helper.setFrom("3095329264@qq.com");


        //上传文件
        helper.addAttachment("1.jpg",new File("C:\\Users\\方玉龙\\Pictures\\Saved Pictures\\heise_zhuti-005.jpg"));
        mailSender.send(mimeMessage);
    }

}
