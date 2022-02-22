import java.util.Scanner;

public class PascalTriangle {
    public static void space(int space) {
        if (space < 10) {
            System.out.print("   ");//3 spaces
        } else if (space > 9 && space < 99) {
            System.out.print("  ");//2 spaces
        } else {
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter row of pyramid: ");
        int n = input.nextInt();
        input.close();

        for (int i = 1; i <= n; i++) {
            int frontSpace;
            frontSpace = 32 - i*4;
            for (int j = 0; j < frontSpace; j++)
                System.out.print(" ");
            for (int j = 0; j < i; j++) {
                int num = (int)Math.pow(2, j);
                space(num);
                System.out.print(num);
            }
            //ถัดจากตัวตรงกลาง
            for (int j = i - 2; j >= 0; j--) {
                int num = (int)Math.pow(2, j);
                space(num);
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
