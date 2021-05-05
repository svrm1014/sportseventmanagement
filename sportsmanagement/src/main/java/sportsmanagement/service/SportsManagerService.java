package sportsmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sportsmanagement.model.AddSportsDeatails;
import sportsmanagement.repository.AddSportsDetailsRepository;

@Service
@Transactional
public class SportsManagerService {
	
	 @Autowired
	 private AddSportsDetailsRepository repo; 
	 
	 public List<AddSportsDeatails> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(AddSportsDeatails sports) {
	        repo.save(sports);
	    }
	     
	    public AddSportsDeatails get(String sportname) {
	        return repo.findById(sportname).get();
	    }
	     
	    public void delete(String sportname) {
	        repo.deleteById(sportname);
	    }
	

}
