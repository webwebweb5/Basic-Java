package forLoop;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		
	    System.out.println("Exponential");
		
	    Scanner input = new Scanner(System.in);
	    System.out.print("Base : ");
	    int base = input.nextInt();
	    System.out.print("Power : ");
	    int power = input.nextInt();
	    
	    int sum = 1;
	    
	    for (int i = 1; i <= power; i++) {
			sum *= base;
		}
	    System.out.print(base + "^" + power + " = " + sum);

	}

}
