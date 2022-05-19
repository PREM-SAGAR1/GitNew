package icici.loans.carloans;

public class Employee1 {
	
	int eno;
	String ename;
	float sal;
	 
	 public Employee1() {
		 
		 System.out.println("i am default constructor");
	 }
	 
	 public Employee1(int eno) {
		 
		 this.eno=eno;
	 }
	 
	 public Employee1(int eno,String ename) {
		 
		 this.eno= eno;
		 this.ename =ename;
		 
	 }
	 
	 public Employee1(int eno,String ename,Float sal) {
		 this.eno=eno;
		 this.ename=ename;
		 this.sal=sal;
	 }

	public static void main(String[] args) {
		
		Employee1 e1 =new Employee1();
		
		
		Employee1 e2 =new Employee1(505);
		System.out.println(e2.eno);
        
		  Employee1 e3 = new Employee1(5055,"babu");
		  System.out.println(e3.eno);
		  System.out.println(e3.ename);
		  
		   Employee1 e4 = new Employee1(9966,"babendra",35.14f);
		   System.out.println(e4.eno);
		   System.out.println(e4.ename);
		   System.out.println(e4.sal);
		  
		 	}
	}


