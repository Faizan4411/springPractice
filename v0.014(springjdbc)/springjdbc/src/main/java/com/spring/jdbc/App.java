package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    	
    	System.out.println("My program started......");
    	// Spring jdbc=> JdbcTemplate
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        
       JdbcTemplate template= context.getBean("jdbcTemplate",JdbcTemplate.class);
       
       //insert query
       String query="insert into student(student_id,student_name,city)values(?,?,?)";
       
       // file query
       int result=template.update(query,1,"Faizan Hussain","Jamshoro"); 
       
       System.out.println("number of resord insert: "+result);
       
       
       
    }
}
