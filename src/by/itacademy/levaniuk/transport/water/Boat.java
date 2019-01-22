package by.itacademy.levaniuk.transport.water;

import by.itacademy.levaniuk.engine.type.FlyEngine;
import by.itacademy.levaniuk.transport.WaterTransport;

public class Boat extends WaterTransport {
	
	public Boat () {
		super();
	}
	public Boat (String nameTransport, FlyEngine engine, boolean dive, boolean arsenal, double cost, int passengers, String colorTransport, double tank) {
		super(nameTransport, engine, dive, arsenal);
		this.setCost(cost);
		this.setColorTransport(colorTransport);
		this.setTank(tank);
		this.setPassengers(passengers);
	}
	@Override
	protected void IamCan() {
		System.out.println("Бысто плавать - моя основная задача!!!");
	}

}
