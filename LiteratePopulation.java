
public class LiteratePopulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pop=80000;
		int popmen=(52*pop)/100;
		int popwomen=pop-popmen;
		int poplit=(48*pop)/100;
		int litmen=(35*popmen)/100;
		int litwomen= poplit-litmen;
		int unlitmen=popmen-litmen;
		int unlitwomen=popwomen-litwomen;
		System.out.println("Total Population          : "+pop);
		System.out.println("Total Mens                : "+popmen);
		System.out.println("Total Womens              : "+popwomen);
		System.out.println("Total Literacy            : "+poplit);
		System.out.println("Total Literacy Mens       : "+litmen);
		System.out.println("Total Literacy Womens     : "+litwomen);
		System.out.println("Total Not Literacy Mens   : "+unlitmen);
		System.out.println("Total Not Literacy Womens : "+unlitwomen);
	}
		
	
		
		
	}


