package com.spring.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender mailSender;

	public void sendEmail(String subject, String body, String to) {
		try {
			
			SimpleMailMessage simpleMsg = new SimpleMailMessage();
			simpleMsg.setSubject(subject);
			simpleMsg.setText(body);
			simpleMsg.setTo(to);
			
			mailSender.send(simpleMsg);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	public void sendEmail1(String subject, String body, String to) {
		try {
			
			MimeMessage mimeMessage  = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
			helper.setSubject(subject);
			helper.setText(body,true);
			helper.setTo(to);
			
			helper.addAttachment("Notespdf", new File("D:\\Important Doc\\cartificate\\ORNATES\\Form-16\\"));
			
			mailSender.send(mimeMessage);
			
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}