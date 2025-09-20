/* 	prompt user to enter a number
	savw as number
	check if number can be divided by two without remainder
	print Even, if not
	check if number cannot be divided by two without remainder
	print Odd, if not
	print Invalid 						*/

import java.util.Scanner;

public class Even_Odd{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int number = scanner.nextInt();

	if(number % 2 == 0){
		System.out.println("Even");
	}
	else if(number % 2 != 0){
		System.out.println("Odd");
	}
		else{
	System.out.print("Invalid");
	}

	}
}