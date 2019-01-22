package by.itacademy.levaniuk.mainapp;

import by.itacademy.levaniuk.transport.Transport;

public class ListTransports {
	
	private static  Transport[] listTransport;
	private static int couter = 1;
	
	public ListTransports() {
		
	}
	
	public ListTransports(int x) {
		ListTransports.listTransport = new Transport[x];
	}

	public Transport[] getListTransport() {
		return listTransport;
	}

	public void setListTransport(Transport[] listTransport) {
		ListTransports.listTransport = listTransport;
	}
	
	public static void f(ListTransports x) {
		MyStaticMetods.returnString("Все транспортные средства");
		for(Transport c: listTransport) {
			System.out.println(c.getNameTransport());
		}
	}
	
	public void addNewTransport(Transport transport) {
		for (int i = 0; i<listTransport.length; i++) {
			if (listTransport[i] == null) {
				listTransport[i] = transport;
				transport.setId(couter);
				couter++;
				break;
			}
			if (listTransport[listTransport.length-1] != null) {
				this.increaselistTransport();
				listTransport[listTransport.length-1] = transport;
				transport.setId(couter);
				couter++;
				break;
			}
		}
	}
	
	protected void increaselistTransport() {
		Transport[] clone = new Transport[listTransport.length+1];
		for (int a = 0; a<listTransport.length; a++) {
			clone[a] = listTransport[a];
		}
		ListTransports.listTransport = clone;
	}
	
	public void speedSorting () {
		MyStaticMetods.returnString("Сортировка по скорости");
		int countTransport = 0;
		for (int i = 0; i<listTransport.length; i++) {
			if (listTransport[i] != null) {
				countTransport++;
			}
		}
		Transport [] clone = new Transport [countTransport];
		cloneArray(clone);
		for (int out = (clone.length - 1); out >= 1; out--) {
	        for ( int in = 0; in<out; in++) {
	        	if (clone[in].getEngine().getMaxSpeed()<clone[in+1].getEngine().getMaxSpeed()) {
	        		Transport time = clone[in];
	        		clone[in] = clone[in+1];
	        		clone[in+1] = time;
	        	}
	       	}
	    }
		
		for (int i = 0; i<clone.length; i++) {
				System.out.println(clone[i].getNameTransport() + " - " + clone[i].getEngine().getMaxSpeed() + "км/ч");
		}
	}
	
	public void costSorting () {
		MyStaticMetods.returnString("Сортировка по затратам перевозки");
		int countTransport = 0;
		for (int i = 0; i<listTransport.length; i++) {
			if (listTransport[i] != null) {
				countTransport++;
			}
		}
		Transport [] clone = new Transport [countTransport];
		cloneArray(clone);
		for (int out = (clone.length - 1); out >= 1; out--) {
	        for ( int in = 0; in<out; in++) {
	        	if (clone[in].getCost()<clone[in+1].getCost()) {
	        		Transport time = clone[in];
	        		clone[in] = clone[in+1];
	        		clone[in+1] = time;
	        	}
	       	}
	    }
		
		for (int i = 0; i<clone.length; i++) {
				System.out.println(clone[i].getNameTransport() + " - " + clone[i].getCost());
		}
	}
	
	protected void cloneArray(Transport [] clone) {
		int countTransportClone = 0;
		for (int i = 0; i<clone.length; i++) {
			if (clone[i] == null) {
				clone[countTransportClone] = listTransport[i];
				countTransportClone++;
			}
		}
	}
	
}