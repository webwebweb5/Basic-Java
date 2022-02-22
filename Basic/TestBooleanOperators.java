import java.util.Scanner;

public class TestBooleanOperators {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer : ");
		int num = input.nextInt();
		
		if (num % 2 == 0 && num % 3 == 0)
			System.out.println(num + " is divisible by 2 and 3.");
		
		if (num % 2 == 0 || num % 3 == 0)
			System.out.println(num + " is divisible by 2 or 3.");
		
		if (num % 2 == 0 ^ num % 3 == 0)
			System.out.println(num + " is divisible by 2 and 3, but not both.");
		
		else
			System.out.print("number cannot divisible by 2 and 3.");

	}

}
