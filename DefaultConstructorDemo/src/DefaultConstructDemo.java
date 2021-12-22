
public class DefaultConstructDemo {
	
	int num;
	
//	This is default constructor's example in the comment section
	
//	DefaultConstructDemo(){
//		System.out.println("Inside the Default Constructor !");
//	}
//	
	{
		System.out.println("Inside the Non static Block");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside the main method");
		new DefaultConstructDemo();
		new DefaultConstructDemo();
		new DefaultConstructDemo();
	}
	
	static {
		System.out.println("Inside the static block");
	}
	
}
