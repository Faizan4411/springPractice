package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import ClassBeans.Student;
import ClassBeans.StudentDao;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    	
    	System.out.println("My program started......");
    	// Spring jdbc=> JdbcTemplate
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        
      StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
   //-----------------insert data start----------------------------    
//       Student student=new Student();
//       
//       student.setStudentId(2);
//       student.setStudentName("ali");
//       student.setCity("Society");
//       
//       int resutl=studentDao.insert(student);
//       
//       System.out.println(resutl);
      
    //-----------------insert data End----------------------------
      
    //-----------------update data start----------------------------
      
//      Student student=new Student();
//      
//      student.setStudentId(2);
//      student.setStudentName("Hussain");
//      student.setCity("Hyd");
//      
//      int update=studentDao.change(student);
//      
//      System.out.println("Update student record : "+update);
      
    //-----------------insert data End----------------------------
      
      
      
      int rows=studentDao.dalete(2);
      
      System.out.println("delete Record: "+rows);
      
      
      
      
      
      
      
      
      
      
       
    }
}
