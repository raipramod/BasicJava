import java.util.Scanner;

public class Division {

	public static void main(String[] args) {

		
		int a,b,c;
		
		try {
		System.out.println("Enter the Two Integers:");
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		b = obj.nextInt();
		c = a/b;
		System.out.println("The Result is " + c);
		}catch(ArithmeticException e) {
			System.out.println("Please Exit the Program!");
		}finally {
			System.out.println("Finally");
		}
		
		System.out.println("hello java");
	}

}
