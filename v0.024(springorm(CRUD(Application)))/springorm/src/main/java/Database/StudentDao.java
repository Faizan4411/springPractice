package Database;



import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import ClassBeans.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student) {
		// insert
		
		int rows =(int)this.hibernateTemplate.save(student);
		return rows;
	}
	
	// get the single data(object)
	public Student getStudent(int studentId) {
		
		Student student= this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	
	// get All students(All rows)
	
	public List<Student> getAllStudent(){
		
		List<Student> student=this.hibernateTemplate.loadAll(Student.class);
		
		return student;
	}
	
	// deleting the data
	@Transactional
	public void deleteStudent(int studentId) {
		
		Student student=this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}
	
	//updating data...
	@Transactional
	public void updateStudent(Student student) {
		
		this.hibernateTemplate.update(student);;
		
	}
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
