
public class SavingsAccount extends Account {
  //Data fields
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated ;
	
	//Constructor
	public SavingsAccount(){
		dateCreated = new java.util.Date();
	}
	public SavingsAccount(int id,double balance){
		this.id = id;
		this.balance = balance;
		dateCreated = new java.util.Date();
	}
	
	//Accessor and mutator methods for id, balance, annualInterestRate
	public void setId(int id){
		this.id = id;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	//The accessor method for dateCreated
	public java.util.Date getDateCreated(){
		return dateCreated ;
	}
	//Return the monthly interest rate
	public double getMonthlyInterestRate(){
		return annualInterestRate/1200 ;
	}
	//Return the monthly interest
	public double getMonthlyInterest(){
		return balance*(annualInterestRate/1200);
	}
	//Withdraw a specified amount from the account
	public void withdraw(double amount){
		balance -= amount;
	}
	//Deposit a specified amount to the account
	public void deposit(double amount){
		balance += amount;
	}
	
	//Override the toString method defined in the superclass
	@Override
	//Display the total balance, monthly interest, date
	public String toString(){
		return super.toString();
	}
}