//find area of rectangle
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		//Lab3
		double length;
		double width;
		double area;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length: ");
		length = input.nextDouble();
		System.out.print("Enter width: ");
		width = input.nextDouble();
		area = length*width;
		System.out.println("The area of rectangle is " + area);
		
	}

}
