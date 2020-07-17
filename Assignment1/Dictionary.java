/*Create a dictionary of words, as a String array. 

Initialize you array in your main method. 
Make this array size 20 (with 20 words) – add any words you wish (preferably greater than 5 characters per word – to make things interesting).  
For example 

Create a program that will initialize the dictionary, then randomly select a word from the dictionary.
 Given the word, display the following to the screen:

Check if the character is in the word.. if so, display the locations in the word where the character exists.
 e.g, Banana--> you need 6 characters and yous should start filling in the dashes with the proper character.

If the character does not exist, print out a message saying so, 
then output the hidden word again When you finished the word, print out " Yay you guessed it "

Name :Tenzin Shedup

Student ID: 120664180

If any part of your code does not have a comment in each section of your code and does not include the above declarations,
you will receive 0 for the whole midterm. 

*/

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Dictionary {

	public static void main(String[] arg) {
		
		String[] dictionary = {"adults","basicly","debugging","router","chalky","honour","drafted","charming","floats", 
								"closed","ordered","flying","giving","bright", "lighter","advanced", "clashed","quietly","modeled"}; //Initialize Dictionary String array
		
		Random rand = new Random(); //Create an instance of Random Class
		
		int randNum= rand.nextInt(20);//Generate int value from 0 to 19
		
		String word= dictionary[randNum];//Generates dictionary word from array
		
		int len =word.length();//length of the word is recorded
		
		System.out.println(word+ " is the word for referemce");//word is printed for reference
		
		String[] correctWord= new String[len];//Create an new array for word 
		
		Arrays.fill(correctWord, "_");//the array to be filled with blank "_"
		
		
		int complete=0;// variable keep tracks of the correct guess
		
		do {
			
			System.out.println(Arrays.toString(correctWord)+ " ");//prints out the hidden word, and any correct guesses
			
			System.out.println("Guess a letter");
		
			Scanner input = new Scanner(System.in);// Create an instance of Scanner Class
		
			char guess = input.next().charAt(0);// takes in user input/guess
		
				for(int i =0; i<len; i++) {//for loops through each char of the word
				
					boolean check=(word.charAt(i) == guess);//compares to see if guess matches char in the hidden word
				
					if(check!=true && i>len) {//if none of the char matches the guess then do this
						
						System.out.println(guess+" is not in the world");//outputs error
						
						}

					else if ( check == true) {// if there is a word match
					
						System.out.println("correct");//outputs to the screen "correct"
					
						correctWord[i]=Character.toString(word.charAt(i)); //transfers the correct guess to the hidden word array and replaces the blank "_"
					
						complete +=1;// adds to correct guesses
					
						}
				
					}
			
			}while(complete !=len);//keep asking for guesses until hidden word is complete
		
			System.out.println("Yay you guessed it");//Guessed the entire word correct output
	}
}
