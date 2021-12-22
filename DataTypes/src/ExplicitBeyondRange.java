
public class ExplicitBeyondRange {

	public static void main(String[] args) {
		
//		Explicit Type Casting Beyond the Range is to have look at the clock wise rotation when we try to convert the data types
//		Lets say int y = 130, the value of byte b is -126 due to clock wise rotation		
		
		int y = 130;
		byte b = (byte)y;
		
		System.out.println(b);
		
		int m = 612;
		byte n = (byte)m;
		System.out.println(n);
		
	}

}
