package springmvcsearch;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ControllerPath {
	
	@RequestMapping("/user/{userId}")
	public String getUser(@PathVariable("userId") int userId) {
		System.out.println(userId);
		
		return "home";
	}
	
	

}
