package com.qa;

public class Vehicle {
	private String type;
	private String name;
	private int tyres;
	private int seats;
	
	public Vehicle() {}
	public Vehicle(String type, String name, int tyres, int seats) {
		super();
		this.type = type;
		this.name = name;
		this.tyres = tyres;
		this.seats = seats;
		}
	@Override
	public String toString() {
		return "Transport \n Vehicle name: " + name + "\n Vehicle type: " + type + "\n Vehicle has  " + tyres + " Tyres"+
				" \n Can hold "+ seats + " many passengers.";}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTyres() {
		return tyres;
	}
	public void setTyres(int tyres) {
		this.tyres = tyres;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	
}
