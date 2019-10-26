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
public class BootforallApplicationTests {

	@Autowired
	private JavaMailSender javaMailSender;

	@Test
	public void contextLoads() {
	}

	@Test
	public void sendEmail() {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom("838951396@qq.com");//发送者
		msg.setTo("\n" +
				"826193310@qq.com");//接收者
		msg.setSubject("邮箱标题");//标题
		msg.setText("https://www.cnblogs.com/lin02/");//内容
		javaMailSender.send(msg);
	}

}
