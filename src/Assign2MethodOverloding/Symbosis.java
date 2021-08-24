package Assign2MethodOverloding;

public class Symbosis extends College {
	
	
	
	//College Overridden methods
	
	@Override
	public void engeneeringDept() {
		System.out.println("Symbosis -- Engeneering Department");
	}

	@Override
	public void scienceDept() {
		System.out.println("Symbosis -- Science Department");
	}
	
	@Override
	public void medicalDept() {
		System.out.println("Symbosis -- Medical Department");
	}
	
	// individual methods
	
	public void mbaProgram() {
		System.out.println("Symbosis -- MBA Program");
	}
	
	
	
	public final void PGDMProgram() {
		System.out.println("Symbosis -- PGDM Program");
	}
	
	public static void BCA() {
		System.out.println("Symbosis -- BCA Program");
	}
	public void MCA() {
		System.out.println("Symbosis -- MCA Program");
	}
	private void BBA() {
		System.out.println("Symbosis -- BBA Program");
	}
	
}
