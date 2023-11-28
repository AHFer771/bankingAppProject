package banking_app;

public class TransferAcc {
	private double balance;
	private String name;
	public TransferAcc(String name) {
		this.name = name;
	}
	public void depoist(double amount) {
		balance += amount;
	}
	public void transfer(double amount, TransferAcc account) {
		if (this.balance < amount) {
			System.out.println("INSUFFICENT FUNDS TO TRANSFER!");
		}
		else {
			this.balance -= amount;
			account.balance += amount;
			System.out.println("Balance in your " + this.name + " account is $" + this.balance);
			System.out.println("Balance in your " + account.name + " account is $" + account.balance);
		}
		
	}
	public double getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}
}
