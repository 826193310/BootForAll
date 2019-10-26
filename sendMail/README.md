# springboot 整合发送邮件

* 引进以下依赖
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-mail</artifactId>
</dependency>

* 配置文件增加以下关键配置信息(host 和port 默认配置以 QQ 邮箱为主，username为邮箱，密码不是QQ密码，是你的SMTP授权码)
spring:
  mail:
    host: smtp.qq.com
    username: 
    password: 
    default-encoding: utf-8
    port: 465

* 复制 MailConfig.java 到你的java 目录下

* 复制 SendMailTests.java 到你的测试目录下, 修改发送者和接收者，运行 sendSimpleEmail 方法，看是否正确发送和接收