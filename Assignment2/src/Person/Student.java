package Person;

//Student Class sub Class of Person
public class Student extends Person {
	
	//Data Field
	protected String status;
	
	//Constructor
	public Student(String name,String address, String phoneNumber, String email, String status) {
		super(name, address, phoneNumber, email);
		this.status=status;
	}
	
	//Get and Set Methods
	public void setSatus(String status) {
		this.status=status;
	}
	
	public String getStatus() {
		return status;
	}
	
	//Override toString method
	public String toString() {
		return super.toString() + "\nStatus: " + getStatus();
	}
}