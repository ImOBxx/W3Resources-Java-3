import java.util.Scanner;

public class Denominations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, x, y, z, ten = 0;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Amount (In Hundreds): ");
		n = in.nextInt();
		x = 10;
		y = 50;
		z = 100;
		int hundred = n / 100;
		n = n % 100;
		int fifty = n / 50;
		n = n % 50;
		ten = n / ten;
		n = n & 10;
		System.out.println("Number Of 100 Notes: " + hundred);
		System.out.println("Number Of 50 Notes: " + fifty);
		System.out.println("Number Of 10 Notes: " + ten);
		
		
	}

}
