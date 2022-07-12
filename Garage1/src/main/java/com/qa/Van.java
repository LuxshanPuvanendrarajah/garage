package com.qa;

public class Van extends Vehicle{
	private int loadcapacity;
	private boolean passengerVan;
	public Van() {
		
	}
	public Van(String type, String name, int tyres, int seats,int loadcapacity,boolean passengerVan) {
		super(type, name, tyres, seats);
		this.loadcapacity = loadcapacity;
		this.passengerVan = passengerVan;
		
	}
	@Override
	public String toString() {
		return super.toString()+"\n Vans \n loadcapacity: " + loadcapacity + "litres\n passengerVan: " + passengerVan;
	}
	public int getLoadcapacity() {
		return loadcapacity;
	}
	public void setLoadcapacity(int loadcapacity) {
		this.loadcapacity = loadcapacity;
	}
	public boolean isPassengerVan() {
		return passengerVan;
	}
	public void setPassengerVan(boolean passengerVan) {
		this.passengerVan = passengerVan;
	}
	
	
	
}
