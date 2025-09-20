/* promp user to enter grade between A-F
save as grade
check if grade is either A or B or C or D
print Pass, if not
check if grade is E or F
print Fail, if not
print Invalid Input: please input letters between A - F in capital letter	*/

import java.util.Scanner;

public class Grade{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter your grade (Letters between A - F): ");
		String grade = scanner.next();

		if(grade.equals ("A") || grade.equals ("B") || grade.equals ("C") || grade.equals ("D")){
			System.out.println("Pass");
		}
		else if(grade.equals ("E") || grade.equals ("F")){
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid Input: please input letters between A - F in capital letter");
		}
	}
}