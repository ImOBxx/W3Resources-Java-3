import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, sum = 0, n, temp;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Number: ");
	    n = in.nextInt();
	    temp = n;
	    while (n > 0)
	    {
	    	r = n % 10;
	    	sum = sum + (r * r * r);
	    	n = n / 10;
	    }
	    if (temp == sum)
	    {
	    	System.out.println("The Number Is A Armstrong Number. ");
	    }
	    else
	    {
	    	System.out.println("The Number Is Not An Armstrong Number. ");
	    }
	    

	}

}
