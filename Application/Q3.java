

	import java.util.Scanner;
	class arif{
	float a;
	int n;
	public void salespeople(){
	Scanner input =new Scanner (System.in);
	float sum = 0;
	System.out.println("How many product you want to sold ? :");
	n=input.nextInt();
	float a[]=new float[50];
	System.out.println("Enter prices of thats products: ");
	for(int i=0;i<n;i++){
	a[i]=input.nextFloat();

	}
	System.out.println("Total prices are: ");
	for(int i=0;i<n;i++){
	sum=sum+a[i];

	}

	System.out.println(sum);
	float account;
	account=((sum*9)/100)+200;
	System.out.println("Earnings of this weak is "+"$" +account);

	}

	}
	public class Q3 {
	public static void main(String arg[]){
	arif a=new arif();
	a.salespeople();
	}

	}

