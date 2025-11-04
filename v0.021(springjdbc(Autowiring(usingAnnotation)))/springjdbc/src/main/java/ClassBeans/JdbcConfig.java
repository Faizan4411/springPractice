package ClassBeans;





import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"ClassBeans"})
public class JdbcConfig {
	
	@Bean("ds")
	public DataSource getDataSourse() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSourse());
		return jdbcTemplate;
	}
	
	@Bean("studentDao")
	public StudentDao getStudentDao() {
		
		StudentDaoImpl studentDao=new StudentDaoImpl();
		studentDao.setJdbcTemplate(getTemplate());
		
		return studentDao;
	}
	
	

}













