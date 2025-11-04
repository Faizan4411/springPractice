package com.spring.orm.springorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

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
    	
//    	Student student=new Student(5,"Faizan Hussain","Jamshoro"); 
//    	
//    	int r=studentDao.insert(student);
//    	System.out.println("Add Record: "+r);
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean condition=true;
        while(condition) {
	          System.out.println("Press 1 for Add new Student ");
	          System.out.println("Press 2 for  display all student ");
	          System.out.println("Press 3 for detail of single student  ");
	          System.out.println("Press 4 for delete students ");
	          System.out.println("Press 5 for update student  ");
	          System.out.println("Press 6 for  Exit ");
	         
	          try {
	        	  int input=Integer.parseInt(br.readLine());
	        	  
	        	  switch(input) {
	        	  		case 1: 
	        	  			//  1 for Add new Student start
		        	  			System.out.print("Enter Id Number: ");
		        	  			int uId=Integer.parseInt(br.readLine());
		        	  			
		        	  			System.out.print("Enter User Name: ");
		        	  			String uName=br.readLine();
		        	  			
		        	  			System.out.print("Enter User City Name: ");
		        	  			String uCity=br.readLine();
	        	  			
			        	        Student student=new Student(uId,uName,uCity);
			        	        int r= studentDao.insert(student);
			        	        System.out.println("Add Record: "+r);
			        	        System.out.println("******************************************** ");
			        	        System.out.println();
	        	  			//  1 for Add new Student end
	        	  			break;
	        	  			
	        	  		case 2:
	        	  			// 2 for  display all student start
	        	  				List<Student> allStudent=studentDao.getAllStudent();
	        	  				for(Student st : allStudent) {
	        	  					System.out.println("Student Id: "+st.getStudentId());
	        	  					System.out.println("Student Name: "+st.getStudentName());
	        	  					System.out.println("Student City:  "+st.getStudentCity());
	        	  					System.out.println();
	        	  				}
	        	  				 System.out.println("******************************************** ");
				        	     System.out.println();
	        	  			// 2 for  display all student end
	        	  			break;
	        	  			
	        	  		case 3:
	        	  			// 3 for detail of single student start
		        	  			System.out.println("Enter Id Number: ");
		        	  			int userId=Integer.parseInt(br.readLine());
		        	  			Student student1=studentDao.getStudent(userId);
		        	  			System.out.println("Student Id: "+student1.getStudentId());
      	  					System.out.println("Student Name: "+student1.getStudentName());
      	  					System.out.println("Student City:  "+student1.getStudentCity());
      	  					System.out.println("******************************************** ");
				        	     System.out.println();
		        	  			
	        	  			// 3 for detail of single student end
	        	  			break;
	        	  			
	        	  		case 4:
	        	  			// 4 for delete students start
	        	  			System.out.println("Enter Id Number: ");
	        	  			int Id=Integer.parseInt(br.readLine());
	        	  			studentDao.deleteStudent(Id);
	        	  			System.out.println("Student Delete ");
	        	  			System.out.println("******************************************** ");
			        	     System.out.println();
	        	  			// 4 for delete students end
	        	  			break;
	        	  			
	        	  		case 5:
	        	  			// 5 for update student start
	        	  			System.out.print("Enter Id Number: ");
	        	  			int uId2=Integer.parseInt(br.readLine());
	        	  			
	        	  			System.out.print("Enter User Name: ");
	        	  			String uName2=br.readLine();
	        	  			
	        	  			System.out.print("Enter User City Name: ");
	        	  			String uCity2=br.readLine();
      	  			
		        	        Student student2=new Student(uId2,uName2,uCity2);
		        	        
		        	        studentDao.updateStudent(student2);
		        	        System.out.println("Update Record: ");
		        	        System.out.println("******************************************** ");
		        	        System.out.println();
	        	  			
	        	  			// 5 for update student end
	        	  			break;
	        	  		case 6: condition=false;break;
	        	  		default:System.out.println("Pls Enter value 1 to 6 between");
	        	  
	        	  }
	        	  
	        	  
				
				} catch (Exception e) {
					System.out.println("App.java in error check the app.java file....");
					System.out.println(e.getMessage());
				}
	          
        }
        System.out.println("End of loop...");
    	
    	
    }
}
