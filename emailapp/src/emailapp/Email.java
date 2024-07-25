package emailapp;

import java.util.Scanner;

public class Email {
private	String firstname;
private	String lastname;
private	String department;
private	String password;
private String email;
private int    DefaultPasswordLength = 10;
private	String alternateEmail;
private	int    mailBoxCapacity = 500;
private String CompanySuffix = "Company.com" ;

// constructor for receiving last and first name
public Email(String firstname , String lastname) {
	this.firstname = firstname;
	this.lastname = lastname;



// call a method asking for department and return department
   this.department = setDepartment();
  
   
// call a method for generating random password
   this.password = Randompassword(DefaultPasswordLength);
   System.out.println("Your Password is " + this.password);
   
 // combine elements to generate email
   email = this.firstname.toLowerCase() + this.lastname.toLowerCase() + "@" + department + "." +  CompanySuffix ;
   
}

//ask for department
   private String setDepartment() {
   System.out.print("DEPARTMENT CODES \n1 for sales\n2 for devlopment\n3 for accounting\n0 for none\nENTER YOUR CODE :");
   Scanner in = new Scanner(System.in);
   int depChoice = in.nextInt();
   if (depChoice==1) {return "sales" ;}
   else if(depChoice==2) {return "devlopment";}
   else if(depChoice==3) {return "accounting";}
   else {return " ";}
   }
   
   
   
 // random password
   private String Randompassword(int length){
	   String setPassword = "ASDFGHJKLQWERTYUIOPZXCVBNM1234567890!@#$%";
	   char[] password = new char[length];
	   for (int i=0 ; i<length ; i++ ) {
		   int rand = (int)  (Math.random() * setPassword.length());
		   password[i] = setPassword.charAt(rand);
	   }
	   
	   return new String (password);
	    }
   
  //alternate email 
   public void  setAlternateEmail(String altemail ) {
	   this.alternateEmail = altemail;
   }
   
   
   //change password
   public void changePassword(String password) {
	   this.password = password;
	   }
   
   //mailboxcapacity
   public void setMailBoxCapacity(int Capacity) {
	   this.mailBoxCapacity = Capacity;
   }
   
   public int getMailBoxCapacity() { return mailBoxCapacity;}
   public String getPassword() {return password;}
   public String getAlternateEmail() {return alternateEmail;}
   
   public String Showinfo() {
	   return "DISPLAY NAME " + firstname + " "+ lastname + 
			   "company email " + email + " " +
			   "capacity " + mailBoxCapacity + "mb" ;
			   
   }
   
   
   
   
   
   
   
   
   
  }