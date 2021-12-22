
public class Multithread extends Thread {

	public static void main(String[] args) throws InterruptedException {

		Multithread mt = new Multithread();
		mt.start();
		
	for(int q = 0; q<=10; q++)	{
		System.out.print("q: " +q + "\t");
		Thread.sleep(1000);
	}
	}
	
	public void run() {
		for(int p = 1;p<=10; p++) {
		System.out.print("p : " + p + "\t");	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Child thread");
		}
		}
	}

}
