import java.util.Scanner;

public class InputAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int i, a, b, c, sum;
		double avg;
		System.out.print("Enter A: ");
		a = in.nextInt();
		System.out.print("Enter B: ");
        b = in.nextInt();
		System.out.print("Enter C: ");
		c = in.nextInt();
		sum = a + b + c;
		avg = sum / 3.0;
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);
	}

}
