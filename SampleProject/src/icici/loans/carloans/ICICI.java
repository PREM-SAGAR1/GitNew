package icici.loans.carloans;

public class ICICI implements Rbi,Rbi1   {

	public static void main(String[] args) {
		
		ICICI i = new ICICI();
		i.deposit();
		i.withdrawl();
		

	}

	@Override
	public void withdrawl() {
		System.out.println("iam overridden withdrawl in icici");
	}

	@Override
	public void deposit() {
		System.out.println("iam overridden deposit in icici");
		
	}

	@Override
	public void ministatement() {
		// TODO Auto-generated method stub
		
	}

}
