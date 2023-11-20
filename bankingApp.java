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
						System.out.println("INVALID CHOICE");
						System.out.println("Select New [1] or Existing [2]");
						choice = sc.nextInt();
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
				 int accountChoice;
				 double checkingBalance = 0.00;
				 double savingsBalance = 0.00;
				 
				 while(true) {
					 System.out.println("Hello "+ userName +  "! Which account would you like to access?");
					 	System.out.println("Checking    [1]");
					 	System.out.println("Savings     [2]");
					 	System.out.println("Investments [3]");
					 	System.out.println("LOG OFF     [4]");
					 	accountChoice = sc.nextInt();
					 	
					 	
					 	switch(accountChoice) {
					 		case 1:
					 			accountMenu(userName, "Checking", checkingBalance, sc);
					 			break;
					 		case 2:
					 			accountMenu(userName, "Savings", savingsBalance, sc);
					 			break;
					 		case 3:
					 			investmentChoice(userName, "Investments", sc);
					 			break;
					 		case 4:
					 			System.out.println("LOGING OFF...");
					 			System.out.println("Thank you for banking with Infinite Capital!");
					 			System.out.println("See you again soon!");
								System.exit(0);
					 		default:
					 			System.out.println("Invalid Choice!");
					 			break;
					 	}
					 }
			}
	 		public static void investmentChoice(String userName, String accountType, Scanner sc) {
	 			int selection;
	
	 			System.out.println("-------------INVESTMENTS-------------");
	 			System.out.println("$ICBNK   -(Infinte Capital)-   +5000%");
	 			System.out.println("$MSFT      -(Microsoft)-       -1.68%");
	 			System.out.println("$AAPL        -(Apple)-         -0.02%");
	 			System.out.println("$TSLA        -(Tesla)-         +0.71%");
	 			System.out.println("$AMZN        -(Amazon)-        +1.65%");
	 			System.out.println("$GOOGL       -(Google)-        -1.18%");
	 			System.out.println("$NVDA        -(NVIDIA)-        -0.37%");
	 			System.out.println("$META    -(Meta Platforms)-    +0.25%");
	 			System.out.println("     Press [4] to switch accounts    ");
		
	 			selection = sc.nextInt();
	 			if(selection == 4) {
			return;
	 			}
	 		}
	 		public static void accountMenu(String userName, String accountType, double balance, Scanner sc) {
				int choice;
				while(true){
					System.out.println("      "+accountType);
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
							return;
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
