package by.itacademy.levaniuk.engine.type;

import by.itacademy.levaniuk.engine.Engine;

public class ElectroEngine extends Engine{
	
	private double expenseE; //потребление кВт
	
	public ElectroEngine(String nameEngine, int maxSpeed, String colorEngine, double expenseE) {
		super(nameEngine, maxSpeed, colorEngine);
		this.expenseE = expenseE;
	}

	public double getExpenseE() {
		return expenseE;
	}

	public void setExpenseE(double expenseE) {
		this.expenseE = expenseE;
	}

	@Override
	public void infoEngine() {
		System.out.println(getNameEngine() + ", потребление " + getExpenseE() + ", максимальная скорость " + getMaxSpeed());
	}
	
}