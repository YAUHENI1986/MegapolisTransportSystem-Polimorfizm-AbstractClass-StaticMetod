package by.itacademy.levaniuk.transport.train;

import by.itacademy.levaniuk.engine.type.CarEngine;
import by.itacademy.levaniuk.transport.TrainTransport;

public class Train extends TrainTransport {
	
	private int driver;
	
	public Train () {
		super();
	}
	
	public Train (String nameTransport, CarEngine engine, String typeTraffic, int driver, int countRailwayCarriage, double cost, int passengers, String colorTransport, double tank) {
		super(nameTransport, engine, typeTraffic);
		this.setTank(tank);
		this.setPassengers(passengers);
		this.setCost(cost);
		this.setCountRailwayCarriage(countRailwayCarriage);
		this.setColorTransport(colorTransport);
		this.driver = driver;
	}

	public int getDriver() {
		return driver;
	}

	public void setDriver(int driver) {
		this.driver = driver;
	}
		
}