import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int y;
		System.out.println("Enter Year: ");
		y = in.nextInt();
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))

		{
			System.out.println("The Year Is A Leap year. ");
		}
		else 
		{
			System.out.println("The Year Is Not A Leap Year. ");
		}
		
	}

}

