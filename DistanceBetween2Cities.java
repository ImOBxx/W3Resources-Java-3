import java.util.Scanner;

public class DistanceBetween2Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner in = new Scanner (System.in);
	    double km, m, inches, cm;
		double feet;
	    System.out.print("Enter Distance Between 2 Cities In KM: ");
	    km = in.nextInt();
	    m = km * 1000;
	    feet = km * 3280.839;
	    inches = km * 39370.1;
	    cm = km * 1000000;
	    System.out.print("Distance In Meters: " + m + "\n");
	    System.out.print("Distance In Feet: " + feet + "\n");
	    System.out.print("Distance In Inches: " + inches + "\n");
	    System.out.print("Distance In Centimeter: " + cm + "\n");
	}

}
