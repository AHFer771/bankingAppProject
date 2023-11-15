package banking_app;
import java.util.Scanner;

public class bankingApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
					//Change: instead of just pressing 1  to continue you now have some choices, changed formatting
					System.out.println("Welcome to Infinite Capital!"); //added bank title
					System.out.println("For New Customers press       [1]"); //added
					System.out.println("For returning customers press [2]");
				
				int choice = sc.nextInt();
				
				if(choice != 1 && choice!=2) { //change: added choice 2
						sc.close();
						return;
					}
				
				 
				String userName = "";
				String passWord = "";
				
				 if(choice == 1) {
					System.out.println("Create your username: ");
					userName = sc.next();
					System.out.println("Create your password: ");
					passWord = sc.next();
				} else {
				 if(choice == 2){
				 	System.out.println("Please enter your username and password");
				 	System.out.println("User-name: ");
				 	userName = sc.next();
				 	System.out.println("Password:  ");     
				 	passWord = sc.next();
				 }
				 }
				
				
				// added so user can decide which account they would like to access
					System.out.println("Hello "+userName+  "! Which account would you like to access?");
				 	System.out.println("Checking    [1]");
				 	System.out.println("Savings     [2]");
				 	System.out.println("New account [3]");
				 	choice = sc.nextInt();
				 	
				
				 double balance = 0.00;
				while(true) {
					//IDEA: display which account the user is currently using
					//Change: the formatting
					System.out.println("WELCOME "+userName);
					System.out.println("Check balance  [1]");
					System.out.println("Deposit funds  [2]");
					System.out.println("Withdraw funds [3]");
					System.out.println("Transfer money [4]");
					System.out.println("Switch account [5]"); //changed from 'new' to 'switch' account
					System.out.println("Log off        [6]");
					System.out.println("Press 1-6:  ");
					
					choice = sc.nextInt();
					
					switch(choice) {
					
						case(1):
							
							showBalance(balance);
							
							break;
						case(2):
							System.out.println("Please enter the amount you would like to deposit: ");
							double depositAmount = sc.nextDouble();
							balance = depositFunds(balance, depositAmount);
							break;
						case(3):
							System.out.print("Please enter the amount you would like to withdraw: ");
							double withdrawAmount = sc.nextDouble();
							balance = withdrawFunds(balance, withdrawAmount);
							break;
						case(4):
							System.out.println("Please enter the transfer amount");
							
							break;
						case(5):
							
							
							break;
						case(6):
							System.out.println("You are logged off.");
							System.exit(0);
						default:
							System.out.println("Invalid input! Pick 1-6: ");
					}
					
				}
					
				
			}
			
			
			public static void showBalance(double balance) {
				System.out.println("This is your balance: "+balance);
			}
			public static double depositFunds(double balance, double amount) {
				balance += amount;
				System.out.println("Amount Deposited: "+amount);
				return balance;
			}
			public static double withdrawFunds(double balance, double amount) {
				if(amount > balance) {
					System.out.println("INSUFFICENT FUNDS");
				}else{
					balance -= amount;
					System.out.println("Amount withdrawn: "+ amount);
				}
				return balance;
				}
			
				
			
}
