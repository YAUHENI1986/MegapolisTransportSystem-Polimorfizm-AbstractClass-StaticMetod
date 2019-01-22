package by.itacademy.levaniuk.transport.fly;

import by.itacademy.levaniuk.engine.type.FlyEngine;

public class Helicopter extends Plane{
	
	public Helicopter() {
		super();
	}
	
	public Helicopter(String nameTransport, FlyEngine engine, double cost, int passengers, String colorTransport, double tank) {
		super(nameTransport, engine, cost, passengers, colorTransport, tank);
	}
	
	protected void IamCan() {
		System.out.println("У меня четыре лопасти");
	}
	
}