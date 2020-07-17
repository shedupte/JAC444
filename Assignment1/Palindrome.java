/*	A palindromic prime is a prime number that reads the same when reversed 
For example, 131 or 929. Write a program that displays the first 100 palindromic prime numbers. Display 10 numbers per line, separated by exactly one space, as follows:
2 3 5 7 11 101 131 151 181 191 313 353 373 383 727 757 787 797 919 929 .....

 * I declare that the attached assignment is my own work in accordance with Seneca Academic Policy. 
 * 
 * No part of this test has been copied manually or electronically from any other source 
 * (including web sites) or distributed to other students.

Name :Tenzin Shedup

Student ID:120664180 */

public class Palindrome{
	
	public static void main(String[] args) {
		 int totalPrime = 100; 
		 
		 int prime = 0;
		 
		 int testedNum = 2;
		 
		  while (prime < totalPrime) {// loop through till first 100 prime number
			  
		   if (isPrime(testedNum) && isPalindrome(testedNum)) {//execute code below if isPrime method and isPlaindrome method are true
			   
		    prime++;// add to prime counter
		    
		    System.out.print(testedNum + " ");//outputs tested number
		    
		    if (prime % 10 == 0) {// when there line reaches set of 10 prime, break new line
		     
		    	System.out.println();
		    }
		   
		   }
		   
		   testedNum++;//adds to testedNumber counter, loops to test another number
		  
		  }
		 
		 }

	public static boolean isPrime(int number) {	//method to Check integer is a prime number
		
		if (number == 2 || number == 3) {// 2 and 3 are prime number are return true
			
			return true; 
			
		} 
		
		if (number % 2 == 0) { return false;// if a number modulus by 2 and has no remainder then it return false
		
		} 
		
		int sqrt = (int) Math.sqrt(number) + 1; //gives us the square root of the number passed 
		
		for (int i = 3; i < sqrt; i += 2) { 
		
			if (number % i == 0) { // if there is no remainder return false
			
				return false; 
				
			} 
			
		} 
		
		return true;

	}
	
	public static int reverse(int number) {//reverses the integer, to be later used to check by isPlaindrome 
		  int remainder = 0;
		  int reversedInt=0;
		 
		  while (number !=0){//while the number is not zero
			  
		   remainder = number % 10;//keep modulus by 10 and strip the remainder
		   
		   reversedInt = reversedInt* 10 + remainder;// use the remainder to store in variable
		   
		   number /= 10;//divide by 10
		   
		  }
		 
		  return reversedInt;//return the reversed number
		 }
		 
	public static boolean isPalindrome(int number) {//checks integer is same both original and reversed 
		 
		 return (number == reverse(number));//return true if reverse and original are a match
		 
		}
		 
	}
	
	 
			 
		 
