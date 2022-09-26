import java.util.Scanner;

public class AverageOfThree {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double numberOne = input.nextDouble();
		
		System.out.println("Enter the second number: ");
		double numberTwo = input.nextDouble();
		
		System.out.println("Enter the third number: ");
		double numberThree = input.nextDouble();
		
		double average = (numberOne + numberTwo + numberThree) / 3;
		
		System.out.println("The average of the three numbers is: " + average);
		
	}
}