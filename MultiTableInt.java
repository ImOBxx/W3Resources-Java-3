import java.util.Scanner;

public class MultiTableInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a, i, sum;
		System.out.println("Enter Number: ");
		a = in.nextInt();
		for (i = 1; i <= 10; i++)
		{
			sum = a * i;
			System.out.println(a + " x " + i + " = " + sum);
			
			
		}
	

	}

}
