import java.util.Scanner;

public class Interchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a, b, temp;
		System.out.println("Enter C: ");
		a = in.nextInt();
		System.out.println("Enter D: ");
		b = in.nextInt();
		temp = a;
		a = b;
		b = temp;
		System.out.println("Value Of C: " + a);
		System.out.println("Value Of D: " + b);
		
		

	}

}
