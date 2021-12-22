import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {

		Set<Integer> numbers = new TreeSet<>();
		
		System.out.println(numbers.add(42));
		System.out.println(numbers.add(9));
		System.out.println(numbers.add(4));
		
		for(int a : numbers) {
			System.out.println(a);
		}
	}

}
