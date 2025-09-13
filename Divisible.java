/* 	prompt user to enter a number
	save as number
	check if number can be divided by three without remainder
	print number is divisible by 3
	check if number can be divided by five without remainder
	print number is divisible by 5
	check if number cannot be divided by five and three without remainder
	print number is not divisible by 3 and 5

										*/



import java.util.Scanner;

public class Divisible{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		if(number % 3 == 0){
			System.out.println(+number + " is divisible by 3" );
		}

		if(number % 5 == 0){
			System.out.printf(+ number + " is divisible by 5");
		}
		if (number % 5 != 0 && number % 3 != 0){
			System.out.printf(+ number + " is not divisible by 3 and 5");
		}

	}
}

