package com.bootforall.sendMail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SendMailTests {

	@Autowired
	private JavaMailSender javaMailSender;

	@Test
	public void contextLoads() {
	}

	/**
	*@Description: 发送普通文本邮件
	*@Param: 
	*@Author: guanzhou.su,  dont know what is  mean? contact me at QQ:838951396, wechat:13824866769 
	*@Date: 2019/10/26
	*@return: 
	 * 
	**/
	@Test
	public void sendSimpleEmail() {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom("838951396@qq.com");//发送者
		msg.setTo("\n" +
				"826193310@qq.com");//接收者
		msg.setSubject("邮箱标题");//标题
		msg.setText("邮件内容");//内容
		javaMailSender.send(msg);
	}

}
