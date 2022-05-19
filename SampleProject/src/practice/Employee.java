package practice;

public class Employee {
	
	int eno;
	String ename;
	float sal;
	
	
	public Employee() 
	{
		System.out.println(" i am default constructor");
	}
	
	 public Employee(int eno) {
	 
	 
	 this.eno=eno;
	 }
	 
	 
	 
	public Employee(int eno,String ename) 
	{
		this. eno =eno;
		this.ename=ename;
	}
	
	public Employee(int eno,String ename,float sal) {
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		
		
		
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		System.out.println(e1.eno);
		System.out.println(e1.ename);
		
		
		Employee e2 = new Employee(7777);
		System.out.println(e2.eno);
		System.out.println(e2.ename);
		
		Employee e3 = new Employee(7777,"babu");
		System.out.println(e3.eno);
		System.out.println(e3.ename);
		
		Employee e4 = new Employee(7777,"babu",13.84f);
         System.out.println(e4.eno);
         System.out.println(e4.ename);
         System.out.println(e4.sal);
	}

}
