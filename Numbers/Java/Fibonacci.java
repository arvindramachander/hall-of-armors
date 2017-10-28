import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println("Enter the digits: ");
		Scanner in = new Scanner(System.in);
		int digits = in.nextInt();
		System.out.println(a+"\n"+b);
		for(int i =2;i<digits;i++){
			c = b+a;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}
