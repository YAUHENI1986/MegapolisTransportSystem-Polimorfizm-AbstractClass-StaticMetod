package by.itacademy.levaniuk.transport.electro;

import by.itacademy.levaniuk.engine.Engine;
import by.itacademy.levaniuk.transport.car.Bus;

public class ElectroBus extends Bus{
	
	private double tankE;
	
	public ElectroBus () {
		super();
	}
	public ElectroBus (String nameTransport, Engine engine, double cost, String colorTransport, double tank, double cargo) {
		super(nameTransport, engine, cost, colorTransport, tank, cargo);
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