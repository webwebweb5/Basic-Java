public class primeNumber {
    public static void main(String[] args) {
        
        int number = 5;
        int i = 2;
        boolean check = true;
        
        while (i < number) {
            if (number%i == 0) {
                System.out.println(number + " is not a prime number");
                check = false;
                break;
            }
            i++;
        }

        if (check) {
            System.out.println(number + " is a prime number");
        }

        /*while (i < number) {
            if (number%i != 0) {
                System.out.println(number + " is a prime number");
                break;
            } else if (number%i == 0) {
                System.out.println(number + " is not a prime number");
                break;
            }
            i++;
        }

        if (i == number) {
            System.out.println(number + " is a prime number");
        }*/

    }
}
