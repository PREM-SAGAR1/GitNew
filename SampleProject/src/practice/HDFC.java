package practice;

public class HDFC implements RBI {
	

	public static void main(String[] args) {
		
		
		HDFC h = new HDFC();
		h.withdrawl();
		h.deposit();
		

	}

	@Override
	public void withdrawl() {
		System.out.println(" i am overridden withdrawl in HDFC");
		
	}

	@Override
	public void deposit() {
System.out.println("I AM overridden deposit in HDFC");		
	}

}
