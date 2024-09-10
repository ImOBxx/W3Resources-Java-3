import java.util.Scanner;

public class FIbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int y = 1;
		int c = 0;
		int n;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter The Nth term: ");
		n = in.nextInt();
		System.out.println("\n");
		System.out.println("The Fibonacci Series: ");
		System.out.println("\n");
		System.out.println(x + "\n");
		System.out.println(y + "\n");
		for (int i = 0; i <= n; i++)
		{
			c = x + y;
			System.out.println(c + "\n");
			x = y;
			y = c;
		}
		
		

	}

}
