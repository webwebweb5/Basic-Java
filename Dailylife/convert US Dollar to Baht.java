//convert US dollar to Baht
import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		//Lab3 5
		double Baht;
		double Dollar;
		double Total;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter US dollar: ");
		Dollar = input.nextDouble();
		Baht = 31.8245;
		Total = Dollar * Baht;
		System.out.println(Dollar + " US dollar is " + Total + " Baht ");
		
	}

}
