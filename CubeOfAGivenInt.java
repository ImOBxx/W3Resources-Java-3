import java.util.Scanner;

public class CubeOfAGivenInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int n, a = 1, i;
		System.out.println("Enter Number Of Terms: ");
		n = in.nextInt();
		for (i = 1; i <= n; i++)
		{
			a = 1 * (i * i * i);
			System.out.println("Cube Of " + i + " = " + a);
			
		}

	}

}
