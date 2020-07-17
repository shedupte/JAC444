
public class Q5{
public static void main (String[] args) { 
	for (int day = 1; day <= 12; day++)
		{
			switch (day)
			{
				case 1:
					System.out.println("On the first day of Christmas my true love sent to me");
					break;
				case 2:
					System.out.println("On the second day of Christmas my true love sent to me");
							break;
				case 3:
					System.out.println("On the third day of Christmas my true love sent to me");
							break;
				case 4:
					System.out.println("On the fourth day of Christmas my true love sent to me");
							break;
				case 5:
					System.out.println("On the fifth day of Christmas my true love sent to me");
							break;
				case 6:
					System.out.println("On the sixth day of Christmas my true love sent to me");
							break;
				case 7:
					System.out.println("On the seventh day of Christmas my true love sent to me");
							break;
				case 8:
					System.out.println("On the eighth day of Christmas my true love sent to me");
							break;
				case 9:
					System.out.println("On the ninth day of Christmas my true love sent to me");
							break;
				case 10:
					System.out.println("On the tenth day of Christmas my true love sent to me");
							break;
				case 11:
					System.out.println("On the eleventh day of Christmas my true love sent to me");
							break;
				case 12:
					System.out.println("On the twelfth day of Christmas my true love sent to me");
							break;
			}
			var count=day;
			do {
			switch (count)
			{
				case 12:
					System.out.println ("12 Drummers Drumming\n");
					count--;
					break;
				case 11:
					System.out.println ( "Eleven Pipers Piping\n");
					count--;
					break;
				
				case 10:
					System.out.println ( "Ten Lords a Leaping\n");
					count--;
					break;
				case 9:
					System.out.println ( "Nine Ladies Dancing\n");
					count--;
					break;
				case 8:
					System.out.println ( "Eight Maids a Milking\n");
					count--;
					break;
				case 7:
					System.out.println ( "Seven Swans a Swimming\n");
					count--;
					break;
				case 6:
					System.out.println ( "Six Geese a Laying\n");
					count--;
					break;
				case 5:
					System.out.println ( "Five Golden Rings\n");
					count--;
					break;
				case 4:
					System.out.println ( "Four Calling Birds\n");
					count--;
					break;
				case 3:
					System.out.println ( "Three French Hens\n");
					count--;
					break;
				case 2:
					System.out.println ( "Two Turtle Doves\n and a ");
					count--;
					break;
				case 1:
					System.out.println ("Partridge in a Pear Tree\n\n");
					count--;
					break;
			}
		}while(count>0);
	}

	}
}