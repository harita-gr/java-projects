package car_dealership;

public class Customer {
	
	String name="";
	String address="";
	double cashOnHand;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		address+= "Dealership City";
		this.address = address;
	}
	public double getCashOnHand() {
		return cashOnHand;
	}
	public void setCashOnHand(double cashOnHand) {
		cashOnHand+=500;
		this.cashOnHand = cashOnHand;
	}
	
	public void purchaseCar(Vehicle v, Employee emp,boolean finance) {
		
		emp.handleCustomer(this, v, finance);
	}
	
	
}
