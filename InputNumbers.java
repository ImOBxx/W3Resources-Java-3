import java.util.Scanner;

public class InputNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double n, a, sum = 0, avg = 0, i;
		for (i = 1; i <= 5; i++)
		{
			
	    System.out.println("\n");
		System.out.println("Enter Number: ");
		n = in.nextInt();
		sum = sum + n;
		avg = sum / n;
		
		}
		System.out.println("\n");
		System.out.printf("Sum: " + sum + "\n");
		System.out.printf("Average: " + avg + "\n");
	}

}
