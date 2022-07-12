package com.qa.domain;

import com.qa.Car;
import com.qa.Motorbike;
import com.qa.Van;
import com.qa.garage.Garage;

public class Runner {
public static void main(String[] args) {
		
		Garage car = new Garage();
		
		
		Car carOne = new Car("Car","BMW",4,5,"Large",5);
		Car carTwo = new Car("Car","Toyota",4,5,"Medium",5);
		Car carThree = new Car("Car","Seat",4,5,"Small",3);
		Motorbike motorbikeOne = new Motorbike("Motorbike","BMW",2,2,120,false);
		Motorbike motorbikeTwo = new Motorbike("Motorbike","Honda",2,2,120,false);
		Motorbike motorbikeThree = new Motorbike("Motorbike","Ducati",2,2,260,false);
		Van vanOne = new Van("Van","Renault",4,3,1060,false);
		Van vanTwo = new Van("Van","Mercedes",4,3,1200,false);
		Van vanThree = new Van("Van","Vauxhall",4,9,300,true);

		
		car.addVehicle(carOne);
		car.addVehicle(carTwo);
		car.addVehicle(carThree);
		car.addVehicle(motorbikeOne);
		car.addVehicle(motorbikeTwo);
		car.addVehicle(motorbikeThree);
		car.addVehicle(vanOne);
		car.addVehicle(vanTwo);
		car.addVehicle(vanThree);
		
	    car.allVehicle();
	    car.hireVehicle();
	    car.removeVehicleType("Car");
	    car.deleteVehicle();
	
    }

}
