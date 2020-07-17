package Person;

//Sub Class Employee from Person Class
public class Employee extends Person {
	
	//data fields
    protected double salary;
    protected String office;
    protected Date dateHired;

    //constructor
    public Employee(String name,String address,String phoneNumber,String email,  String office, double salary) {
        super(name, address, phoneNumber, email);
        this.salary = salary;
        this.office = office;
        this.dateHired = new Date();
    }
    
    //Get and Set Methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getDateHired() {
        return dateHired.getDay() + " " + dateHired.getMonth() + " " + dateHired.getYear();
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }
    
    //Override to String method
    public String toString() {
    	return super.toString() + "\nOffice: " + office + "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
    }
}