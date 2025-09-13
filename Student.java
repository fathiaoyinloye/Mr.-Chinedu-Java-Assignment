/* 	prompt user to enter student attendance percentage
	save as attendance
	prompt user to enter student average score
	save as average_score
	check if attendanance and average score is greater than 75, print Eligible if yes. if not,
	print Not Eligible.										*/


import java.util.Scanner;

public class Student{
	public static void main(String[] args){
	

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter student attendance percentage: ");
	double attendance = scanner.nextDouble();

	System.out.print("Enter student average score: ");
	double average_score = scanner.nextDouble();

	if(attendance >= 75 && average_score >= 75){
		System.out.print("Eligible");
	}
	
	else {
		System.out.print("Not Eligible");
	}





	}
}