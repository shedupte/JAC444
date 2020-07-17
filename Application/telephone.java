/*
The international standard letter/number mapping found on the telephone is shown below

Write a program that reads a letter and displays its corresponding digit
*/
/*
 I declare that the attached assignment is my own work in accordance with Seneca Academic Policy. No part of this test has been copied manually or electronically from any other source (including web sites) or distributed to other students.


Name :Tenzin Shedup

Student ID: 120664180

If any part of your code does not have a comment in each section of your code and does not include the above declarations, you will receive 0 for the whole midterm. 

 * */

import java.util.Scanner;

public class telephone {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
		System.out.println("Enter Letter");//asks the user for input
		char letter= myObj.next().charAt(0);// takes user input
		int num=0; 
		
		if (letter=='A'||letter =='B'||letter =='C') {// The section below matches the user input to the section of numbers mapped on the telephone
			num =2;}
		else if(letter=='D'||letter =='E'||letter =='F')
			num =3;
		else if(letter=='G'||letter =='H'||letter =='I')
			num =4;
		else if(letter=='J'||letter =='K'||letter =='L')
			num =5;
		else if(letter=='M'||letter =='N'||letter =='O')
			num =6;
		else if(letter=='P'||letter =='Q'||letter =='R'||letter =='S')
			num =7;
		else if(letter=='T'||letter =='U'||letter =='V')
			num =8;
		else if(letter=='W'||letter =='X'||letter =='Y'||letter =='Z')
			num=9;
		
		System.out.println("number is" + num);//prints the mapped number letter
	}
	
}
