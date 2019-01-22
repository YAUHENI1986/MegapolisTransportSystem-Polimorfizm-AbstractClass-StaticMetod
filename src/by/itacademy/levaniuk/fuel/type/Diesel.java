package by.itacademy.levaniuk.fuel.type;

import by.itacademy.levaniuk.fuel.Fuel;

public class Diesel extends Fuel{
	
	private double densityFuel;	//плотность топлива
	
	public Diesel() {
		
	}
	
	public Diesel(String nameFuel, double priceFuel, double densityFuel) {
		super(priceFuel);
		this.setTypeFuel("Diesel");
		this.densityFuel = densityFuel;
		this.setToxicity("High toxicity");
		this.setNameFuel(nameFuel);
	}

	@Override
	public void infoFuel() {
		System.out.println(getNameFuel() + ", плотность топлива " + getDensityFuel() + "кг/м3, цена за 1 литр " + getPriceFuel());		
	}

	public double getDensityFuel() {
		return densityFuel;
	}	
	
}