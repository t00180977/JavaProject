//Flight.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*; 
import java.util.*;

public class Flight extends JFrame /*implements ActionListener*/{
	
	JMenu FileMenu, MainMenu;
    int count;
    
    //driver
    public static void main( String[] args ) {
        Flight frame = new Flight();
        frame.setVisible(true);
    }

    private String forename;
	private String surname;
	private String address;
	private String DOB;
	private String PhoneNo;
	private String email;
	private final double insurance = 20;
	private final double luggage = 20;
	private ArrayList<String> Destinations = new ArrayList<String>();

public Flight(){
	setForename("unknown");
	setSurname("unknown");
	setAddress("unknown");
	setDOB("unknown");
	setPhoneNo("unknown");
	setEmail("unknown");
}
//mutator methods
	public void setForename(String forename){
		this.forename = forename;
	}
	
	public void setSurname(String Surname){
		this.surname = surname;
	}
	
	public void setAddress(String address){
		this.address = address;
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
	
	//accessor methods
	public String getForename(){
		return this.forename;
	}
	
	public String getSurname(){
		return this.surname;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public String getDOB(){
		return this.DOB;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public String toString()
	{
		return "Name: " + getForename() + " " + getSurname() + "\nAddress: " 
			+ getAddress() + "\nDate of birth: " + getDOB() + "\nEmail: " 
				+ getEmail() + "Insurance: " + insurance + "Luggage: " + luggage;
	}

}




/*
public class Flight extends JFrame {
	public Flight(){
	JMenu mainMenu, fileMenu;
	    setTitle("Book a flight");
		setSize(300,200);
		setLocation(150,250);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	//driver
public static void main(String args[]){
	Flight frame = new Flight();
        frame.setVisible(true);
	}
	
	
	
	
/*public class Flight {
	private String forename, surname, address, DOB, PhoneNo, email;
	private final double insurance = 20;
	private final double luggage = 20;
	
	public Flight() {
		setForename("unknown");
		setSurname("unknown");
		setAddress("unknown");
		setDOB("unknown");
		setPhoneNo("unknown");
		setEmail("unknown");
	}
	
	
} 
}*/

/*import javax.swing.*;
import java.awt.*;

public class Flight {
	private String forename;
	private String surname;
	private String address;
	private String DOB;
	private String PhoneNo;
	private String email;
	private final double insurance = 20;
	private final double luggage = 20;

public Flight(){
	setForename("unknown");
	setSurname("unknown");
	setAddress("unknown");
	setDOB("unknown");
	setPhoneNo("unknown");
	setEmail("unknown");
}
//mutator methods
	public void setForename(String forename){
		this.forename = forename;
	}
	
	public void setSurname(String Surname){
		this.surname = surname;
	}
	
	public void setAddress(String address){
		this.address = address;
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
	
	//accessor methods
	public String getForename(){
		return this.forename;
	}
	
	public String getSurname(){
		return this.surname;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public String getDOB(){
		return this.DOB;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public String toString()
	{
		return "Name: " + getForename() + " " + getSurname() + "\nAddress: " 
			+ getAddress() + "\nDate of birth: " + getDOB() + "\nEmail: " 
				+ getEmail() + "Insurance: " + insurance + "Luggage: " + luggage;
	}
	
	//driver
	
	public class Flight{
	public static void main(String args[])
	{
		//cgh;
	}*/
	//}

//}