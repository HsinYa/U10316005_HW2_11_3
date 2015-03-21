import java.util.Scanner;

public class Test {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("The Account:");
		System.out.print("ID: ");
		int id1 = input.nextInt();
		System.out.print("Balance: $");
		double balance1 = input.nextDouble();
		//Creates object of Account
		Account account = new Account(id1,balance1);
		System.out.print("Annual interest rate(%): ");
		double monthlyInterest1 = input.nextDouble();
		account.setAnnualInterestRate(monthlyInterest1);
		System.out.print("Withdraw: $");
		double withdraw1 = input.nextDouble();
		account.withdraw(withdraw1);
		System.out.print("Deposit: $");
		double deposit1 = input.nextDouble();
		account.deposit(deposit1);
		
		//Invokes account's toString()
		System.out.println(account.toString());
		System.out.println();
		
		
		System.out.println("The SavingsAccount:");
		System.out.print("ID: ");
		int id2 = input.nextInt();
		System.out.print("Balance: $");
		double balance2 = input.nextDouble();
		//Creates object of SavingsAccount
		SavingsAccount savingsAccount = new SavingsAccount(id2,balance2);
		System.out.print("Annual interest rate(%): ");
		double monthlyInterest2 = input.nextDouble();
		savingsAccount.setAnnualInterestRate(monthlyInterest2);
		System.out.print("Withdraw: $");
		double withdraw2 = input.nextDouble();
		savingsAccount.withdraw(withdraw2);
		System.out.print("Deposit: $");
		double deposit2 = input.nextDouble();
		savingsAccount.deposit(deposit2);
		
		//Invokes savingsAccount's toString()
		System.out.println(savingsAccount.toString());
		System.out.println();
		
		
		System.out.println("The CheckingAccount:");
		System.out.print("ID: ");
		int id3 = input.nextInt();
		System.out.print("Balance: $");
		double balance3 = input.nextDouble();
		//Creates object of CheckingAccount
		CheckingAccount checkingAccount = new CheckingAccount(id3,balance3);
		System.out.print("Annual interest rate(%): ");
		double monthlyInterest3 = input.nextDouble();
		checkingAccount.setAnnualInterestRate(monthlyInterest3);
		System.out.print("Withdraw: $");
		double withdraw3 = input.nextDouble();
		checkingAccount.withdraw(withdraw3);
		System.out.print("Deposit: $");
		double deposit3 = input.nextDouble();
		checkingAccount.deposit(deposit3);
		
		//Invokes checkingAccount's toString()
		System.out.println(checkingAccount.toString());
		System.out.println();
	}
}
