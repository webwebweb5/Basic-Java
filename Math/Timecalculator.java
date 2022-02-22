//compute sec to day hour min sec
import java.util.Scanner;

public class Timecalculator {

	public static void main(String[] args) {
		
		int day;
		int hour;
		int min;
		int sec;
		int remainingSec;
		int remainingMin;
		int remainingHour;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Second: ");
		sec = input.nextInt();
		
		min = sec / 60;
		remainingSec = sec % 60;
		hour = min / 60;
		remainingMin = min % 60;
		day = hour / 24;
		remainingHour = hour % 24;
		
		//90061 sec -> 1 days 1 hours 1 minutes and 1 seconds.
		System.out.println(sec + " seconds is " + day + " days " + remainingHour + " hours " 
				   + remainingMin + " minutes and " + remainingSec + " seconds.");
		
	}

}
