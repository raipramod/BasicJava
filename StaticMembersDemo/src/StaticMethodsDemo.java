
public class StaticMethodsDemo {

	public static void main(String[] args) {
		System.out.println("Hello Method");
	    StaticMethodsDemo.method();
		
	}
//	Declare the static methods
	static void method() {
		System.out.println("Inside Method 1");
	}
	
//	Declare the static block
	static {
		System.out.println("Declare the Static Block");
		StaticMethodsDemo.method();
	}

}