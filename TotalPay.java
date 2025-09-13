/* 	prompt user to enter number of hours worked
	save as hour
	prompt user to enter their hourly rate
	save as rate
	multiply rate and hour and save it in totalpay
	multuply totalpay and 1.5% or (1.5/100)
	save is as totalPay_bonus
	check if rate is more than 40, print totalPay_bonus if yes. if not,
	print totalPay.										*/


import java.util.Scanner;

public class TotalPay{
	public static void main(String[] args){
	

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter Number of hours worked: ");
	double hour = scanner.nextDouble();

	System.out.print("Enter hourly rate: ");
	double rate = scanner.nextDouble();

	double totalPay = hour * rate;
	double bonus = totalPay *  (1.5 / 100);
	double totalPay_bonus = totalPay + bonus;


	if(hour > 40){
			System.out.printf("Total pay plus bonus: %.2f%n", totalPay_bonus);
	}
	else if( hour <= 40){
		System.out.printf("Total pay plus bonus: %.2f%n", totalPay);
	}

	
	else {
		System.out.print("Not Eligible");
	}





	}
}