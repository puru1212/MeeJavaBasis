package Assign2MethodOverloding;

public class MIT extends College {
	
	
	
	// College Overridden method
	
	
	@Override
	public void engeneeringDept() {
		System.out.println("MIT -- Engeneering Department");
	}

	@Override
	public void scienceDept() {
		System.out.println("MIT -- Science Department");
	}
	
	@Override
	public void medicalDept() {
		System.out.println("MIT -- Medical Department");
	}
	
	@Override
	public void researchDept() {
		System.out.println("MIT -- Research Department");
	}
	
	
	// Individual method
	
	public void techEvents() {
		System.out.println("MIT -- Technical event Program");
	}
	
	
	
}


