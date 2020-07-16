/*A school has 100 lockers and 100 students. All lockers are closed on the first day of school. 
As the students enter, the first student, denoted S1, opens every locker. 
Then the second student, S2, begins with the second locker, denoted L2, and closes every other locker. 
Student S3 begins with the third locker and changes every third locker (closes it if it was open, and opens it if it was closed). 
Student S4 begins with locker L4 and changes every fourth locker. 
Student S5 starts with L5 and changes every fifth locker, and so on, until student S100 changes L100.

After all the students have passed through the building and changed the lockers, which lockers are open? Write a program to find your answer. The program should display the answer like this:

Locker x is open

Locker y is open

Locker z is open

(Hint: Use an array of 100 boolean elements, each of which indicates whether a locker is open (true) or closed (false). Initially, all lockers are closed.)

Name :Tenzin Shedup

Student ID: 120664180

If any part of your code does not have a comment in each section of your code and does not include the above declarations,
you will receive 0 for the whole midterm. 
*/


public class Lockers {
	
	public static void main(String[] args) {
		
		boolean[] lockers= new boolean[101];// creates an boolean array called lockers
		
		for(int i=0;i<100;i++) {//iterates through all the lockers
			
			lockers[i] = false;//sets all lockers to closed
			
		}
		
		for(int student=1; student<lockers.length; student++) {//goes through all the student numbers
			
			for (int i=student; i<lockers.length;i+=student) {//iterates inside student's locker for loop, as each student checks locker
				lockers[i]=(lockers[i]==true)? false:true;
				/* this asks, is the locker open? if this fact is true, it takes the first answer which is false
				 * however if the locker is not open(true), then the answer would be false and second answer is taken(true)*/
			}
			  
		}
		
	     for (int j = 0; j < lockers.length; j++) {//iterates through all the lockers
	    	 
	            if (lockers[j] == true) //executes code below if the locker is open
	            	
	                System.out.println("Locker " + j + " is open.");//prints out all open locker
	     }
	}	
}
