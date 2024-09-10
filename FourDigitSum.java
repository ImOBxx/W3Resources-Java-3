import java.util.Scanner;

public class FourDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a, r, sum = 0;
		System.out.println("Enter the Four Digit Numbers: ");
		a = in.nextInt();
		System.out.println("Original Digits : " + a);
		r = a % 10;
		a = a / 1000;
		sum = sum + r;
		
		r = a % 10;
		sum = sum + r;
		System.out.println("Sum Of First And Last Digits: " + sum);

	}

}
