package by.itacademy.levaniuk.transport.fly;

import by.itacademy.levaniuk.engine.type.FlyEngine;
import by.itacademy.levaniuk.transport.FlyTransport;

public class Plane extends FlyTransport{
	
	private double cargo;
	
	public Plane () {
		super();
	}
	
	public Plane (String nameTransport, FlyEngine engine, double cost, int passengers, String colorTransport, double tank) {
		super(nameTransport, engine);
		this.setCost(cost);
		this.setPassengers(passengers);
		this.setColorTransport(colorTransport);
		this.setTank(tank);
	}

	public double getCargo() {
		return cargo;
	}

	public void setCargo(double cargo) {
		this.cargo = cargo;
	}

	@Override
	protected void IamCan() {
		System.out.println("Летаю как птичка");
	}
	
}
