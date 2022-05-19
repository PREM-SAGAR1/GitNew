package practice;

public class ICICI implements RBI {

	public static void main(String[] args) {
		
		
		ICICI e = new ICICI();
		e.withdrawl();
		e.withdrawl();
		

	}

	@Override
	public void withdrawl()
	{
		System.out.println(" i am overridden withdrawl in icici");
	}

	@Override
	public void deposit() 
	{
		System.out.println("i am overridden deposit in icici");
	}

}
