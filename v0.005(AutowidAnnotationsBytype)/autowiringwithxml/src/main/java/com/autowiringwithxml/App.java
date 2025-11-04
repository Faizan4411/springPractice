package com.autowiringwithxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ClassBeans.Emp;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
       
    ApplicationContext	context=new ClassPathXmlApplicationContext("config.xml");
        
    Emp emp1=context.getBean("emp1",Emp.class);
    
    System.out.println(emp1);
    
    
    }
}
