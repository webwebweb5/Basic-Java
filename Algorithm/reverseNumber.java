package forLoop;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	     
        int temp;
        int reverse = 0;
        
        System.out.print("Enter the number : ");
        temp = input.nextInt();
        
        int remainder = 0;
        
        while(temp>0)
        {
	    remainder = temp % 10;
	    reverse = reverse * 10 + remainder;
            temp /= 10;
        }

        System.out.println("Reverse of " + temp + " is " + reverse);

	}

}
