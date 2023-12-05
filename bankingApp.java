package banking_app;
import java.util.Scanner;

public class bankingApp {
public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	String userName = "";
	String passWord = "";
	boolean loggedIn = false;
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
	
	
	
		if(choice == 1) {
			System.out.println("Create your username: ");
			userName = sc.next();
			System.out.println("Create your password: ");
			passWord = sc.next();
			System.out.println("Account Successfully Created!");
		}
		//Change: Once user has created their account, they will be asked to login. Credentials have to match when user created account
		 //or else they will be shown an error
		while(!loggedIn) {
			System.out.println("Enter your username: ");
			String enteredUsername = sc.next();
			System.out.println("Enter your password: ");
			String enteredPassword = sc.next();
			
			if(enteredUsername.equals(userName) && enteredPassword.equals(passWord)) {
				System.out.println("CREDENTIALS VERIFIED");
				loggedIn = true;
			} else {
				System.out.println("ERROR! INCORRECT USERNAME OR PASSWORD!");
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
		 			accountMenu(userName, "CHECKING", checkingBalance, sc);
		 			break;
		 		case 2:
		 			accountMenu(userName, "SAVINGS", savingsBalance, sc);
		 			break;
		 		case 3:
		 			investmentChoice(userName, "INVESTMENTS", sc);
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
		int stockBalance;
		int stockSelection;
		int stockQuantity1 ,stockQuantity2, stockQuantity3, stockQuantity4, stockQuantity5, stockQuantity6, stockQuantity7, stockQuantity8;
		int newBalance;
		
		System.out.println("-------------"+accountType+"-------------");
		System.out.println("$ICBNK   -(Infinte Capital)-   +5000%");
		System.out.println("$MSFT      -(Microsoft)-       -1.68%");
		System.out.println("$AAPL        -(Apple)-         -0.02%");
		System.out.println("$TSLA        -(Tesla)-         +0.71%");
		System.out.println("$AMZN        -(Amazon)-        +1.65%");
		System.out.println("$GOOGL       -(Google)-        -1.18%");
		System.out.println("$NVDA        -(NVIDIA)-        -0.37%");
		System.out.println("$META    -(Meta Platforms)-    +0.25%");
		System.out.println("-------------------------------------");
		System.out.println("     Press [1] to purchase stock    ");
		System.out.println("     Press [2] to switch accounts    ");

		selection = sc.nextInt();
		
		int total;
		stockBalance = 10000;
		
		if(selection == 1) {
			System.out.println("Please Select Which Stock You Would Like to Purchase");
			System.out.println("$ICBNK   -(Infinte Capital)-   $500   [1]");
			System.out.println("$MSFT      -(Microsoft)-       $450   [2]");
			System.out.println("$AAPL        -(Apple)-         $300   [3]");
			System.out.println("$TSLA        -(Tesla)-         $50    [4]");
			System.out.println("$AMZN        -(Amazon)-        $200   [5]");
			System.out.println("$GOOGL       -(Google)-        $320   [6]");
			System.out.println("$NVDA        -(NVIDIA)-        $100   [7]");
			System.out.println("$META    -(Meta Platforms)-    $360   [8]");
			
			System.out.println("Selection: ");
			stockSelection = sc.nextInt();
			//System.out.println("Quantity: ");
			//stockQuantity = sc.nextInt();
			
			if(stockSelection == 1) {
			
					System.out.println("Quantity: ");
					stockQuantity1 = sc.nextInt();
					
					total = stockQuantity1 * 500;
					
					newBalance = stockBalance - total;
					
					System.out.println("Balance Updated: "+newBalance);
					System.out.println("Stock Owned");
					System.out.println("Name: ICBNK");
					System.out.println("Quantity: "+stockQuantity1);
							
			}
			else if(stockSelection == 2) {
					System.out.println("Quantity: ");
					stockQuantity2 = sc.nextInt();

					total = stockQuantity2 * 450;
					
					newBalance = stockBalance - total;
					
					System.out.println("Balance Updated: "+newBalance);
					System.out.println("Stock Owned");
					System.out.println("Name: MSFT");
					System.out.println("Quantity: "+stockQuantity2);
				}
			else if(stockSelection == 3) {
					System.out.println("Quantity: ");
					stockQuantity3 = sc.nextInt();
					
					total = stockQuantity3 * 300;
					
					newBalance = stockBalance - total;
					
					System.out.println("Balance Updated: "+newBalance);
					System.out.println("Stock Owned");
					System.out.println("Name: AAPL");
					System.out.println("Quantity: "+stockQuantity3);
				}
			else if(stockSelection == 4) {
					System.out.println("Quantity: ");
					stockQuantity4 = sc.nextInt();
					
					total = stockQuantity4 * 50;
					
					newBalance = stockBalance - total;
					
					System.out.println("Balance Updated: "+newBalance);
					System.out.println("Stock Owned");
					System.out.println("Name: TSLA");
					System.out.println("Quantity: "+stockQuantity4);
				}
			else if(stockSelection == 5) {
					System.out.println("Quantity: ");
					stockQuantity5 = sc.nextInt();
					
					total = stockQuantity5 * 200;
					
					newBalance = stockBalance - total;
					
					System.out.println("Balance Updated: "+newBalance);
					System.out.println("Stock Owned");
					System.out.println("Name: AMZN");
					System.out.println("Quantity: "+stockQuantity5);
				}
			else if(stockSelection == 6) {
					System.out.println("Quantity: ");
					stockQuantity6 = sc.nextInt();
					
					total = stockQuantity6 * 320;
					
					newBalance = stockBalance - total;
					
					System.out.println("Balance Updated: "+newBalance);
					System.out.println("Stock Owned");
					System.out.println("Name: GOOGL");
					System.out.println("Quantity: "+stockQuantity6);
				}
			else if(stockSelection == 7) {
					System.out.println("Quantity: ");
					stockQuantity7 = sc.nextInt();
					total = stockQuantity7 * 100;
					
					newBalance = stockBalance - total;
					
					System.out.println("Balance Updated: "+newBalance);
					System.out.println("Stock Owned");
					System.out.println("Name: NVDA");
					System.out.println("Quantity: "+stockQuantity7);
				}
			else if(stockSelection == 8) {
					System.out.println("Quantity: ");
					stockQuantity8 = sc.nextInt();
					total = stockQuantity8 * 360;
					
					newBalance = stockBalance - total;
					
					System.out.println("Balance Updated: "+newBalance);
					System.out.println("Stock Owned");
					System.out.println("Name: META");
					System.out.println("Quantity: "+stockQuantity8);
				}
				if(stockSelection > 8 || stockSelection < 0) {
					System.out.println("INVALID SELECTION");
			}
		
		
		
		if(selection == 2) {
			return;
				}
		}
}
		

public static void accountMenu(String userName, String accountType, double balance, Scanner sc) {
	int choice;
	while(true){
		System.out.println("--------"+accountType+"--------");
		System.out.println("Check balance  [1]");
		System.out.println("Deposit funds  [2]");
		System.out.println("Withdraw funds [3]");
		System.out.println("Transfer money [4]");
		System.out.println("Switch account [5]"); //changed from 'new' to 'switch' account
		System.out.println("Log off        [6]");
		System.out.println("Press 1-6:  ");
		
		choice = sc.nextInt();
		TransferAcc Checkings = new TransferAcc("Checkings");
		TransferAcc Savings = new TransferAcc("Savings");
		
		switch(choice) {
		
			case(1):
				showBalance(balance);
				break;
			case(2):
				System.out.println("Please enter the amount you would like to deposit: ");
				System.out.print("$");
				double depositAmount = sc.nextDouble();
				balance = depositFunds(balance, depositAmount);
				
				
				break;
			case(3):
				System.out.print("Please enter the amount you would like to withdraw: ");
				System.out.print("$");
				double withdrawAmount = sc.nextDouble();
				balance = withdrawFunds(balance, withdrawAmount);
				break;
			case(4):
				System.out.println("Please enter the transfer amount");
				System.out.println("$");
				double transferAmount = sc.nextDouble();
				Checkings.depoist(balance);
				Savings.depoist(balance);
				Checkings.transfer(transferAmount, Savings);
				
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
	System.out.println("Amount Deposited:$"+amount);
	System.out.println("Current Balance:$"+balance); 
	return balance;
}
public static double withdrawFunds(double balance, double amount) {
	if(amount > balance) {
		System.out.println("INSUFFICENT FUNDS");
	}else{
		balance -= amount;
		System.out.println("Amount withdrawn:$"+amount);
		System.out.println("Current Balance:$"+balance); 
	}
	return balance;
	}

public static double transfer(double balance, double amount) {
	if (amount > balance) {
		System.out.println("INSUFFICENT FUNDS TO TRANSFER");
	}
	else {
		balance -= amount;
		System.out.println("Amount withdrawn from Checkings:$"+amount);
		System.out.println("Current Balance :$"+balance);
	}
	return balance;
	
}


}
