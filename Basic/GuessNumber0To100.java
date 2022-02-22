import java.util.Scanner;

public class GuessNumber0To100 {
    public static void main(String[] args) {

        int number = (int)(Math.random() * 101);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number between 0 to 100");

        int guess = -1;
        while (guess != number) {
            System.out.print("Enter your guess (type -1 to stop): ");
            guess = input.nextInt();

            if (guess == number) {
                System.out.println("Correct, The number is " + number + ".");
            } else if (guess > number) {
                System.out.println("Your guess is too high.");
            } else if (guess == -1) {
                System.out.println("Stop play, the answer is " + number + ".");
                guess = number;
            } else {
                System.out.println("Your guess is too low.");
            }

        }
        input.close();

    }
}
