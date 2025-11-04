package ClassBeans;

import javax.sound.midi.Soundbank;

public class Samosa {
	private double price;

	public double getPrice() {
		
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Sitting Price ...");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init Method");
	}
	
	public void destroy() {
		System.out.println("Inside destory Method");
	}
	
	

}
