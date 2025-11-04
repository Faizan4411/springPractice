package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {
	
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
		return "success";
	}

}
