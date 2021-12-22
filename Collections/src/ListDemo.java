import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> myDailyWork = new ArrayList<>();
		
		myDailyWork.add("Wake in the 6 A.M");
		myDailyWork.add("Go to Morning Walk");
		myDailyWork.add("Make Beakfast");
		
		for(String s : myDailyWork) {
			
			System.out.println(s);
		}
	}

}
