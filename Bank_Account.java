/* collect age from user
save as accountbalance
check if accountbalance is less than 100
print Low, if not
check if accountbalance is less than or equal to 1000
print Medium, if not
print High */

import java.util.Scanner;

public class Bank_Account{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter your account balance: ");
	int accountBalance = scanner.nextInt();

	if(accountBalance < 100){
	System.out.println("Low");
	}

	else if(accountBalance <= 1000){
	Syst Javac em.out.println("Medium");
	}

	else{
	System.out.print("High");
	}

	}
}