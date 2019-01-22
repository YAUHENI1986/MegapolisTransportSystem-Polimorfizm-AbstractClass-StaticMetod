package by.itacademy.levaniuk.transport.car;

import by.itacademy.levaniuk.engine.Engine;
import by.itacademy.levaniuk.transport.Transport;

public class Car extends Transport {
	
	private int door;
		
	public Car() {
		super();
	}
	
	public Car(String nameTransport, Engine engine, int door, double cost, int passengers, String colorTransport, double tank) {
		super(nameTransport, engine);
		this.setCost(cost);
		this.setPassengers(passengers);
		this.setColorTransport(colorTransport);
		this.setTank(tank);
		this.door = door;
	}

	@Override
	public void IamCan() {
		System.out.println("Я машина, маленькая и шистрая");		
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}
	
}