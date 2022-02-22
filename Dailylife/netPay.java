import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		
		String name;
		double hour;
		double PAYRATE = 6.75;
		double grossPay;
		double FTAX = 0.2;
		double Tax1;
		double STAX = 0.09;
		double Tax2;
		double Total;
		double netPay;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Name : ");
		name = input.next();
		System.out.print("Working period(hour) : ");
		hour = input.nextInt();
		
		grossPay = hour * PAYRATE;
		Tax1 = FTAX * grossPay;
		Tax2 = STAX * grossPay;
		Total = Tax1 + Tax2;
		netPay = grossPay - Total;
		
		System.out.println("Employee's name : " + name);
		System.out.println("Hours work : " + hour + " hours");
		System.out.println("Pay rate : $" + PAYRATE);
		System.out.println("Gross pay : $" + grossPay);
		System.out.println("Deductions: ");
		System.out.println("    Federal withholding (20.0%): $" + Tax1);
		System.out.println("    State withholding (9.0%): $" + Tax2);
		System.out.println("    Total deduction: $" + Total);
		System.out.println("Net pay: $" + netPay);
	}

}
