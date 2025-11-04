package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		
		m.addAttribute("Header","Learning programing");
		m.addAttribute("desc","Hoem for programmer");
		
	}
	 
	@RequestMapping("/contact")
	public String showForm() {
		
		System.out.println("this is Page Contact....");
		return "contact";
	}
	
	@RequestMapping(path="/processform",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		
			System.out.println(user);
			this.userService.createUser(user);
			
			
		return "success";
	}

}
