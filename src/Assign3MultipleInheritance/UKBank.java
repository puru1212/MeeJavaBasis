package Assign3MultipleInheritance;

public interface UKBank {
	
	public void atm();
	
	public void moneyTransfer();
	
	public void educationLoan();
	
	
	//after jdk 1.8
	//1. we can have static method with method bosy
	
	public static void challan() {
		System.out.println("challan method ");
	}

	
	//2. we can have  default method
	
	default void onLineBanking() {
		System.out.println("Online Banking Method");
	}
}
