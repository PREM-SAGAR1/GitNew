package icici.loans.carloans;

public class B extends A {
	
	public void m2()
	{
		System.out.println("i am m2 from B ");
	}
	
	public void m1()
	{
		System.out.println("i am overridden m1 from B ");
	}

	public static void main(String[] args) {
		
	 
		 A a = new A(); 
		  a.m1();
		  
		  B b = new B();
	  
	      b.m2();
	      b.m1();
	      
	      A obj = new B();
	      obj.m1();
	      
	  
	 
	  
	  
	

	}

}
