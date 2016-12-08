//FlightBooking.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*; 
import java.util.*;

public class FlightBooking{
	
	private Flight FlightDetails;
	private person Customer;
	private static int bookingNumber;
	private boolean luggage;
	private int baggage;
	
	public FlightBooking(){
		setBookingNumber(0);
		setLuggage(false);
		setBaggage(0);
	}
	
	//mutator methods
	public void setBookingNumber(int bookingNumber){
		this.bookingNumber = bookingNumber;
	}
	
	public void setLuggage(boolean luggage){
		this.luggage = luggage;
	}
	
	public void setBaggage(int baggage){
		this.baggage = baggage;
	}
	
	//constructor methods
	public Flight getFlightDetails(){
		return this.FlightDetails;
	}
	
	public person getCustomer(){
		return this.Customer;
	}
	
	public int getBookingNumber(){
		return this.bookingNumber;
	}
	
	public boolean getLuggage(){
		return this.luggage;
	}
}