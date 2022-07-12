package garagetest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.Car;
import com.qa.garage.Garage;

public class Garagetest {
	Garage tester = new Garage();
	Car carTest = new Car("Car","BMW",4,5,"Large",5);
	
	@Test
	public void addVehicle() {
		
	assertEquals("item added", tester.addVehicle(carTest));}
	
	@Test
	 public void removeVehicle() {
       
        tester.addVehicle(carTest);

        assertEquals("item removed", tester.removeVehicle(carTest));
	}
	@Test
	 public void allVehicle() {
        
        tester.addVehicle(carTest);

        assertEquals("Listed items", tester.allVehicle());}
	
	@Test
	public void deleteVehicle() {
        
        tester.addVehicle(carTest);

        assertEquals("Everything deleted", tester.deleteVehicle());}
	
	

}
