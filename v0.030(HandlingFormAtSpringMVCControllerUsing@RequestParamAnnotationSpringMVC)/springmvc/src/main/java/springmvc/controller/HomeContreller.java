package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeContreller {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home Url");
		model.addAttribute("name","Faizan Hussain");
		model.addAttribute("id",1133);
		
		List<String> friends=new ArrayList<String>();
		friends.add("Ali");
		friends.add("Hussain");
		friends.add("Adnan");
		friends.add("polka");
		
		model.addAttribute("f",friends);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is About Page..");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		System.out.println("this is help controller..");
		//creating model and view object
		ModelAndView modelAndView=new ModelAndView();
		//setting the data
		modelAndView.addObject("name","Aqib");
		modelAndView.addObject("rollnumber",123593);
		LocalDateTime now= LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		
		modelAndView.addObject("marks",list);
		
		//setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
	
}