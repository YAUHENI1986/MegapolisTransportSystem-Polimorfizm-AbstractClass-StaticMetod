package by.itacademy.levaniuk.transport;

import by.itacademy.levaniuk.engine.Engine;

public abstract class WaterTransport extends Transport {
	
	private boolean dive;
	private boolean arsenal;
	
	protected WaterTransport() {
		super();
	}
	
	protected WaterTransport(String nameTransport, Engine engine, boolean dive, boolean arsenal) {
		super(nameTransport, engine);
		this.dive = dive;
	}

	@Override
	protected void IamCan() {
		System.out.println("Вода - мой друг!!!");
	}

	public boolean isDive() {
		return dive;
	}

	public void setDive(boolean dive) {
		this.dive = dive;
	}

	public boolean isArsenal() {
		return arsenal;
	}

	public void setArsenal(boolean arsenal) {
		this.arsenal = arsenal;
	}
	
}