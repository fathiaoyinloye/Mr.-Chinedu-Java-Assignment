/* 	prompt user to enter a number
	save as number
	check if number is equal to 0
	print zero, if not
	check if number can be divided by two without remainder and  also if number is greater than 0
	print Positive Even, if not
	check if number can be divided by two without remainder and  also if number is less than 0
	print Negative Even, if not
	check if number cannot be divided by two without remainder and  also if number is greater than 0
	print Positive Odd, if not
	check if number can be divided by two without remainder and  also if number is less than 0
	print Negative Odd.
														*/


import java.util.Scanner;

public class PositiveNegative{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		if(number == 0){
			System.out.println( "Zero");
		}
		else if (number % 2 == 0 && number > 0){
			System.out.println("Positive Even");
		}
		else if (number % 2 == 0 && number < 0){
			System.out.println("Negative Even");
		}
		else if (number % 2 != 0 && number > 0){
			System.out.println("Positive odd ");
		}
		else if (number % 2 != 0 && number < 0){
			System.out.println("Negative odd");
		}




	}
}