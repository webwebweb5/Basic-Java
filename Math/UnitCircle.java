import java.util.Scanner;

public class UnitCircle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the degree(°) : ");
		double x = input.nextDouble();
		
		if (x > 360 || x < 0) {
			x %= 360;
			
			if ((x >= 0.5 && x < 1) || (x <= -0.5 && x > -1))
				System.out.println("Quadrant I");
			if ((x >= 1 && x < 1.5)|| (x <= -1 && x > -1.5))
				System.out.println("Quadrant II");
			if ((x >= 1.5 && x < 2) || (x <= -1.5 && x > -2))
				System.out.println("Quadrant III");
			if ((x >= 2 && x <= 2.5) || (x <= -2 && x >= -2.5))
				System.out.println("Quadrant IV");
		}
				
		if (x == 0 || x == 360 || x == -360)
			System.out.println("Axis X = 1");
		
		if (x == 90 || x == -90)
			System.out.println("Axis X = 0");
		
		if (x == 180 || x == -180)
			System.out.println("Axis X = -1");
		
		if (x == 270 || x == -270)
			System.out.println("Axis X = 0");
		//+
		if (x > 0 && x < 90)
			System.out.println("Quadrant I");
		
		if (x > 90 && x < 180)
			System.out.println("Quadrant II");
		
		if (x > 180 && x < 270)
			System.out.println("Quadrant III");
		
		if (x > 270 && x < 360)
			System.out.println("Quadrant IV");
		//-
		if (x < 0 && x > -90)
			System.out.println("Quadrant I");
		
		if (x < -90 && x > -180)
			System.out.println("Quadrant II");
		
		if (x < -180 && x > -270)
			System.out.println("Quadrant III");
		
		if (x < -270 && x > -360)
			System.out.println("Quadrant IV");

	}

}
