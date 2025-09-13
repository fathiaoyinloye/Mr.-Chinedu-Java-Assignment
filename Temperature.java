/* 	prompt user to enter temperature in degree celcius
	save as temperature
	check if temperature is less than 0
	print Freezing, if not
	check if temperature is less than or equal to 15
	print Warm, if not
	check if temperature is less than or equal to 25
	print Warm, if not
	print Hot 						*/

import java.util.Scanner;

public class Temperature{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter temperature in Celsius: ");
	int temperature = scanner.nextInt();

	if(temperature < 0){
		System.out.println("Freezing");
	}
	else if(temperature <= 15){
		System.out.println("Cold");
	}
	else if(temperature <= 25){
	System.out.println("Warm");
	}
	else{
	System.out.print("Hot");
	}

	}
}