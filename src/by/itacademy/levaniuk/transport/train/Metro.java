package by.itacademy.levaniuk.transport.train;

import by.itacademy.levaniuk.engine.type.ElectroEngine;
import by.itacademy.levaniuk.transport.TrainTransport;

public final class Metro extends TrainTransport {
	
	public Metro (String nameTransport, ElectroEngine engine, String typeTraffic, int countRailwayCarriage, double cost, int passengers, String colorTransport, double tank) {
		super(nameTransport, engine, typeTraffic);
		this.setTank(tank);
		this.setPassengers(passengers);
		this.setCost(cost);
		this.setCountRailwayCarriage(countRailwayCarriage);
		this.setColorTransport(colorTransport);
	}
	
	protected void IamCan() {
		System.out.println("Под землей вижу пассажиров");		
	}
}