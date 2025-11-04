package springmvcexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeContreller {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("this home page run seccessfully");
		return "home";
	}
	
	// handling for request
	@RequestMapping("/welcome")
	public String welcome(@RequestParam("user") String name, Model m) {
		System.out.println("Name is :"+name);
		m.addAttribute("name",name);
					
		
		return "welcome";
	}

}
