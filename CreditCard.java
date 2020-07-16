import java.util.Scanner;
import java.util.Arrays;

/*Credit card numbers follow certain patterns. A credit card number must have between 13 and 16 digits. It must start with:

	4 for Visa cards

	5 for Master cards

	37 for American Express cards for Discover cards

In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card numbers. The algorithm is useful to determine if a card number is entered correctly or if a credit card is scanned correctly by a scanner. Almost all credit card numbers are generated following this validity check, commonly known as the Luhn check or the Mod 10 check, which can be described as follows (for illustration, consider the card number 4388576018402626):

1. Double every second digit from right to left. If doubling of a digit results in a two-digit number, add up the two digits to get a single-digit number.

	2 * 2 = 4

	2 * 2 = 4

	4 * 2 = 8

	1 * 2 = 2

	6 * 2 = 12 (1 + 2 = 3)

	5 * 2 = 10 (1 + 0 = 1)

	8 * 2 = 16 (1 + 6 = 7)

	4 * 2 = 8

2. Now add all single-digit numbers from Step 1.

	4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37

3. Add all digits in the odd places from right to left in the card number.

   6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38

4. Sum the results from Step 2 and Step 3.

	37 + 38 = 75


5. If the result from Step 4 is divisible by 10, the card number is valid; otherwise, it is invalid. 
	For example, the number 4388576018402626 is invalid, but the number 4388576018410707 is valid.


Write a program that prompts the user to enter a credit card number as a long integer. Display whether the number is valid or invalid.
Name :Tenzin Shedup

Student ID: 120664180

If any part of your code does not have a comment in each section of your code and does not include the above declarations,
you will receive 0 for the whole midterm. 
*/
public class CreditCard {

	public static void main(String[] args) {
		System.out.println("Enter credit card number");//asks user to input credit card number
		Scanner input = new Scanner(System.in);//creates an instance of Scanner
		
		long ccNumber=input.nextLong();//captures the long in variable ccNumber
		
		String tempSize = ccNumber + "";// by add "" it converts the sum into a string
		int size=tempSize.length();// string length is not calcuated and captured in size
		int[] arryNumber = new int[size];


	}
		
	public static boolean isValid(long ccNumber) {// Method to valid credit card number, using Hans Luhn algorithm 
		
		long firstDigit=ccNumber;//captures first digit of credit card
		long fdMasterCard=ccNumber;// captures first two digit of credit card specifically for mastercard
		
		while(firstDigit >= 10)// keeps dividing the creditcard number by 10 until first digit is left
		{
			firstDigit = firstDigit / 10;
		}
		while(fdMasterCard >= 100)//keeps dividing the creditcard number by 10 until first two digit is left
		{
			fdMasterCard = fdMasterCard / 10;
		}
		
		long tempLength=String.valueOf(ccNumber).length();
			
		boolean check=((tempLength>=13 && tempLength<=16) && //This boolean checks if the credit card number is between 13 and 16 digits total
				
						(firstDigit==4|| firstDigit==5||firstDigit==6||fdMasterCard==37 ) &&//and checks to see if first digits are valid
						
						(validSum(ccNumber)==true));//method to valid sum of step 2 and step 3
		return false;//if above aren't met, then check failed and return false
	}

	private static boolean validSum(long ccNumber) {// valid method, to check sum of step 2 and step 3
		if (sumEven(ccNumber)+sumOdd(ccNumber) ==75 ) {
			return true;
		}
		else{
			return false;
		}
	}

	private static int sumOdd(long ccNumber) {// producing the sum for step 2
	
		return 0;
	}

	private static int sumEven(long ccNumber) {//producing the sum for step 3
		
		return 0;
	}
	
	
	
}
