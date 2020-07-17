package Person;

import java.util.Calendar;

//define date class
public class Date {
	
	//data fields
	private int year;
	private int month;
	private int day;
	
	//constructor
	Date() {
		Calendar calander = Calendar.getInstance();
		year = calander.get(Calendar.YEAR);
		month = calander.get(Calendar.MONTH);
		day = calander.get(Calendar.DAY_OF_MONTH);
	}
	
	//Get and Set methods below
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	
	
}
