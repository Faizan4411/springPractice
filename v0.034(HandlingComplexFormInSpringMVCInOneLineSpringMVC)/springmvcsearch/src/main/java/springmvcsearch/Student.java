package springmvcsearch;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {

	private String name;
	private Long id;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date;
	private List<String> courses;
	private String gender;
	private String stdtype;
	
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStdtype() {
		return stdtype;
	}
	public void setStdtype(String stdtype) {
		this.stdtype = stdtype;
	}
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", date=" + date + ", courses=" + courses + ", gender=" + gender
				+ ", stdtype=" + stdtype + ", address=" + address + "]";
	}
	

	
	
	
}
