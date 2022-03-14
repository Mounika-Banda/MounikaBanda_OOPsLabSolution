package EmailApplication.main;

import java.util.Scanner;
import EmailApplication.Services.CredentialService;
import EmailApplication.model.Employee;

public class EmployeeOperations {

	
	public static void main(String[] args) {
		
		//Create Objects for both Employee and CredentialService class
		
		Employee e1 = new Employee("Amit","Dube");
		CredentialService c1 = new CredentialService();
		
		//Initialization of variables
		int option =0;
		String deptName = null;
		
		//Prints the list of departments
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HumanResouce");
		System.out.println("4. Legal");
		
		//Creation of Object for Scanner class to read input from user
		Scanner sc = new Scanner(System.in);
		option = sc.nextInt();
		
		switch(option){
		case 1: {
			deptName= "tech";
			//Calling methods of CredentialService class
			String empEmail = c1.generateEmailAddress(e1.getFirstName(),e1.getLastName(),deptName);
			StringBuilder pwd = c1.generatePassword();
			c1.showCredentials(e1.getFirstName(),empEmail, pwd);
			break;
		}
		
		case 2: {
			deptName= "admin";
			//Calling methods of CredentialService class
			String empEmail = c1.generateEmailAddress(e1.getFirstName(),e1.getLastName(),deptName);
			StringBuilder pwd = c1.generatePassword();
			c1.showCredentials(e1.getFirstName(),empEmail, pwd);
			break;
		}
	
		case 3: {
			deptName= "hr";
			//Calling methods of CredentialService class
			String empEmail = c1.generateEmailAddress(e1.getFirstName(),e1.getLastName(),deptName);
			StringBuilder pwd = c1.generatePassword();
			c1.showCredentials(e1.getFirstName(),empEmail, pwd);
			break;
		}
		
		case 4: {
			deptName= "legal";
			//Calling methods of CredentialService class
			String empEmail = c1.generateEmailAddress(e1.getFirstName(),e1.getLastName(),deptName);
			StringBuilder pwd = c1.generatePassword();
			c1.showCredentials(e1.getFirstName(),empEmail, pwd);
			break;
		}
		
		default: System.out.println("Invalid Input");
		}
		
		//Closing Scanner
		sc.close();

	}

}
