package Person;

//Define Person Class
//Will be used to extend sub classes of off
public class Person {
	
	//Data field
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;
    
    //Constructor
    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }
    
    
    //Get and Set Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //Diplaying set information of class
    public String toString() {
		return "\nName: " + name + "\nAddress: " + address + "\nPhone number: " + phoneNumber + "\nEmail address: " + email;
    }
}



