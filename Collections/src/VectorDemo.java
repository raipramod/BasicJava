import java.util.Vector;

public class VectorDemo {
	
//	vector is dynamic array

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(3);
		v.add(2);
		v.add(5);
		v.add(3);
		v.add(2);
		v.add(5);
		v.add(3);
		v.add(2);
		v.add(5);
		v.add(3);
		v.add(2);
		v.add(5);
		
		System.out.println(v.capacity());
		
	}

}
