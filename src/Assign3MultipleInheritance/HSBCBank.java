package Assign3MultipleInheritance;

public class HSBCBank extends BankManagement implements USBank, BrazilBank, UKBank {

	// USBank 
	@Override
	public void credit() {
		System.out.println("HSBC Bank Credit Method");
	}

	@Override
	public void debit() {
		System.out.println("HSBC Bank Debit Method");		
	}

	@Override
	public void loan() {
		System.out.println("HSBC Bank Loan Method");		
	}

	//BrazilBank
	@Override
	public void share() {
		System.out.println("HSBC Bank Share Method");		
	}

	@Override
	public void mutuleFund() {
		System.out.println("HSBC Bank Mutul Funds Method");		
	}

	
	//UK Bank
	@Override
	public void atm() {
		System.out.println("HSBC Bank ATM Method");		
		
	}

	@Override
	public void moneyTransfer() {
		System.out.println("HSBC Bank Money Transfer Method");		
		
	}

	//common method
	
	@Override
	public void educationLoan() {
		System.out.println("HSBC Bank Education Loan Method");		
		
	}
	
	// Individual method
	public void checkBook() {
		System.out.println("HSBC Cheque Book service");
	}

}
