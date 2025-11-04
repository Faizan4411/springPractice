package com.spel;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.Expression;


import ClassBeans.Demo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
       
    	ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
    	
    	Demo demo=con.getBean("demo",Demo.class);
    	
    	System.out.println(demo);
    	
    	SpelExpressionParser temp=new SpelExpressionParser();
    	Expression expression =temp.parseExpression("22+44");
    	System.out.println(expression.getValue());
    	
    }
}
