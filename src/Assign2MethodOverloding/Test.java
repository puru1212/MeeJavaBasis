package Assign2MethodOverloding;

public class Test {

	public static void main(String[] args) {

		// create the child class of object
		// create the object of parent class
		
		VIT vitCol = new VIT(); 
		vitCol.machineLearning(); // calling Individual method
		College col = new College();
		
		
		
		//top casting with parent
		College col1 = new VIT();
		col1.medicalDept(); //Overridden
		col1.phdProgram(); //Inherited
		col1.engeneeringDept(); //Inherited
		
		//top casting with grand parents
		
		University uv = new MIT();
		uv.phdProgram();
		uv.convocationProgram();
		
		//down casting
		//Symbosis sys = (Symbosis)new College(); //ClassCastException
		
		
		Symbosis sys = new Symbosis();
		
		
		sys.PGDMProgram();
		Symbosis.BCA();
		
		
		
		
		
	}

}
