package Assign2MethodOverloding;

public class VIT extends College{

	// Override from College
	
	@Override
	public void medicalDept() {
		System.out.println("VIT -- Medical Department");
	}
	
	@Override
	public void researchDept() {
		System.out.println("VIT -- Research Department");
	}
	
	@Override
	public void sportzDept() {
		System.out.println("VIT -- Sprts Department");
	}
	
	// Individual  from College
	
	public void machineLearning() {
		System.out.println("VIT -- Machine learnign program");
	}
	
	public void artificialIntelligence() {
		System.out.println("VIT -- Artificial Intelligence Program");
	}
	
}
