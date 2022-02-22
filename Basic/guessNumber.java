import java.util.Scanner;

public class guessNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input First number : ");
		int number1 = input.nextInt();
		
		System.out.print("Input Second number : ");
		int number2 = input.nextInt();
		
		if (number1 > number2) {
			System.out.print("The first number is greater than the second.");
		} else if (number2 > number1) {
			System.out.print("The first number is no greater than the second.");
		} else {
			System.out.print("These two numbers are equal.");
		}

	}

}
