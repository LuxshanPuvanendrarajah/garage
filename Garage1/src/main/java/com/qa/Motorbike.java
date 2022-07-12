package com.qa;

public class Motorbike extends Vehicle{
	private int speed;
	private boolean sidecar;
	public Motorbike() {
		
	}
	public Motorbike(String type, String name, int tyres, int seats,int speed,boolean sidecar) {
		super(type, name, tyres, seats);
		this.sidecar = sidecar;
		this.speed = speed;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Motorbike \n speed: " + speed + "mph\n sidecar: " + sidecar ;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isSidecar() {
		return sidecar;
	}
	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}
	
	
}
