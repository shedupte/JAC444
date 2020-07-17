package Person;

//Sub Class Faculty from Employee Class
public class Faculty extends Employee {
	
	//Data Field
    protected String officeHours;
    protected String rank;

    //Constructor
    public Faculty(String name,String address,String phoneNumber,String email,  String office, double salary, String officeHours,String rank) {
        super(name, address, phoneNumber, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
    //Get and Set Methods
    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    //Override toString Method
    public String toString() {
    	return super.toString() + "\nOffice hours: " + officeHours +"\nRank: " + rank;
    }
}