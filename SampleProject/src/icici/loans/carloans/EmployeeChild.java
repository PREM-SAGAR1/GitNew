package icici.loans.carloans;

public class EmployeeChild extends Employee2{
	
	
	String city;

	public EmployeeChild(String city) {
		
		super(9966,"babendra",35.14f);
		this.city = city;
		
		System.out.println(this.city);
	}

	
	public static void main(String[] args) {
		
		EmployeeChild ec = new EmployeeChild("hyderabad");
		
	}
	}

