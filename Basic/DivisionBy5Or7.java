import java.util.Scanner;

public class DivisionBy5Or7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        input.close();

        int temp = 1;

        int i = 1;
        while (i <= number) {
            if (i % 5 == 0 ^ i % 7 == 0) {
                System.out.print(i + " ");
                if (temp%10 == 0) {
                    System.out.println();
                }
                temp++;
            }
            i++;
        }

	}

}
