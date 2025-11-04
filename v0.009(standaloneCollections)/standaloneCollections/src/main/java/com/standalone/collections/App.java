package com.standalone.collections;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ClassBeans.Person;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Person person=(Person)context.getBean("person1");
    
		System.out.println(person.getFriends());
		System.out.println(person.getFriends().getClass().getName());
		System.out.println("------------------------------------------------------");
		System.out.println(person.getFeestructure());
		System.out.println(person.getFeestructure().getClass().getName());
		System.out.println("------------------------------------------------------");
		System.out.println(person.getProperties());
		System.out.println(person.getProperties().getClass().getName());
		
    }
}
