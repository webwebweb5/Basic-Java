import java.util.Scanner;
import java.lang.Math;

public class investment {

	public static void main(String[] args) {
		
		double amount;
		int year;
		double FIV; //future investment value
		double increase;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter amount: ");
		amount = input.nextDouble();
		System.out.print("Enter interest rate: ");
		double interestrate = input.nextDouble();
		System.out.print("Enter number of year: ");
		year = input.nextInt();
		
		double interestRate = interestrate/100;
		
		FIV = amount * Math.pow((1 + interestRate), year);
		increase = FIV - amount;
		System.out.println("Amount: " + amount);
		System.out.println("Interest rate: " + interestrate + "%");
		System.out.println("Number of year: " + year);
		System.out.println("Future investment value is " + FIV);
		System.out.println("increase: " + increase);

	}

}
