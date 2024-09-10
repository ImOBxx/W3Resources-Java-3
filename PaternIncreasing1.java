import java.util.Scanner;

public class PaternIncreasing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int n;
		int num;
		System.out.println("Enter Number Of Rows: ");
		n = in.nextInt();
		for (int i = 1; i <= n; i++)
		{
			num = 1;
			for (int j = 1; j <= i; j++)
			{
				System.out.print(num + " ");
				num = num + 1;
				
			}
		
		System.out.print("\n");
		}

	}

}
