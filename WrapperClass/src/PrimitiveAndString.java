
public class PrimitiveAndString {

	public static void main(String[] args) {
		
//		In this method, we convert the primitive data types to string and string to primitive data types
		
		byte x = 100;
		
		String s = Byte.toString(x);
		byte y = Byte.parseByte(s);
	}

}
