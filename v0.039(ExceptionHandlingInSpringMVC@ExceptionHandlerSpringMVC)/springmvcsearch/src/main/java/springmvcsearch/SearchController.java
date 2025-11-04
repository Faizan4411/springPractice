package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("this home page run seccessfully");
		String str=null;
		System.out.println(str.length());
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		
		String url="https://www.google.com/search?q"+query;
					
		RedirectView redirectView=new RedirectView();
		
		redirectView.setUrl(url);
		
		return redirectView;
		
	}
	
	// Handling exception in our spring mvc
	
//	@ExceptionHandler({NullPointerException.class , NumberFormatException.class})
//	@ExceptionHandler() this is all Exception Handler
	
	@ExceptionHandler({NullPointerException.class , NumberFormatException.class})
	public String exceptionHandlerNull() {
		
		System.out.print("Exception page .........");
		
		return "null_page";
	}
	
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NumberFormatException.class)
	public String exceptionHandlerNullNumberFormat() {
		
		System.out.print("Exception page .........");
		
		return "null_page";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandlerAll() {
		
		System.out.print("Exception page .........");
		
		return "null_page";
	}
	
	

}
