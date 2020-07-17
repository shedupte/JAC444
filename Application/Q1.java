	import java.util.Scanner; 
	
public class Q1 {

	  public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);

	    // Asks for User input of Status
	    System.out.print("Please enter Status\n"
	    		+ "0-single filer\n"
	    		+ "1-married jointly,\n" 
	    		+ "2-married separately\n"
	    		+ "3-head of household)\n");

	    int status = scanner.nextInt();

	    // Asks user for input of income
	    System.out.print("Enter income: ");

	    double income = scanner.nextDouble();

	    double tax = 0;


	 //tax for single filers
	   switch(status) { 
	   case 0:
		   if (income <= 8350)

	        tax = income * 0.10;

	      else if (income <= 33950)

	        tax = 8350 * 0.10 + (income - 8350) * 0.15;

	      else if (income <= 82250)

	        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +

	          (income - 33950) * 0.27;

	      else if (income <= 171550)

	        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +

	          (82250 - 33950) * 0.27 + (income - 82250) * 0.30;

	      else if (income <= 372950)

	        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +

	          (82250 - 33950) * 0.27 + (171550 - 82250) * 0.30 +

	          (income - 171550) * 0.35;

	      else

	        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +

	          (82250 - 27950) * 0.27 + (171550 - 82250) * 0.30 +

	          (372950 - 171550) * 0.35 + (income - 372950) * 0.386;

		   
		   // tax for married file jointly
	   case 1: {
		   if (income <= 8350)

		        tax = income * 0.10;

		      else if (income <= 33950)

		        tax = 8350 * 0.10 + (income - 8350) * 0.15;

		      else if (income <= 82250)

		        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +

		          (income - 33950) * 0.27;

		      else if (income <= 171550)

		        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +

		          (82250 - 33950) * 0.27 + (income - 82250) * 0.30;

		      else if (income <= 372950)

		        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +

		          (82250 - 33950) * 0.27 + (171550 - 82250) * 0.30 +

		          (income - 171550) * 0.35;

		      else

		        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +

		          (82250 - 27950) * 0.27 + (171550 - 82250) * 0.30 +

		          (372950 - 171550) * 0.35 + (income - 372950) * 0.386;
	    }
	   
	   
	    //tax for married separately
	   case 2: { 
		   if (income <= 8350)

		        tax = income * 0.10;

		      else if (income <= 33950)

		        tax = 8350 * 0.10 + (income - 8350) * 0.15;

		      else if (income <= 68525)

		        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +

		          (income - 33950) * 0.27;

		      else if (income <= 104425)

		        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +

		          (68525 - 33950) * 0.27 + (income - 68525) * 0.30;

		      else if (income <= 186475)

		        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +

		          (68525 - 33950) * 0.27 + (104425 - 68525) * 0.30 +

		          (income - 104425) * 0.35;

		      else

		        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +

		          (68525 - 27950) * 0.27 + (104425 - 68525) * 0.30 +

		          (186475 - 104425) * 0.35 + (income - 186475) * 0.386;
	    }

	   // tax for head of household
	   case 3:  { 
		   if (income <= 8350)

		        tax = income * 0.10;

		      else if (income <= 33950)

		        tax = 8350 * 0.10 + (income - 8350) * 0.15;

		      else if (income <= 82250)

		        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +

		          (income - 33950) * 0.27;

		      else if (income <= 171550)

		        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +

		          (82250 - 33950) * 0.27 + (income - 82250) * 0.30;

		      else if (income <= 372950)

		        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +

		          (82250 - 33950) * 0.27 + (171550 - 82250) * 0.30 +

		          (income - 171550) * 0.35;

		      else

		        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +

		          (82250 - 27950) * 0.27 + (171550 - 82250) * 0.30 +

		          (372950 - 171550) * 0.35 + (income - 372950) * 0.386;
	    }


	    // Display the result
	    System.out.println("Tax is " + (int)(tax * 100) / 100.0);

	  }

	}
}
