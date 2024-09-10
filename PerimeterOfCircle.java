import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int r;
		double c;
		System.out.print("Enter Radius: ");
		r = in.nextInt();
		c = (2 * 3.14) * r;
		System.out.println("Circumference Of The Circle: " + c);

	}

}
