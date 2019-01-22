package by.itacademy.levaniuk.transport;

import by.itacademy.levaniuk.engine.Engine;

public abstract class FlyTransport extends Transport {
	
	private double rangeFlight;
	private double maxHeight;
	private int countEngine;
	
	protected FlyTransport() {
		super();
	}
	
	protected FlyTransport(String nameTransport, Engine engine) {
		super(nameTransport, engine);		
	}

	@Override
	protected void IamCan() {
		System.out.println("Я умею летать");
	}

	public double getRangeFlight() {
		return rangeFlight;
	}

	public void setRangeFlight(double rangeFlight) {
		this.rangeFlight = rangeFlight;
	}

	public double getMaxHeight() {
		return maxHeight;
	}

	public void setMaxHeight(double maxHeight) {
		this.maxHeight = maxHeight;
	}

	public int getCountEngine() {
		return countEngine;
	}

	public void setCountEngine(int countEngine) {
		this.countEngine = countEngine;
	}
	
}