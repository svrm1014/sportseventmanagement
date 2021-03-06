package sportsmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sportsmanagement.model.AddSportsDeatails;
import sportsmanagement.model.Login;
import sportsmanagement.model.UserRegistrationForm;
import sportsmanagement.service.SportsManagerService;
import sportsmanagement.service.UserRegistrationService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MvcController {
     
    @RequestMapping("/")
    public String home() {
        System.out.println("Going home...");
        return "index";
    }
    
    @GetMapping(value = "/admin")
    public String adminpage(Model model) {
    	Login login = new Login();
    	System.out.println("Going admin page..");
    	model.addAttribute("loginKey",login);
    	return "admin";
    }
    
    
    @PostMapping(value = "/adminview")
    public String submitForm(@ModelAttribute("loginKey") Login loginObj ) {
         
        System.out.println("In adminview page");
        if(loginObj.getUserName().equals("admin") && loginObj.getPassword().equals("admin")) {
        	return "adminviewpage";
        } else {
        	return "adminerrorpage";
        }
        
    }
    
    @Autowired
    private SportsManagerService sportsManagerservice;
    
    @GetMapping(value="/addsportsdetails")
    public String addSportDetails(Model model) {
    	System.out.println("Going Add Sports Details page..");
    	AddSportsDeatails details = new AddSportsDeatails();    	
    	model.addAttribute("sportsdetailsKey", details);
    	System.out.println(details);
    	return "addsportsdetails";
    }

    @PostMapping(value="/sportsdetails")
    public String sportDetails(@ModelAttribute("sportsdetailsKey") AddSportsDeatails sportsDetails) {
    	System.out.println("Displaying sports Details page.." + sportsDetails);
    	sportsManagerservice.save(sportsDetails);
    	return "sportsdetails";
    }    
    
    
    @GetMapping(value="/viewsports")
    public String viewSports(Model model) {
    	System.out.println("View the added sports");  
    	List<AddSportsDeatails> d = sportsManagerservice.listAll();
    	System.out.println("List of sports added" + d);
    	model.addAttribute("viewsportsKey", d);
		return "viewsports";
    }
    
    
    @GetMapping(value="/user")
    public String userPage(Model model) {
    	System.out.println("User Page...");
    	List<AddSportsDeatails> sports = sportsManagerservice.listAll();
    	model.addAttribute("sportsKey", sports);
    	return "user";
    }
    
    @Autowired
    private UserRegistrationService userregistrationservice;
    
    @GetMapping(value="/register")
    public String userRegistrationForm(Model model) {
    	System.out.println("User Registraion ....");
    	UserRegistrationForm form = new UserRegistrationForm();
    	model.addAttribute("formKey", form);
    	System.out.println("Form :" + form);
    	return "registrationform";
    }
    
    @PostMapping(value="/registrationsave")
    public String userRegistrationSave(@ModelAttribute("formKey") UserRegistrationForm form) {
    	System.out.println("Register the User");
    	userregistrationservice.save(form);
    	return "registrationform";
    }
    
}