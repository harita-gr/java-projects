package car_dealership;

public class Vehicle {
	
	private String modelNo="";
	private String name="";
	private double price;
	
	
	public Vehicle(String modelNo, String name, double price) {
		super();
		this.modelNo = modelNo;
		this.name = name;
		this.price = price;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}
		
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Vehicle [modelNo=" + modelNo + ", name=" + name + ", price=" + price + "]";
	}

}
	