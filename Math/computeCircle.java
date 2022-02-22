//find volume and surface of circle by inputting only radius
import java.util.Scanner;
import java.lang.Math;

public class computeCircle {

	public static void main(String[] args) {
		
		double radius;
		final double PI = 3.1416;
		double volume;
		double surface;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius: ");
		radius = input.nextDouble();
		
		volume = (1.33 * PI * Math.pow(radius, 3));
		surface = (4 * PI * Math.pow(radius, 2));
		
		System.out.println("Volume of circle: " + volume);
		System.out.println("Surface of circle: " + surface);

	}

}
