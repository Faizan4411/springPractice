package ClassBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("address2")
	private Address address;

	public Address getAddress() {
		return address;
	}
	
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
		return ""+address;
	}
	
	
	

}
