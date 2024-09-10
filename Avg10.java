import java.util.Scanner;

public class Avg10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double n, avg = 0, sum = 0;
		for (int i = 1; i <= 10; i++)
		{
           System.out.println("Enter Number: ");
           n = in.nextInt();
           sum = sum + n;
           avg = sum / 10;
           
		}
		System.out.printf("Average: ", avg);

	}

}
