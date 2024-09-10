import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
        int a, r, sum = 0, temp;
        System.out.println("Enter Number: ");
        a = in.nextInt();
        temp = a;
        while (a > 0)
        {
        	r = a % 10;
        	sum = (sum * 10) + r;
        	a = a / 10;
        	
        }
        if (temp == sum) {
        	System.out.println("The Number is A Palindrome. ");
        }
        else 
        {
        	System.out.println("the Number is Not A Palindrome. ");
        }
        

	}

}
