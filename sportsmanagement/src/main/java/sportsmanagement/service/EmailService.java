package sportsmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailService {
	
	 @Autowired
	    private JavaMailSender mailSender;
	     
	    public void sendEmail() {
	    	String from = "bbksvrm@gmail.com";
	    	String to = "madhuriit92@gmail.com";
	    	 
	    	SimpleMailMessage message = new SimpleMailMessage();
	    	 
	    	message.setFrom(from);
	    	message.setTo(to);
	    	message.setSubject("Registration Successful..");
	    	message.setText("Hello, your registration is accepted.");
	    	 
	    	mailSender.send(message);
	    }

}
