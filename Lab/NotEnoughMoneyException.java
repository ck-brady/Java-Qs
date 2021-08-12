public class NotEnoughMoneyException extends IllegalStateException{
	
	// instance variables
	private double amount = 0.0;
	private double balance = 0.0;
	private double missingAmount = 0.0;

	public NotEnoughMoneyException(double amount, double balance){
		super("Cannot withdraw more than balance available.");
        this.amount = amount;
		this.balance = balance;
		this.missingAmount = amount - balance;
	}
	
	public double getAmount(){
		return amount;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getMissingAmount(){
		return missingAmount;
	}

}