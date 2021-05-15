package sportsmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sportsmanagement.model.AddSportsDeatails;
import sportsmanagement.model.UserRegistrationForm;
import sportsmanagement.repository.AddSportsDetailsRepository;
import sportsmanagement.repository.UserRegistrationRepository;


@Service
@Transactional
public class UserRegistrationService {
	
	 @Autowired
	 private UserRegistrationRepository repo; 
	 
	 public List<UserRegistrationForm> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(UserRegistrationForm user) {
	        repo.save(user);
	    }
	     
	    public UserRegistrationForm get(String username) {
	        return repo.findById(username).get();
	    }
	     
	    public void delete(String username) {
	        repo.deleteById(username);
	    }
	    
	 
	

}
