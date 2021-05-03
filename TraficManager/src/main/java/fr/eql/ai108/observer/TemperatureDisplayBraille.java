package fr.eql.ai108.observer;

public class TemperatureDisplayBraille implements ThermometerObserver{

	public void notifyNewTemperature(int temperature) {
		
		for(int i = 0 ; i<temperature ;  i++) {
		System.out.print("*");
	}
		System.out.println();
	}

}
