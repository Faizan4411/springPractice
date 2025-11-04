package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import ClassBeans.JdbcConfig;
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
        ApplicationContext context= new AnnotationConfigApplicationContext(JdbcConfig.class);
        
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
      
    //-----------------delete data start----------------------------
      
      
//      int rows=studentDao.dalete(2);
//      
//      System.out.println("delete Record: "+rows);
      
    //-----------------delete data End----------------------------
      
    //-----------------select one data start----------------------------
      
//      Student student =studentDao.getStudent(1);
//      System.out.println(student);
//      
      
      //-----------------select one data End----------------------------
      
      
       
      //-----------------All Select data start----------------------------
      
      List<Student> students=studentDao.getAllStudentes();
      
      for(Student s : students) {
    	  
    	  System.out.println(s);
      }
      
      
      //-----------------All Select data start----------------------------
      
      
      
      
      
      
      
      
      
      
      
    }
}
