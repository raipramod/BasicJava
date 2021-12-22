public class StaticBlockDemo {

	public static void main(String[] args) {
		System.out.println("Hello world, This is my first class executed!");
	}
	
// Declare the static block 
	static{
		System.out.println("Static Block 1");
	}
	
	static{
		System.out.println("Static Block 2");
	}
}
