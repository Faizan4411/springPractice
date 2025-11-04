package com.lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ClassBeans.Example;
/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    	
    	AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
      
    	Example example=(Example)context.getBean("example");
    	
    	System.out.println(example);
    	
    	
    }
}
