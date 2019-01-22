package by.itacademy.levaniuk.mainapp;

import by.itacademy.levaniuk.engine.type.BusEngine;
import by.itacademy.levaniuk.engine.type.CarEngine;
import by.itacademy.levaniuk.engine.type.ElectroEngine;
import by.itacademy.levaniuk.engine.type.FlyEngine;
import by.itacademy.levaniuk.fuel.type.Benzine;
import by.itacademy.levaniuk.fuel.type.Diesel;
import by.itacademy.levaniuk.fuel.type.Electricity;
import by.itacademy.levaniuk.fuel.type.Kerosene;
import by.itacademy.levaniuk.transport.car.Bus;
import by.itacademy.levaniuk.transport.car.Car;
import by.itacademy.levaniuk.transport.electro.ElectroCar;
import by.itacademy.levaniuk.transport.fly.Helicopter;
import by.itacademy.levaniuk.transport.train.Metro;

public class MainApp {

	public static void main(String[] args) {
		
		ListFuel listFuel = new ListFuel(1);
		listFuel.addFuel(new Kerosene("T-6", 4.5, 0.91));
		listFuel.addFuel(new Diesel("Летнее ДТ", 1.47, 0.86));
		listFuel.addFuel(new Diesel("Зимнее ДТ", 1.52, 0.84));
		listFuel.addFuel(new Diesel("Арктическое ДТ", 1.64, 0.83));
		listFuel.addFuel(new Benzine("АИ-95", 1.46, 95));
		listFuel.addFuel(new Benzine("АИ-92", 1.39, 92));
		listFuel.addFuel(new Benzine("АИ-98", 1.58, 98));
		listFuel.addFuel(new Electricity("Электричесвтво", 0.1841));
		
		ListFuel.listFuel(listFuel);
		
		CarEngine carEngine = new CarEngine("yellow");
		carEngine.addTypeFuel(listFuel);
		CarEngine superEngine = new CarEngine("TurdoSuper", 200, "red", 5.5, 16, "Euro-2");
		superEngine.addTypeFuel(listFuel);
		BusEngine busEngine = new BusEngine("BelkaS", 85, "black", 16, 25, "Euro6", 315);
		busEngine.addTypeFuel(listFuel);
		ElectroEngine electroEngine = new ElectroEngine("Чисто-Тайд", 55, "green", 12);
		electroEngine.addTypeFuel(listFuel);
		FlyEngine sky = new FlyEngine("Небо поможет нам", 210, "blue", 19.9, 30, "Euro7");
		sky.addTypeFuel(listFuel);
		
		Car myAuto = new Car("BMW", carEngine, 5, 2.1, 6, "red", 60);
		Car taxi = new Car("RENO", superEngine, 5, 1.99, 5, "black", 85);
		ElectroCar tesla = new ElectroCar("TESLA", electroEngine, 2, 3, 4, "white", 80);
		Bus maz = new Bus("МАЗ", busEngine, 2.9, "green", 200, 13);
		Metro metro = new Metro("Московское", electroEngine, "пассажирский", 8, 1.2, 500, "blue", 50);
		Helicopter medicFly = new Helicopter("Скорая помощь", sky, 5, 5, "red-white", 165);
		
		ListTransports listTransport = new ListTransports(1);
		listTransport.addNewTransport(myAuto);
		listTransport.addNewTransport(taxi);
		listTransport.addNewTransport(tesla);
		listTransport.addNewTransport(maz);
		listTransport.addNewTransport(metro);
		listTransport.addNewTransport(medicFly);
		
		ListTransports.f(listTransport);
		
		listTransport.costSorting();
		listTransport.speedSorting();
		System.out.println();
	}

}
