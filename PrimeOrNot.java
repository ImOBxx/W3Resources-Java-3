import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		int num, ctr = 0;
		Scanner in = new Scanner (System.in);
	    System.out.println("Input A Number: ");
	    num = in.nextInt();
	    for (int a = 1; a <= num; a++)
	    {
	        if (num % a == 0)
	        {
	            ctr++;
	        }

	    }
	    if (ctr == 2)
	    {
	        System.out.println("The Number is Prime Number");
	    }
	    else {
	        System.out.println("The Number Is Not A Prime Number.");
	    } 
	}
}
