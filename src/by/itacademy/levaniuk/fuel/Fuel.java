package by.itacademy.levaniuk.fuel;

public abstract class Fuel {
	
	private String nameFuel;
	private String typeFuel;
	private double priceFuel;
	private String toxicity;
	
	protected Fuel () {		
	}

	protected Fuel (double priceFuel) {
		this.priceFuel = priceFuel;
	}
	
	public abstract void infoFuel();

	public double getPriceFuel() {
		return priceFuel;
	}

	public void setPriceFuel(double priceFuel) {
		this.priceFuel = priceFuel;
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

	public String getToxicity() {
		return toxicity;
	}

	public void setToxicity(String toxicity) {
		this.toxicity = toxicity;
	}

	@Override
	public String toString() {
		return "Fuel [nameFuel=" + nameFuel + ", typeFuel=" + typeFuel + ", priceFuel=" + priceFuel + ", toxicity="
				+ toxicity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameFuel == null) ? 0 : nameFuel.hashCode());
		long temp;
		temp = Double.doubleToLongBits(priceFuel);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((toxicity == null) ? 0 : toxicity.hashCode());
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
		Fuel other = (Fuel) obj;
		if (nameFuel == null) {
			if (other.nameFuel != null)
				return false;
		} else if (!nameFuel.equals(other.nameFuel))
			return false;
		if (Double.doubleToLongBits(priceFuel) != Double.doubleToLongBits(other.priceFuel))
			return false;
		if (toxicity == null) {
			if (other.toxicity != null)
				return false;
		} else if (!toxicity.equals(other.toxicity))
			return false;
		if (typeFuel == null) {
			if (other.typeFuel != null)
				return false;
		} else if (!typeFuel.equals(other.typeFuel))
			return false;
		return true;
	}
	
}