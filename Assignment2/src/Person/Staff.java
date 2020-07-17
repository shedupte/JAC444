package Person;

//Staff Class sub class of Employee
public class Staff extends Employee {
	
	//Data Field
    protected String title;
    
    //Constructor
    public Staff(String name,String address,String phoneNumber,String email, String office, double salary,String title) {
        super(name, address, phoneNumber, email, office, salary);
        this.title=title;
    }
    
    //Get and Set methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    //Override String Method
    public String toString() {
    	return super.toString() + "\nTitle: " + title;
    }
}
