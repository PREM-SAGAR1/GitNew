package practice;

public class Emp21 {
	
	int eno;
	String ename;
	
	
	
	
	public Emp21(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}


	public void Display()
	{
	
		System.out.println("EMPID  :"+eno+" "+"ENAME  :"+ ename);
	}
	

	public static void main(String[] args) {
		
		Emp21 e = new Emp21(100,"babu");
		e.Display();

	}

}
