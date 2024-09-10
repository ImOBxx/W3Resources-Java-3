import java.util.Scanner;

public class FloatingPointNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int n;
		System.out.println("Enter Number: ");
		n = in.nextInt();
		if (n > 0)
		{
			if (n > 1000000)
			{
				System.out.println("Positgive Large Number.");
			}
			else {
				System.out.println("Postive Number.");
			}
		}
		
		else if (n < 0)
		{
			if (n < 1)
			{
				System.out.println("Negative Small Number. ");
			}
			else 
			{
				System.out.println("Negative Number.");
			}
		}
		
		else
		{
			System.out.println("Zero.");
		}
		}

	}


