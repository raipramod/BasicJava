import java.util.Set;
import java.util.TreeSet;

public class SetDemo
{
	public static void main(String[] args) {
		
		Set<Integer> values = new TreeSet<>();
		
		System.out.println(values.add(7));
		System.out.println(values.add(52));
		System.out.println(values.add(8));
		System.out.println(values.add(17));
		
		for(int i : values) {
			System.out.println(i);	
		}
		
	}
}

