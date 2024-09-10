import java.util.Scanner;

public class MultiTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("\n");
		Scanner in = new Scanner (System.in);
		int n, sum, i;
		System.out.print("Enter Number Of Table: ");
		n = in.nextInt();
		System.out.print("\n");
		System.out.print("Table Of " + n + " : ");
		System.out.print("\n");
		System.out.print("\n");
		for (i = 1; i <= 10; i++)
		{
			sum = n * i;
			System.out.print(n + " x " + i + " = " + sum + "\n");
		}
		System.out.print("\n");

	}

}
