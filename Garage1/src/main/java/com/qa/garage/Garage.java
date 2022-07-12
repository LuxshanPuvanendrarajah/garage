package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.Vehicle;


public class Garage {

	List <Vehicle> garage = new ArrayList<Vehicle>();
	
	
	// add
	public String addVehicle(Vehicle vehicle) {
	this.garage.add(vehicle);
	return "item added";
	}
	
	//remove
	public String removeVehicle(Vehicle vehicle) {
	this.garage.remove(vehicle);
	return "item removed";
		}
	  // method to iterate through list
	public String allVehicle() {
	    	for (Vehicle p:garage) {
	    		System.out.println(p);}
			return "Listed items";
	    	}
	//clear all
	  public String deleteVehicle() {
		  this.garage.clear();
		return "Everything deleted";}
	  
	  
	  
	 // hire cost 
	  public void hireVehicle() {
		  for (Vehicle p:garage) {
		  	int dayHire = 100;
			int carHire = 5;
			int motorbikeHire = 2;
			int vanHire = 6;
			String transport = p.getType();
			
			if (transport == "Car" ) {
				System.out.println("£"+dayHire * carHire);
				}
			else if (transport == "Motorbike") {
				 System.out.println("£"+dayHire * motorbikeHire);
			}
		  else if( transport == "Van") {
				System.out.println("£"+ dayHire * vanHire);
			}
		  else {
			  System.out.println("no vehicle available");
			  }
		  }
	  }
			
	  
		// remove by type
		  public String removeVehicleType (String type) {
		        
			  List<Vehicle> removeVehicles = new ArrayList<Vehicle>();

		        for (Vehicle v : garage) {
		            if (v.getType() == type) {
		                removeVehicles.add(v);
		            }
		        }

		        for (Vehicle v : removeVehicles) {
		            garage.remove(v);
		        }

		        return "items removed"+ type;
}
	  

}
	
		
	

	  

		
	  
	  
	  
	  
	  
	  

		
	

	

