package practice;

public class B extends A{
	
	
	public void m2() 
	
	{
		System.out.println("i am m2 from B");
		
	}

	public static void main(String[] args) {
		
		A a = new A();
		a.m1();
		
		B b = new B();
		b.m2();
		
		
		
		
		
		

	}

}
