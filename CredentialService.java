package EmailApplication.Services;

import java.util.Random;


public class CredentialService {
	
    //Method to generate Email Address
	
	public String generateEmailAddress(String firstName,String lastName,String deptName) {
		return(firstName+lastName+"@"+deptName+".cg.com");
	}
	
	//Method to generate password
	
	public StringBuilder generatePassword() {
		
		  int length =10;
		  String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[length];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      
	      StringBuilder sb = new StringBuilder();
	      return (sb.append(password));
		
	}
	
	//Method  to display credentials
	
	public void showCredentials(String firstName, String email, StringBuilder pwd) {
		
		String s1 ="Dear ";
		String s2 =" your generated credentials are as follows";
		String s3 ="Email    ---> ";
		String s4 ="Password ---> ";
		System.out.println(s1+firstName+s2);
		System.out.println(s3+email);
		System.out.println(s4+pwd);
	}
}
