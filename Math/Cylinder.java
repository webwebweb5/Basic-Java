//find area and volume of cylinder by inputting only radius
import java.util.Scanner;

public class Cylinder {

	public static void main(String[] args) {
		//Lab3 6
		double radius;
		final double PI = 3.14;
		double area;
		double volume;
		double length;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius(cm): ");
		radius = input.nextDouble();
		System.out.print("Enter length(cm): ");
		length = input.nextDouble();
		area = radius * radius * PI;
		volume = area * length;
		System.out.println("The area of the cylinder is: " + area + " cm^2");
		System.out.print("The volume of the cylinder is: " + volume + " cm^3");
	}

}
