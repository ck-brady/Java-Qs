public class Account{

	// instance variables
	private double balance;
	
	// constructor 
	public void Account(){
		this.balance = 0;
	}
	
	// methods
	public void deposit(double amount){
		balance = balance + amount;
		System.out.print("New balance: " + balance);
	}
	
	public void withdraw(double amount) throws NotEnoughMoneyException{
		if(amount > balance){
			throw new NotEnoughMoneyException(amount, balance);
		} else {			
			balance = balance - amount;
			System.out.print("New balance: " + balance);
		}
	}
	
	public double getBalance(){
		return balance;
	}

}