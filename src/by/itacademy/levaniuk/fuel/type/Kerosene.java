package by.itacademy.levaniuk.fuel.type;

public class Kerosene extends Diesel{
	
	public Kerosene() {
		
	}
	public Kerosene(String nameFuel, double priceFuel, double densityFuel) {
		super(nameFuel, priceFuel, densityFuel);
		this.setTypeFuel("Kerosene");
		this.setToxicity("High toxicity");
	}

	public void infoFuel() {
		System.out.println(getNameFuel() + ", плотность топлива " + getDensityFuel() + "г/см3, цена за 1 литр " + getPriceFuel());
	}	

}