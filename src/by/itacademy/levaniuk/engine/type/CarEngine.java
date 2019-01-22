package by.itacademy.levaniuk.engine.type;

import by.itacademy.levaniuk.engine.Engine;

public class CarEngine extends Engine {
	
	private double volume;
	private double expense;
	private String classEcology;
		
	public CarEngine() {
		super();
	}
	
	public CarEngine(String colorEngine) {
		super();
		this.setNameEngine("V8 SuperAT");
		this.setColorEngine(colorEngine);
		this.setMaxSpeed(135);
		this.volume = 1.6;
		this.expense = 7.7;
		this.classEcology = "Euro4";
	}
	
	public CarEngine(String nameEngine, int maxSpeed, String colorEngine, double volume, double expense, String classEcology) {
		super(nameEngine, maxSpeed);
		this.setColorEngine(colorEngine);
		this.setMaxSpeed(maxSpeed);
		this.volume = volume;
		this.expense = expense;
		this.classEcology = classEcology;
	}
	
	@Override
	public void infoEngine() {
		System.out.println(getNameEngine() + ", объём двигателя " + getVolume() + ", максимальная скорость " + getMaxSpeed());
	}
	
	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getExpense() {
		return expense;
	}

	public void setExpense(double expense) {
		this.expense = expense;
	}

	public String getClassEcology() {
		return classEcology;
	}

	public void setClassEcology(String classEcology) {
		this.classEcology = classEcology;
	}
	
}
