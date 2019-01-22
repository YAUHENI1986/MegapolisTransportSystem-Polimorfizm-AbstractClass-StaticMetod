package by.itacademy.levaniuk.engine.type;

public class BusEngine extends CarEngine {
	
	private int powerEngine;
	
	public BusEngine() {
		super();
	}
	
	public BusEngine(String nameEngine, int maxSpeed, String colorEngine, double volume, double expense, String classEcology, int powerEngine) {
		super(nameEngine, maxSpeed, colorEngine, volume, expense, classEcology);
		this.powerEngine = powerEngine;
	}

	public int getPowerEngine() {
		return powerEngine;
	}

	public void setPowerEngine(int powerEngine) {
		this.powerEngine = powerEngine;
	}

}