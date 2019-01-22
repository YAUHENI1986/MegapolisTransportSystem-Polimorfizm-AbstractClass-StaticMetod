package by.itacademy.levaniuk.engine;

import java.util.Scanner;

import by.itacademy.levaniuk.mainapp.ListFuel;

public abstract class Engine {
	
	private String colorEngine;
	private int maxSpeed;
	private String nameFuel;
	private String typeFuel;
	private String nameEngine;
		
	protected Engine() {
	}
	
	protected Engine(String nameEngine, int maxSpeed) {
		this.nameEngine = nameEngine;
		this.colorEngine = "silver";
		this.maxSpeed = maxSpeed;
	}
	
	public abstract void infoEngine();
		
	public Engine (String nameEngine, int maxSpeed, String colorEngine) {
		this.nameEngine = nameEngine;
		this.maxSpeed = maxSpeed;
		this.colorEngine = colorEngine;
	}
	
	public void addTypeFuel (ListFuel a) {
		System.out.println("Выберете номер вида топлива для дигателя " + this.getNameEngine());
		a.infoListFuel();
		int w =	0;
		boolean x = true;
		while(x) {
			w =	sScanner();
			if(w<=a.getListFuel().length && w>0) {
				this.setTypeFuel(a.takeTypeFuel(w-1));
				this.setNameFuel(a.takeNameFuel(w-1));
				x = false;
			}else {
				System.out.println("Выберите правильный вид из списка! Повторите ввод:...");
			}
		}
	}
	
	@SuppressWarnings("resource")
	public int sScanner() {
		Scanner scanner = new Scanner (System.in);
		int x = scanner.nextInt();
		return x;
	}
	
	public String getColorEngine() {
		return colorEngine;
	}

	public void setColorEngine(String colorEngine) {
		this.colorEngine = colorEngine;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getNameEngine() {
		return nameEngine;
	}

	public void setNameEngine(String nameEngine) {
		this.nameEngine = nameEngine;
	}

	public String getTypeFuel() {
		return typeFuel;
	}

	public void setTypeFuel(String typeFuel) {
		this.typeFuel = typeFuel;
	}

	public String getNameFuel() {
		return nameFuel;
	}

	public void setNameFuel(String nameFuel) {
		this.nameFuel = nameFuel;
	}

	@Override
	public String toString() {
		return "Engine [colorEngine=" + colorEngine + ", maxSpeed=" + maxSpeed + ", nameFuel=" + nameFuel
				+ ", typeFuel=" + typeFuel + ", nameEngine=" + nameEngine + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colorEngine == null) ? 0 : colorEngine.hashCode());
		result = prime * result + maxSpeed;
		result = prime * result + ((nameEngine == null) ? 0 : nameEngine.hashCode());
		result = prime * result + ((nameFuel == null) ? 0 : nameFuel.hashCode());
		result = prime * result + ((typeFuel == null) ? 0 : typeFuel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		if (colorEngine == null) {
			if (other.colorEngine != null)
				return false;
		} else if (!colorEngine.equals(other.colorEngine))
			return false;
		if (maxSpeed != other.maxSpeed)
			return false;
		if (nameEngine == null) {
			if (other.nameEngine != null)
				return false;
		} else if (!nameEngine.equals(other.nameEngine))
			return false;
		if (nameFuel == null) {
			if (other.nameFuel != null)
				return false;
		} else if (!nameFuel.equals(other.nameFuel))
			return false;
		if (typeFuel == null) {
			if (other.typeFuel != null)
				return false;
		} else if (!typeFuel.equals(other.typeFuel))
			return false;
		return true;
	}	
		
}