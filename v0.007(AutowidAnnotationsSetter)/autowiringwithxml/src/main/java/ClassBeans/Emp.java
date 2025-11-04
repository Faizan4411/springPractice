package ClassBeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
	
	private Address address;

	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		System.out.println("Setting value..");
		this.address = address;
	}
	
	
	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor");
	}
	
	

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
