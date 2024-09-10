import java.util.Scanner;

public class PosOrNeg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a;
		System.out.println("Enter Number: ");
		a = in.nextInt();
		if (a > 0)
		{
			System.out.println("Number Is Positive.");
		}
		else if (a < 0)
		{
			System.out.println("Number is Neagtive.");
		}
		else
		{
			System.out.println("Zero.");
		}
	}

}
