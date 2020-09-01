package car_dealership;

public class Employee {
	
	String ename="";
	String eid="";


	public void handleCustomer(Customer cust, Vehicle vehicle, boolean finance) {
		
		if(finance==true) {
			//Customer takes loan
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust,loanAmount);
		}
		else if(vehicle.getPrice() <= cust.getCashOnHand())
		{  
			//Customer pays by cash
			processTransaction(cust,vehicle);
		}
		else
		{
			System.out.println("Customer will need more money to buy vehicle: "+vehicle);
		}
		
	}


	 public void runCreditHistory(Customer cust,double loanAmount)
	 {
		 System.out.println("Running Credit History...");
		 System.out.println("Customer is approved for loan");
	 }

	 public void processTransaction(Customer cust,Vehicle vehicle) {
		 System.out.println("Customer has purchased the vehicle: " 
	     +vehicle +"for the price" + vehicle.getPrice());
	 }
}
