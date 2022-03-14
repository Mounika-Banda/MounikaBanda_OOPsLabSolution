package EmailApplication.model;

public class Employee {
	
	private String firstName;
	private String lastName;
	
	//Getter method for FirstName
	
	public String getFirstName() {
		return firstName;
	}

    //Setter Method for FirstName

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

    //Getter method for LastName

	public String getLastName() {
		return lastName;
	}

    //Setter method for LastName

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

    //Parameterized Constructor

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

}
