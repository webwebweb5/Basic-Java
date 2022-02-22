import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter factorial : ");
		int n = input.nextInt();
		
		int sum = 1;
		
		for (int i = 1; i <= n; i++) {
			
			sum *= i;
			
		}
		
		System.out.print(n + "!" + " = " + sum);

	}

}
