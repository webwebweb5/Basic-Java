//import java.util.Random;
import java.util.Scanner;

public class headORtail {

	public static void main(String[] args) {
		
		/*Random rand = new Random();
		int random = rand.nextInt(2);
		
		if (random == 1) {
			System.out.print("Hoorayyyy! You are win!");
		} else {
			System.out.print("Boooo! You are lose!");
		}*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number ([0] = head, [1] = tail) : ");
		int number = input.nextInt();
		
		int num = (int)(Math.random() * 2);
		
		if (number == num) {
			System.out.print("Hoorayyyy! You are win! " + num);
		} else {
			System.out.print("Boooo! You are lose! " + num);
		}
		
	}

}
