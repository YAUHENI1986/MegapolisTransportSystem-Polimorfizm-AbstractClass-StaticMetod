package by.itacademy.levaniuk.transport.electro;

import by.itacademy.levaniuk.engine.Engine;
import by.itacademy.levaniuk.transport.car.Car;

public class ElectroCar extends Car{
	
	private double tankE;
	
	public ElectroCar() {
		super();
	}
	
	public ElectroCar (String nameTransport, Engine engine, int door, double cost, int passengers, String colorTransport, double tank) {
		super(nameTransport, engine, door, cost, passengers, colorTransport, tank);
		this.tankE = tank;
		this.setTank(0);		
	}

	public double getTankE() {
		return tankE;
	}

	public void setTankE(double tankE) {
		this.tankE = tankE;
	}	

}