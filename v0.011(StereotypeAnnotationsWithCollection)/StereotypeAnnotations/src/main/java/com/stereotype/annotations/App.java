package com.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ClassBeans.Student;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        
    	ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
    	
    	Student student=con.getBean("ob",Student.class);
    	
    	System.out.println(student);
    	System.out.println(student.getAddress());
    	System.out.println(student.getAddress().getClass().getName());
    	
    }
}
