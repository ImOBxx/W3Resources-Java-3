import java.util.Scanner;

public class LargeNumbersSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner in = new Scanner (System.in);
		System.out.print("Enter A: ");
		a = in.nextInt();
		if (a < 0)
		{
			System.out.print("Negative Number. ");
			if (a < 1)
			{
				System.out.print( "Negative Small Number.  ");
			}

		}
		else if (a > 0)
		{
			System.out.print("Positive Number. ");
			
			if (a > 1000000)
			{
				
					System.out.print("Positive Large Number. ");
			}
		}
		else if (a == 0)
		{
			System.out.print("Zero.");
		}
	


	}

}
