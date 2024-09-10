import java.util.Scanner;

public class IncreasingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a, b, c;
		System.out.println("Enter A: ");
		a = in.nextInt();
		System.out.println("Enter B: ");
		b = in.nextInt();
		System.out.println("Enter C: ");
		c = in.nextInt();
		if (a > b && a > c && b > c)
		{
			System.out.println("Increasing Order.");
		}
		else if (b > a && b > c)
		{
			System.out.println("No Order.");
		}
		else if (c > a && c > b && b > a)
		{
			System.out.println("Decreasing Order.");
		}
		else 
		{
			System.out.println("Are Number Are Equal.");
		}

	}

}
