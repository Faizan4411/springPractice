package com.spring.orm.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ClassBeans.Student;
import Database.StudentDao;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
    	
    	Student student=new Student(5,"Faizan Hussain","Jamshoro"); 
    	
    	int r=studentDao.insert(student);
    	System.out.println("Add Record: "+r);
    	
    }
}
