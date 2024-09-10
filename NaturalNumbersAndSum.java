import java.util.Scanner;

public class NaturalNumbersAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int n, i;
		int sum = 0;
		System.out.println("Enter The Nth value: ");
		n = in.nextInt();
		for (i = 1; i <= n; i++)
		{
			System.out.println(i);
			System.out.println("\n");
			sum = sum + i;
			
		}
		System.out.println("Sum: " + sum);

	}

}
