import java.util.Scanner;

public class PosOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a;
		System.out.print("Enter Number: ");
		a = in.nextInt();
		if (a > 0)
		{
			System.out.print("Positive Number.");
		}
		else if (a < 0)
		{
			System.out.print("Negative Number.");
		}
		else
		{
			System.out.print("Zero.");
		}

	}

}
