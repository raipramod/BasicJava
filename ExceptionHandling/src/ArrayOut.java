import java.util.Iterator;

public class ArrayOut {

	public static void main(String[] args) {

		int arr[] = {10,20,30, 40};
		try {
		System.out.println("Element of Array is:");
		for(int i = 0; i<= arr.length; i++) {
			System.out.println(arr[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please Do NOT Show me ugly Mesage!");
		}
		
		System.out.println("Hello Java");
	}

}