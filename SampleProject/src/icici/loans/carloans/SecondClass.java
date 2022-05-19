package icici.loans.carloans;

public class SecondClass {
	
	int a=100,b=200,result;

	
	public void add() {
		
		result = a+b;
		System.out.println("Add of A & B is : " + result);
	}
	
	public void sub() {
		result = a-b;
		System.out.println("Add of A & B is : "+ result);
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		
		SecondClass obj = new SecondClass();
		obj.add();
		obj.sub();
	}

}
