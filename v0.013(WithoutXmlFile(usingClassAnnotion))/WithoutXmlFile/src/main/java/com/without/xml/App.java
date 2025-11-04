package com.without.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ClassBeans.JavaConfig;
import ClassBeans.Student;



/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        
    	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
    	
    	Student student=context.getBean("student",Student.class);
    	System.out.println(student);
    	student.study();
    }
}
