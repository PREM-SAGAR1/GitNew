package practice;

public class Calculations {
	
	
	int a,b,result;

	public Calculations(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	
	public void add() 
	{
		result= a+b;
		System.out.println("Addition of A & B is :"+ result);
	}
	
	public void sub() 
	{
		result= a-b;
		System.out.println("Subtraction of A & B is :"+ result);
	}

	public static void main(String[] args) {
		
		Calculations c = new Calculations(25, 45);
		
		c.add();
		c.sub();
		
		

	}

}
