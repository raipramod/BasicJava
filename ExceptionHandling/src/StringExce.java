
public class StringExce {

	public static void main(String[] args) {

		String s = "abcd";
		try {
		int i = Integer.parseInt(s);
		}catch(NumberFormatException e) {
			System.out.println("Please Exit the Program!");
		}
				
	}

}
