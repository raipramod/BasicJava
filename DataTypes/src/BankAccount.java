
public class BankAccount {
	
//	Declare static variables
	static String bankName = "Wells Fargo";
	
//	Declare Non Static variable
	String accountHolderName;
	String accountNumber;
	float balance;

	public static void main(String[] args) {
		
//		Declare and initialize local data type inside the main method 
		double loanInterestRate = 5.2;
		System.out.println(loanInterestRate);
		
		System.out.println(BankAccount.bankName);
		
		BankAccount bankAccount = new BankAccount();
		bankAccount.accountHolderName = "Rai";
		bankAccount.accountNumber = "122233";
		bankAccount.balance = 222.22f;
		
		System.out.println(bankAccount.accountHolderName);
		System.out.println(bankAccount.balance);
		System.out.println(bankAccount.accountNumber);
		
	}

}
