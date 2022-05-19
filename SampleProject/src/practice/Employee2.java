package practice;

public class Employee2 {
	
	int eno;
	String ename;
	float sal;
	
	
	public Employee2()
	{
		System.out.println("i am default constructor");
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}
	
	public Employee2(int eno) 
	{
		
		this(); 
		
		this.eno = eno;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
		
		
	}
	
	public Employee2(int eno,String ename)
	{
		this(eno);
		
		this.eno=eno;
		this.ename=ename;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}
	
	public Employee2(int eno,String ename,float sal)
	
	{
		this(eno,ename);
		
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
		
	}
	
	

	public static void main(String[] args) {
		
		Employee2 e4 = new Employee2(9966,"babendra",13.84f);

	}

}
