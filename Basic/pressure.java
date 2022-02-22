package free;

import java.util.Scanner;

public class pressure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final double g = 9.8;
//		double p;
//		double d;
//		double h;
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Find density");
//		
//		System.out.print("Enter pressure(kPa): ");
//		p = input.nextDouble();
//		System.out.print("Enter height(m): ");
//		h = input.nextDouble();
//		
//		d = p*1000/(g*h);
//		
//		System.out.print("Density = " + d + "kg/m3");
		
		final double d = 1000;
		double p;
		double g;
		double h;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Find gravity");
		
		System.out.print("Enter pressure(kPa): ");
		p = input.nextDouble();
		System.out.print("Enter height(m): ");
		h = input.nextDouble();
		
		g = (p*1000)/(d*h);
		
		System.out.print("Gravity = " + g + " m/s2");

	}

}
