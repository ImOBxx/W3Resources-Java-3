import java.util.Scanner;

public class APandAC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r, l, b, p, a, cir, area;
		double choice;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Choice 1) Circle || 2) Rectangle: ");
		double c = in.nextDouble();
		if (c == 1)
		{
			System.out.println("Enter Radius: ");
			r = in.nextDouble();
			a = 3.14 * r * r;
			cir = 3.14 * 2 * r;
			System.out.println("Area Of A Cricle: " + a);
			System.out.println("Circumference Of A Circle: " + cir);
		}
		else if (c == 2) 
		{
		    System.out.println("Enter Length: ");
		    l = in.nextDouble();
		    System.out.println("Enter Breadth: ");
		    b = in.nextDouble();
		    area = l * b;
		    p =  ((2 * l) + (2 * b));
		    System.out.println("Area Of A Rectangle: " + area);
			System.out.println("Perimeter Of A Rectangle: " + p);
			
		    
		    
		    
		    
		}
		
	

	    





	}

}
