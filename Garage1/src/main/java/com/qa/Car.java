package com.qa;

public class Car extends Vehicle {
	private String size;
	private int doors;
	
	public Car() {}
	public Car(String type, String name, int tyres, int seats,String size,int doors) {
		super(type, name, tyres, seats);
		this.size = size;
		this.doors = doors;
	}
	
	@Override
	public String toString() {
		return super.toString() +"\n Car \n size " + size + "\n doors: " + doors ;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	
}
