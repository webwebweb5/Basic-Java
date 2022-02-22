import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		
		//Scanner input = new Scanner(System.in);
		
		//°F to °C
		/*System.out.print("Enter temperature °F : ");
		double f = input.nextDouble();
		
		double c = (f-32)*0.56;
		
		System.out.println(f + " °F = " + c + " °C");
		*/
		
		//°C to °F
		/*System.out.print("Enter temperature °C : ");
		double c = input.nextDouble();
		
		double f = (9*c)/5+32;
		
		System.out.println(c + " °C = " + f + " °F");
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter temperature °C or °F (type C or F): ");
		char choice = input.next().charAt(0);
		
		if (choice == 'c' || choice == 'C') {
			System.out.print("Enter temperature °C : ");
			double cel = input.nextDouble();
			double f = (9*cel)/5+32;
			System.out.println(cel + " °C = " + f + " °F");
		} else if (choice == 'f' || choice == 'F') {
			System.out.print("Enter temperature °F : ");
			double f = input.nextDouble();
			double c = (f-32)*0.56;
			System.out.println(f + " °F = " + c + " °C");
		} else if (choice != 'c'&& choice != 'C' && choice != 'f' && choice != 'F') { 
			System.out.println("You've entered an invalid character.");
        } 
		
	}

}
