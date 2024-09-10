import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, i, sum;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Table Number: ");
		x = in.nextInt();
		System.out.println("\n");
		System.out.println("Table Of " + x);
		System.out.println("\n");
		for (i = 1; i <= 10; i++)
		{
			sum = x * i;
			System.out.println(x + " x " + i + " = " + sum);
		}
		

	}

}
