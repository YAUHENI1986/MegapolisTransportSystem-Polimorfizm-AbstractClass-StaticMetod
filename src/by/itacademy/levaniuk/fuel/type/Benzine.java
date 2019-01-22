package by.itacademy.levaniuk.fuel.type;

import by.itacademy.levaniuk.fuel.Fuel;

public class Benzine extends Fuel{
	
	private int octaneNumber;
	
	public Benzine() {
		
	}
	
	public Benzine(String nameFuel, double priceFuel, int octaneNumber) {
		super(priceFuel);
		this.setTypeFuel("Benzine");
		this.octaneNumber = octaneNumber;
		this.setToxicity("High toxicity");
		this.setNameFuel(nameFuel);
	}

	public int getOctaneNumber() {
		return octaneNumber;
	}
	
	@Override
	public void infoFuel() {		
		System.out.println(getNameFuel() + ", октановое число " + getOctaneNumber() + ", цена за 1 литр " + getPriceFuel());
	}
	
}