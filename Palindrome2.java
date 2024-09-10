import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int r;
		int n;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Number: ");
		n = in.nextInt();
		int temp = n;
		while (n > 0)
		{
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (sum == temp)
		{
			System.out.println("The Number Is A Palindrome.");
		}
		else 
		{
			System.out.println("The Number Is Not A Palindrome.");
		}

	}

}
