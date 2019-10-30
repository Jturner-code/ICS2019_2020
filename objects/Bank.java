public class Bank{
	private double balance;
	public Bank(){
		this.balance = 0;
	}
	public Bank (double intiBalance){
		this.balance = intiBalance;
	}
	
	public double getBalance(){
		return this.balance;
	}
	public void setBalance(double in){
		this.balance = in;
	}
	
	public void deposit(double amt){
		this.balance += amt;
	}
	public boolean withdraw(double amt){
		if (this.balance< amt){
			return false;
		} else{
		this.balance -= amt;
		return true;
		}
	}
	public String toString(){
		return String.format("You have % 6f fn\n", this.balance);
	}
	public static boolean transfer(Bank source,Bank target, double amt){
		if (source.withdraw(amt)){
			target.deposit(amt);
			return true;
		}else{
			return false;
		}
	
	}
}
