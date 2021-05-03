package sportsmanagement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sportsmanagement.authentication.Login;

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
    
    
}