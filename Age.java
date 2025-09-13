/* collect age from user
save as age
check if age is less than 0
print Please input a correct age, if not
check if age is less than or equal to 12
print Child, if not
check if age is less than or equal to 19
print Teen, if not
check if age is less than or equal to 59
print Adult, if not
print Senior */

import java.util.Scanner;

public class Age{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter your age: ");
	int age = scanner.nextInt();

	if(age < 0){
	System.out.println("Please input a correct age");
	}

	else if(age <= 12){
	System.out.println("Child");
	}

	else if(age <= 19){
	System.out.println("Teen");
	}
	else if(age <= 59){
	System.out.println("Adult");
	}
	else{
	System.out.print("Senior");
	}

	}
}