package ClassBeans;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao  {

	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insert(Student student) {
		
		//insert query
	    String query="insert into student(student_id,student_name,city)values(?,?,?)";
	    int r = this.jdbcTemplate.update(query,student.getStudentId(),student.getStudentName(),student.getCity());
	    
		
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

	
	
}
