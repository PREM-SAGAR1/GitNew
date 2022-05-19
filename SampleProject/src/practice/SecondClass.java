package practice;

public class SecondClass {
	
	int a=100,b=200,result;
	
	
	public void add()
	{
	result = a+b;
	System.out.println("Addition of A & B is : "+result);
	}
	
	public void sub()
	
	{
		result = a-b;
		System.out.println("Subtraction of A & B is :" +result);	
	}

	public static void main(String[] args) {
		
		SecondClass s= new SecondClass();
		
		s.add();
		s.sub();

	}

}
