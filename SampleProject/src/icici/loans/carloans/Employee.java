package icici.loans.carloans;

public class Employee {
	
	int eno;
	String ename;
	
	public Employee() {
		
		System.out.println("iam default constructor");
		
	}
	
	public Employee(int i , String string) {
		
		eno =i;
		ename= string;
		
	}
	
	

	public static void main(String[] args) {
		
      Employee e1 = new Employee();
      
      System.out.println(e1.eno);
      System.out.println(e1.ename);
      
       Employee e2 = new Employee(1777,"babu");
       
       System.out.println(e2.eno);
       System.out.println(e2.ename);
		
	}

}
