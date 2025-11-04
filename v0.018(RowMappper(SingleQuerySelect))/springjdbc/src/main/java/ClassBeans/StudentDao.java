package ClassBeans;

public interface StudentDao {
	
	public int insert(Student student);
	public int change(Student student);
	public int dalete(int studentId);
	public Student getStudent(int studentId);

}
