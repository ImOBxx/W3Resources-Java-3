import java.util.Scanner;

public class CountFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a, i, count = 0;
		System.out.print("Enter Number: ");
		a = in.nextInt();
		for (i = 1; i <= a; i++)
		{
			if (a % i == 0)
			{
				count = count + 1;
			}
			System.out.print(count);
		}

	}

}
