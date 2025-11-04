package ClassBeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

	public Emp(Address address) {
		super();
		this.address = address;
//		System.out.println("Inside Constructor");
	}

	@Override
	public String toString() {
		return "Emp [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
