import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		/*Scanner input = new Scanner(System.in);
		System.out.println("please select the operator 1.plus(x+y) 2. substract(x-y) 3. multiplely(x*y) 4.division(x/y)");
		System.out.print("Enter the operator : ");
		
		int menu = input.nextInt();
		
		double answer = 0;
		
		System.out.print("Enter x : ");
		int x = input.nextInt();
		System.out.print("Enter y : ");
		int y = input.nextInt();
		
		switch (menu) {
		case 1:answer = x+y;
		System.out.println("Answer is " +answer);
			break;
		case 2:answer = x-y;
		System.out.println("Answer is " +answer);
			break;
		case 3:answer = x*y;
		System.out.println("Answer is " +answer);
			break;
		case 4:answer = x/y;
		System.out.println("Answer is " +answer);
			break;
		
		default:
			System.out.println("You put invalid operator");
			break;
		}*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("please select 1.Apple 2.Bannana 3.Orange 4.Mango");
		System.out.print("Enter selected number(Ex. 1 = apple) : ");
		
		int menu = input.nextInt();

		switch (menu) {
		case 1:
		System.out.println("You got Apple 1 ea");
			break;
		case 2:
		System.out.println("You got Banana 1 ea");
			break;
		case 3:
		System.out.println("You got Orange 1 ea");
			break;
		case 4:
		System.out.println("You got Mango 1 ea");
			break;
		
		default:
			System.out.println("Don't fucking eat anything.");
			break;
			
		}
		
	}

}
