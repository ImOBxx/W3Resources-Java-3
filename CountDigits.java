import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, temp, count = 0;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Number: ");
		x = in.nextInt();
		temp = x;
		while (temp > 0)
		{
			temp = temp / 10;
			count = count + 1;
			
		}
		System.out.println("Number Of Digits in " + x + " is " + count);

	}

}
