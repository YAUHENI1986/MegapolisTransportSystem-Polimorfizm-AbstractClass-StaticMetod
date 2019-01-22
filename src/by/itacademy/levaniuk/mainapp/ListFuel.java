package by.itacademy.levaniuk.mainapp;

import by.itacademy.levaniuk.fuel.*;

public class ListFuel {
	
	private static Fuel[] listFuel;
	
	public ListFuel() {
		
	}
	
	public ListFuel(int listCount) {
		ListFuel.listFuel = new Fuel[listCount];
		ListFuel.action();
	}
	
	public void addFuel(Fuel fuel) {
		for (int i = 0; i<listFuel.length; i++) {
			if (listFuel[i] == null) {
				listFuel[i] = fuel;
				break;
			}
			if (listFuel[listFuel.length-1] != null) {
				this.increaseListFuel();
				listFuel[listFuel.length-1] = fuel;
				break;
			}
		}
	}
	
	protected void increaseListFuel() {
		Fuel[] clone = new Fuel[listFuel.length+1];
		for (int a = 0; a<listFuel.length; a++) {
			clone[a] = listFuel[a];
		}
		ListFuel.listFuel = clone;
	}
	
	public void infoListFuel() {		
		for (int i = 0; i<listFuel.length; i++) {
			if (listFuel[i] instanceof Fuel) {
				System.out.println((i+1) + ": " + listFuel[i].getNameFuel() + " " + listFuel[i].getTypeFuel());
			}
		}
	}
	
	public String takeTypeFuel(int x) {
		return listFuel[x].getTypeFuel();
	}
	
	public String takeNameFuel(int x) {
		return listFuel[x].getNameFuel();
	}
	
	public Fuel[] getListFuel() {
		return listFuel;
	}

	public void setListFuel(Fuel[] listFuel) {
		ListFuel.listFuel = listFuel;
	}
	
	public static void action() {
		System.out.println("!!!Создание массива ТОПЛИВА!!!");
	}
	
	public static void listFuel(ListFuel z) {
		MyStaticMetods.returnString("Список доступного топлива");
		for (Fuel x: listFuel) {
			System.out.println(x.getNameFuel() + " -- " + x.getPriceFuel());
		}
		System.out.println();
	}
	
}