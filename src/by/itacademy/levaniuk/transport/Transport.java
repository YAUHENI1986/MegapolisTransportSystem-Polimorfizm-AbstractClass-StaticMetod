package by.itacademy.levaniuk.transport;

import by.itacademy.levaniuk.engine.Engine;

public abstract class Transport {
	
	private String nameTransport;
	private Engine engine;
	private double mileage = 0;
	private double cost; //затраты на 1 км
	private int passengers;
	private String colorTransport;
	private double tank;
	private int id;
	
	protected Transport () {
		
	}
	
	protected Transport (String nameTransport, Engine engine) {
		this.nameTransport = nameTransport;
		this.engine = engine;
	}
	
	protected abstract void IamCan();
	
	public void go(int x) {
		this.mileage += x;
	}

	public String getNameTransport() {
		return nameTransport;
	}

	public void setNameTransport(String nameTransport) {
		this.nameTransport = nameTransport;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public String getColorTransport() {
		return colorTransport;
	}

	public void setColorTransport(String colorTransport) {
		this.colorTransport = colorTransport;
	}

	public Engine getEngine() {
		return engine;
	}

	public double getTank() {
		return tank;
	}

	public void setTank(double tank) {
		this.tank = tank;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Transport [nameTransport=" + nameTransport + ", engine=" + engine + ", mileage=" + mileage + ", cost="
				+ cost + ", passengers=" + passengers + ", colorTransport=" + colorTransport + ", tank=" + tank
				+ ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colorTransport == null) ? 0 : colorTransport.hashCode());
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + id;
		temp = Double.doubleToLongBits(mileage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nameTransport == null) ? 0 : nameTransport.hashCode());
		result = prime * result + passengers;
		temp = Double.doubleToLongBits(tank);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Transport other = (Transport) obj;
		if (colorTransport == null) {
			if (other.colorTransport != null)
				return false;
		} else if (!colorTransport.equals(other.colorTransport))
			return false;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(mileage) != Double.doubleToLongBits(other.mileage))
			return false;
		if (nameTransport == null) {
			if (other.nameTransport != null)
				return false;
		} else if (!nameTransport.equals(other.nameTransport))
			return false;
		if (passengers != other.passengers)
			return false;
		if (Double.doubleToLongBits(tank) != Double.doubleToLongBits(other.tank))
			return false;
		return true;
	}
	
		
}