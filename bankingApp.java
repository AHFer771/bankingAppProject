package banking_app;
import java.util.Scanner;

public class bankingApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to your bank! Press 1 to continue");
		int choice = sc.nextInt();
		
		if(choice!=1) {
				sc.close();
				return;
			}
		double balance = 0.00;
		
		while(true) {
			
			System.out.println("Press 1 to check balance: ");
			System.out.println("Press 2 to deposit funds: ");
			System.out.println("Press 3 to withdraw funds: ");
			System.out.println("Press 4 to transfer money: ");
			System.out.println("Press 5 to make a new account: ");
			System.out.println("Press 6 to log off: ");
			System.out.println("Press 1-6:  ");
			
			choice = sc.nextInt();
			
			switch(choice) {
			
				case(1):
					
					showBalance(balance);
					
					break;
				case(2):
				
					break;
				case(3):
					
					
					break;
				case(4):
					
					
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

}
