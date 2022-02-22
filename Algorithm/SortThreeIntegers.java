import java.util.Scanner;

public class SortThreeIntegers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		double x = input.nextDouble();
		System.out.print("Enter the second number : ");
		double y = input.nextDouble();
		System.out.print("Enter the third number : ");
		double z = input.nextDouble();
		
		System.out.print("Sorted integers result : ");
		
		if (x <= y && x <= z && y <= z) {
			System.out.print(x + " < " + y + " < " + z);
		} else if (x >= y && x <= z && y <= z) {
			double box = x;
			x = y;
			y = box;
			System.out.print(x + " < " + y + " < " + z);
		} else if (x <= y && x >= z && y >= z) {
			double box = x;
			double box2 = z;
			z = y;
			x = box2;
			y = box;
			System.out.print(x + " < " + y + " < " + z);
		} else if (x <= y && x <= z && y >= z) {
			double box = y;
			y = z;
			z = box;
			System.out.print(x + " < " + y + " < " + z);
		} else if (x >= y && x >= z && y <= z) {
			double box = x;
			x = y;
			y = z;
			z = box;
			System.out.print(x + " < " + y + " < " + z);
		} else if (x >= y && x >= z && y >= z) {
			double box = x;
			x = y;
			y = box;
			y = x;
			x = z;
			z = box;
			System.out.print(x + " < " + y + " < " + z);
			
		}

	}

}
