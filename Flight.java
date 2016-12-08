//Flight.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*; 
import java.util.*;

public class Flight extends JFrame /*implements ActionListener*/{
	
	//main gui
	
	private String origin;
	private String destination;
	private double price;
	private String departureDate;
	private String departureTime;
	private String arrivalDate;
	private String arrivalTime;
	
public Flight(){
	setOrigin("unknown");
	setDestination("unknown");
	setPrice(0.0);
	setDepartureDate("unknown");
	setDepartureTime("unknown");
	setArrivalDate("unknown");
	setArrivalTime("unknown");
}
//mutator methods
	public void setOrigin(String origin){
		this.origin = origin;
	}
	
	public void setDestination(String destination){
		this.destination = destination;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public void setDepartureDate(String departureDate){
		this.departureDate = departureDate;
	}
	
	public void setDepartureTime(String departureTime){
		this.departureTime = departureTime;
	}
	
	public void setArrivalDate(String arrivalDate){
		this.arrivalDate = arrivalDate;
	}
	
	public void setArrivalTime(String arrivalTime){
		this.arrivalTime = arrivalTime;
	}
	
	/*public void setDestinations(ArrayList Destinations){
		this.Destinations = Destinations;
	}*/
	
	//accessor methods
	public String getOrigin(){
		return this.origin;
	}
	
	public String getDestination(){
		return this.destination;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public String getDepartureDate(){
		return this.departureDate;
	}
	
	public String getDepartureTime(){
		return this.departureTime;
	}
	
	public String getArrivalDate(){
		return this.arrivalDate;
	}
	
	public String getArrivalTime(){
		return this.arrivalTime;
	}
	
	/*public ArrayList getDestinations(){
		return this.Destinations;
	}*/
	
	public String toString()
	{
		return "Origin: " + getOrigin() + "\nDestination: " + getDestination() + "\nPrice: " 
			+ getPrice() + "\nDate of departure: " + getDepartureDate() + "\nDeparture time: " 
				+ getDepartureTime() + "Arrival date: " + getArrivalDate() + "Arrival time: " + getArrivalTime();
	}
}