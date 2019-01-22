package by.itacademy.levaniuk.transport;

import by.itacademy.levaniuk.engine.Engine;

public abstract class TrainTransport extends Transport {
	
	private int countRailwayCarriage;
	private String typeTraffic;
	
	
	protected TrainTransport() {
		super();
	}
	
	
	protected TrainTransport(String nameTransport, Engine engine, String typeTraffic) {
		super(nameTransport, engine);
		this.typeTraffic = typeTraffic;
	}

	@Override
	protected void IamCan() {
		System.out.println("Я перевожу много груза! Чух-Чух...");		
	}

	public int getCountRailwayCarriage() {
		return countRailwayCarriage;
	}

	public void setCountRailwayCarriage(int countRailwayCarriage) {
		this.countRailwayCarriage = countRailwayCarriage;
	}

	public String getTypeTraffic() {
		return typeTraffic;
	}

	public void setTypeTraffic(String typeTraffic) {
		this.typeTraffic = typeTraffic;
	}
	
}