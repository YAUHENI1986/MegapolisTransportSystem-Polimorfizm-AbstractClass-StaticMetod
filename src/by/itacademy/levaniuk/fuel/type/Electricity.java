package by.itacademy.levaniuk.fuel.type;

import by.itacademy.levaniuk.fuel.Fuel;

public class Electricity extends Fuel{

	public Electricity() {
		
	}
	
	public Electricity(String nameFuel, double priceFuel) {
		super(priceFuel);
		this.setTypeFuel("Electricity");
		this.setToxicity("Clear energy");
		this.setNameFuel(nameFuel);
	}

	@Override
	public void infoFuel() {
		 System.out.println(getNameFuel() + ", цена за 1 Квт " + getPriceFuel());
	}	

}