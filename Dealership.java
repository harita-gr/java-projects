package car_dealership;

public class Dealership {

	public static void main(String[] args) {
	
		Customer cust1 = new Customer();
		
		cust1.setName("Tom");
		cust1.setAddress("202 Baker Street,Nashville");
		cust1.setCashOnHand(12000);
		
		Vehicle vehicle = new Vehicle("TH324","Honda",150000);
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp , false);
		
		Vehicle car = new Vehicle ("TH324","Honda",150000);
		
		System.out.println(car.equals(vehicle));

	}

}
