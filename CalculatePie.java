package numbers;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculatePie {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of digits :");
		int digits = in.nextInt();
		BigDecimal num = new BigDecimal(22.0);
		BigDecimal den = new BigDecimal(7.0);
		String pi = digits < 32627?num.divide(den, digits, BigDecimal.ROUND_UP).toString():"Limit exceeded!";
		System.out.println(pi);		
	}
}
