/* 	prompt user to enter three numbers
	save in container first second and third respectively
	create another container largest and assign first to largest
	check if second is greater than largest and assign it to largest if yes. if not,
	check if third is greater than largest and assign it to largest if yes. 
	print out the value of largest 								*/


import java.util.Scanner;

public class Return_Largest{
	public static void main(String [] args){
	
		Scanner scanner = new Scanner(System.in);


		System.out.print("Enter first number: ");
		int first = scanner.nextInt();

		System.out.print("Enter second number: ");
		int second = scanner.nextInt();

		System.out.print("Enter third number: ");
		int third = scanner.nextInt();

		int largest = first;

		if(second > largest){
			largest = second;
		}
		if(third > largest){
			largest = third;
		}
		System.out.printf("The Largest number is %d%n", largest);
	}
}