public class NonStaticMembersDemo {
	
	int num;
	
	NonStaticMembersDemo(){
		System.out.println("Inside the Constructor");
	}
	
	{
		System.out.println("Inside the Block");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside the main method");
		new NonStaticMembersDemo();
	}

}