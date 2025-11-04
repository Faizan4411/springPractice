package springmvcsearch;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice // all project Exception Handler annotation
public class MyExceptionHandler {
	

	
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
