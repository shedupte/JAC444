/*
Create a class named MyInteger. The class contains:

    An int data field named value that stores the int value represented by this object.
    A constructor that creates a MyInteger object for the specified int value.
    A get method that returns the int value.
    Methods isEven(), isOdd(), and isPrime() that return true if the value is even, odd, or prime, respectively.

    Static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively.
    Static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd, or prime, respectively.
    Methods equals(int) and equals(MyInteger) that return true if the value in the object is equal to the specified value.
    A static method parseInt(char[]) that converts an array of numeric characters to an int value.
    A static method parseInt(String) that converts a string into an int value.

write a tester class to test the above class.
 * */
/*
 I declare that the attached assignment is my own work in accordance with Seneca Academic Policy. No part of this test has been copied manually or electronically from any other source (including web sites) or distributed to other students.


Name :Tenzin Shedup

Student ID: 120664180

If any part of your code does not have a comment in each section of your code and does not include the above declarations, you will receive 0 for the whole midterm. 

 * */

public class MyInteger {
	public static void main(String[] args) {//Tester Class
		MyInteger num1= new MyInteger(2);
		MyInteger num2= new MyInteger(2);
		MyInteger num3= new MyInteger(56);
		MyInteger num4= new MyInteger(13);
		
		System.out.println("int 1 = " + num1.getValue() +" is it a prime number? " + num1.isPrime()+"\n");//prints and checks if integer is prime 
        System.out.println("int 1 = " + num1.getValue() + " is it an even number? " + num1.isEven()+"\n");//prints and checks if integer is even 
        System.out.println("int 1 = " + num1.getValue() + " is it an odd number? " + num1.isOdd()+"\n");//prints and checks if integer is odd 

    	System.out.println("int 2 = "+ num2.getValue()+" is it a prime number? "+ num2.isPrime()+"\n");//prints and checks if integer is prime 
    	System.out.println("int 2 = "+ num2.getValue()+ " is it an even number? "+ num2.isEven()+"\n");//prints and checks if integer is even
        System.out.println("int 2 = " +num2.getValue()+ " is it an odd number? "+ num2.isOdd()+"\n");//prints and checks if integer is odd


    	System.out.println("int 3 = "+ num3.getValue()+" is it a prime number? "+ num3.isPrime()+"\n");//prints and checks if integer is prime 
    	System.out.println("int 3 = "+ num3.getValue()+ " is it an even number? "+ num3.isEven()+"\n");//prints and checks if integer is even
    	 System.out.println("int 3 = " +num3.getValue()+ " is it an odd number? "+ num3.isOdd()+"\n");//prints and checks if integer is odd
    	 
    	 System.out.println("int 4 = "+ num4.getValue()+" is it a prime number? "+ num4.isPrime()+"\n");//prints and checks if integer is prime 
     	System.out.println("int 4 = "+ num4.getValue()+ " is it an even number? "+ num4.isEven()+"\n");//prints and checks if integer is even 
     	 System.out.println("int 4 = " +num4.getValue()+ " is it an odd number? "+ num4.isOdd()+"\n");//prints and checks if integer is odd 

        System.out.println("does " + num1.getValue() + " equal " + num3.getValue()+ "?" + num1.equals(num3)+"\n");  // compares both integers to check if they match      
        System.out.println("does " + num1.getValue() + " equal " + num2.getValue()+ "?" + num1.equals(num2)+"\n");  // compares both integers to check if they match  
        System.out.println("does " + num3.getValue() + " equal " + num4.getValue()+ "?" + num3.equals(num4)+"\n");  // compares both integers to check if they match  
        
        char[] chars= {'1', '2', '0','6','6','4'};
        System.out.println(MyInteger.parseInt(chars));
        
        String string= "180";
        System.out.println(MyInteger.parseInt(string));
	}
    int value;
    MyInteger(int newValue) {
        value = newValue;
    }
    public int getValue() {//A get method that returns the int value.
        return value;
    }
    public static boolean isEven(int num) {//checking integer is even
        return (num % 2 == 0);
    }
    public static boolean isOdd(int num) {//checking integer is odd
        return !isEven(num);
    }
    public static boolean isPrime(int num) {//checking integer is prime
        for (int f = 2; f < num / 2; f++) {
            if (num % f == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(MyInteger num) {//checking integer is even
        return num.isEven();
    }
    public static boolean isOdd(MyInteger num) {//checking integer is odd
        return num.isOdd();
    }
    public static boolean isPrime(MyInteger num) {//checking integer is prime
        return num.isPrime();
    }
    public boolean isEven() {//calls isEven method to check if value is even
        return isEven(value);
    }
    public boolean isOdd() {//calls isEven method to check if value is even
        return isOdd(value);
    }
    public boolean isPrime() {
        return isPrime(value);
    }
    public boolean equals(int num) {//checking is nums are equal, returns true or false
        return (value == num);
    }
    public boolean equals(MyInteger num) {
        return equals(num.getValue());
    }
    public static int parseInt(String string) {
        return Integer.parseInt(string);//A static method parseInt(String) that converts a string into an int value.
    }
    public static int parseInt(char[] chars) {
        return parseInt(new String(chars));//A static method parseInt(char[]) that converts an array of numeric characters to an int value.
    }
}
	

