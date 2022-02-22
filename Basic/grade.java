package test;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		
		double GPA;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Score : ");
		GPA = input.nextDouble();
		
		if (GPA >= 80) {
			System.out.print("Your GPA is '4.0'");
		} else if (GPA >= 75) {
			System.out.print("Your GPA is '3.5'");	
		} else if (GPA >= 70) {
			System.out.print("Your GPA is '3.0'");
		} else if (GPA >= 65) {
			System.out.print("Your GPA is '2.5'");
		} else if (GPA >= 60) {
			System.out.print("Your GPA is '2.0'");
		} else if (GPA >= 55) {
			System.out.print("Your GPA is '1.5'");
		} else if (GPA >= 50) {
			System.out.print("Your GPA is '1.0'");
		} else {
			System.out.print("Your GPA is '0'");
		}
		
	}

}
