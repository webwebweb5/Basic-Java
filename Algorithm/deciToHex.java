import java.util.Scanner;

public class deciToHex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int num = input.nextInt();
        input.close();

        int remainder;
        String string = "";

        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

        while (num > 0) {
            remainder = num % 16;
            string = hex[remainder] + string;
            num /= 16;
        }
        System.out.println("Decimal to hexadecimal: " + string);

    }
}
