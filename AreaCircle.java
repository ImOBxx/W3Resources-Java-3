import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r, a;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Radius: ");
		r = in.nextDouble();
		a = 3.14 * r * r;
		System.out.println("Area Of A Circle: " + a);
		

	}

}
