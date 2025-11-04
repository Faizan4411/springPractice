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
	
	@Override
	public int change(Student student) {
		// updating data
		String query="update student set student_name=?, city=? where student_id=?";
		int row = this.jdbcTemplate.update(query,student.getStudentName(),student.getCity(),student.getStudentId());
		
		return row;
	}
	
	@Override
	public int dalete(int studentId) {
		
		String query="delete from student where student_id=?";
		int row=this.jdbcTemplate.update(query,studentId);
		return row;
	}
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	
	
	

	
	
}
