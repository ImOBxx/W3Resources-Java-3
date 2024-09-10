import java.util.Scanner;

public class NumberEvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a, i;
		System.out.print("Enter Number: ");
		a = in.nextInt();
		if (a % 2 == 0)
		{
			System.out.print(1 + ",  Even");
		}
		else {
			System.out.print(0 + ", Odd");
		}
		

	}

}
