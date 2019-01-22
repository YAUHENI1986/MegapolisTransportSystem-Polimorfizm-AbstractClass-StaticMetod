package by.itacademy.levaniuk.transport.car;

import by.itacademy.levaniuk.transport.Transport;
import by.itacademy.levaniuk.engine.Engine;

public class Bus extends Transport {
	
	private double cargo;
	private boolean tikets;
	
	public Bus() {
		super();
	}
	
	public Bus(String nameTransport, Engine engine, double cost, String colorTransport, double tank, double cargo) {
		super(nameTransport, engine);
		this.setCost(cost);
		this.setColorTransport(colorTransport);
		this.setTank(tank);
		this.cargo = cargo;
		this.tikets = true;
	}

	@Override
	public void IamCan() {
		System.out.println("Автобус мого перевозит людей");		
	}
	
	public void makeCarriage(int x) {
		this.setPassengers(x);
	}
	
	public void destroyPassengers() {
		this.setPassengers(0);
	}

	public double getCargo() {
		return cargo;
	}

	public void setCargo(double cargo) {
		this.cargo = cargo;
	}

	public boolean isTikets() {
		return tikets;
	}

	public void setTikets(boolean tikets) {
		this.tikets = tikets;
	}
		
}