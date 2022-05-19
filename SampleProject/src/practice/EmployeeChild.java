package practice;

public class EmployeeChild extends Employee2 {
	
	
	String city;
	
	
	public EmployeeChild(String city)
	
	{
		super(9966,"babendra",13.84f);
		this.city=city;
		System.out.println(this.city);
		
		
	}

	public static void main(String[] args) {
		
		EmployeeChild ec = new EmployeeChild("hyderabad");

	}

}
