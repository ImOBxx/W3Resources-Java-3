import java.util.Scanner;

public class EMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e, p, r, n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Principal: ");
		p = in.nextDouble();
		System.out.println("Enter Rate Of Interest: ");
		r = in.nextDouble();
		System.out.println("Enter Time: ");
		n = in.nextDouble();
		e = (p * r) * ((1 + r) * n) / ((1 + r) * n) * - 1;
		
		System.out.printf("EMI: ", e);

		


		
		

	}

}
