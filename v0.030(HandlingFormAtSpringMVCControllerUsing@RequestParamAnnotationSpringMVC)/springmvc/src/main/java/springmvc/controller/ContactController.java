package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("this is Page Contact....");
		return "contact";
	}
	
	@RequestMapping(path="/processform",method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String email,
			@RequestParam("userName") String userName,
			@RequestParam("password") String password, Model model) {
		
			System.out.println("user email: "+email);
			System.out.println("User Name: "+userName);
			System.out.println("user Password: "+password);
			
		
			model.addAttribute("name",userName);
			model.addAttribute("email",email);
			model.addAttribute("password",password);
			
		
		return "success";
	}

}
