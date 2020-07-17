package Person;

public class Main {

	   public static void main(String[] args) {
		   
		   //Creates instances of Person, Student, Employee, Faculty and Staff.
		   //Tester Class
	        Person person = new Person("Lean","123 main", "6472223333","lean@gmail.com");
	        Student student = new Student("Tenzin","1 surrey", " 6473334444", "Tenzin@gmail.com","Freshman");
	        Employee employee = new Employee("Craig", "234 main", "4164446666", "Craig@gmail.com", "905", 1000.10);
	        Faculty faculty = new Faculty("Faith", "781 st.andrew", "4167896789", "Faith@gmail.com", "906", 1000.20, "12pm-6pm","Teacher");
	        Staff staff = new Staff("Suzy","345 chruch", "4165556666", "Suzy@gmail.com", "906", 1000.30, "Manager");
	        
	        //Displays all the information in each instance.
	        System.out.println(person.toString());
	        System.out.println(student.toString());
	        System.out.println(employee.toString());
	        System.out.println(faculty.toString());
	        System.out.println(staff.toString());

	    }


}

