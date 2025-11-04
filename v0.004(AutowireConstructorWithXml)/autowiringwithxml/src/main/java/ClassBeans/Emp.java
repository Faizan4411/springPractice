package ClassBeans;

public class Emp {
	
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
		System.out.println("Inside Constructor");
	}

	@Override
	public String toString() {
		return "Emp [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
