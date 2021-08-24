
public class FunctionsInJava {

	
	public int sum(int a, int b) {
		
		System.out.println("Addition of "+ a+" & "+b + " is : ");
		int c = a+b;
		return c;
		
	}
	
	//input is Name(String) and out put is marks of student
	

	public int getMarks(String studentName) {
		
		System.out.println("Marks of "+ studentName+ " is as follows: " );
		
		int marks = -1;
				
		if (studentName.equals("Sachin")) {
			marks =80;
			System.out.println("Out of 100 marks he has received : ");
		}
		else if (studentName.equals("Naveen")) {
			marks=85;
			System.out.println("Out of 100 marks he has received: ");
		}
		else if (studentName.equals("Puru")) {
			marks=100;
			System.out.println("Out of 100 marks he has received: ");
		}
		else if (studentName.equals("Tom")) {
			marks= 95;
			System.out.println("Out of 100 marks he has received: ");
		}
		else{
			System.out.println("This student is not in our school");
			
		}	
			
		if (marks==100) {	System.out.println("This is the topper of the class");
		
		}
		
		if (marks<85) {
			System.out.println("Your student needs to study hard");
		}else if(marks>=85) {
			System.out.println("Your student is performing good");
		}else  {
			
		}
			
		return marks;
		
			

				
		
	}
	
	
	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		
//		int d = obj.sum(30, 40);
//		System.out.println(d);
//		
//		System.out.println(obj.sum(80, 90));
		
		int z = obj.getMarks("dachin");
		System.out.println(z);
		
				
	}

}
