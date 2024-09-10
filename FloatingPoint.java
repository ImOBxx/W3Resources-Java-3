import java.util.Scanner;

public class FloatingPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		float a, b;
		System.out.println("Enter A: ");
		a = in.nextFloat();
		System.out.println("Enter B: ");
		b = in.nextFloat();
		if (a == b)
		{
			System.out.println("They are the same. ");
		}
		else if (a != b)
		{
			System.out.println("They are different. ");
		}
	}

}
