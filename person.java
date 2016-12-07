//person.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class person {
	private String forename;
	private String surname;
	private String addressStreet, addressTown,addressCounty, addressCountry;
	private String DOB;
	private String PhoneNo;
	private String email;
	
	
	public person(){
	setForename("unknown");
	setSurname("unknown");
	setAddressStreet("unknown");
	setAddressTown("unknown");
	setAddressCounty("unknown");
	setAddressCountry("unknown");
	setDOB("unknown");
	setPhoneNo("unknown");
	setEmail("unknown");
}

//mutator methods
	public void setForename(String forename){
		this.forename = forename;
	}
	
	public void setSurname(String surname){
		this.surname = surname;
	}
	
	public void setAddressStreet(String addressStreet){
		this.addressStreet = addressStreet;
	}
	
	public void setAddressTown(String addressTown){
		this.addressTown = addressTown;
	}
	
	public void setAddressCounty(String addressCounty){
		this.addressCounty = addressCounty;
	}
	
	public void setAddressCountry(String addressCountry){
		this.addressCountry = addressCountry;
	}
	
	public void setDOB(String DOB){
		this.DOB = DOB;
	}
	
	public void setPhoneNo(String PhoneNo){
		this.PhoneNo = PhoneNo;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	//accessor mehods
	public String getForename(){
		return this.forename;
	}
	
	public String getSurname(){
		return this.surname;
	}
	
	public String getAddressStreet(){
		return this.addressStreet;
	}
	
	public String getAddressTown(){
		return this.addressTown;
	}
	
	public String getAddressCounty(){
		return this.addressCounty;
	}
	
	public String getAddressCountry(){
		return this.addressCountry;
	}
	
	public String getDOB(){
		return this.DOB;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	//toString() method
	public String toString()
	{
		return "Foreame: " + getForename() + "\nSurname: " + getSurname() + "\nAddress: \n" 
			+ getAddressStreet() + "\n" + getAddressTown() + "\n" + getAddressCounty() +
				 "\n" + getAddressCountry() + "\nDate of birth: " + getDOB() + 
				 	"\nEmail: " + getEmail();
	}
}