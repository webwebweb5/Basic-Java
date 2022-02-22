import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter hour : ");
		int hour = input.nextInt();
		
		double receives;
		double OT;
		double baht;
		
		receives = hour * 8;
		
		OT = receives + 12;
		
		baht = receives * 31.27;
		
		if (hour <= 40) {
			System.out.print("Recieves : $" + receives + " -> ฿" + baht);
		} else {
			System.out.print("Recieves +$12.00 for each work over 40 hour: $" + OT + " -> ฿" + baht);
		}

	}

}
