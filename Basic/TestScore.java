import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("Enter score : ");
		int score = input.nextInt();
		
		if (score >= 80) {
			System.out.print("PASS!");
		} else {
			System.out.print("FAIL!");
		}*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Score : ");
		double GPA = input.nextDouble();
		
		if (GPA > 100) {
			System.out.print("Score can't be over 100");
		} else if (GPA >= 80) {
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
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("Enter score : ");
		int score = input.nextInt();
		
		if (score >= 90) {
			System.out.print("A");
		} else if (score >= 80) {
			System.out.print("B");	
		} else if (score >= 70) {
			System.out.print("C");
		} else if (score >= 60) {
			System.out.print("D");
		} else {
			System.out.print("F");
		}*/
		
	}
}
