package practice;

public interface RBI {
	
	
	public void withdrawl();
	
	public void deposit();
	
	public static void main(String[] args) {
		
		
		RBI i;
		
		i=new HDFC();
		i.withdrawl();
		i.deposit();
		
		i=new ICIC();
		i.withdrawl();
		i.deposit();
	}

}
