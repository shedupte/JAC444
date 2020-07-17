
public class Q4 {
	public static void main(String arg[]) {
		int num;
		
		System.out.println("INT      Factorial product");
//Factorial of integers from 1 to 5
//First for loop, loops through all integers
	for (int x=1; x<=5; x++){
		num=1;
		
		//Second loop for multiplying to find factorial product
		for (int y=1; y<=x; y++) {
			num*= y;
		}
		//prints outcome
		System.out.println(x + "              " + num);
		
		}
	
	}
}
