package fr.eql.ai108.designpattern.factorymethod;

public class Client {

	public static void main(String[] args) {
		VehiculeFactory factory = new VehiculeFactory();
		Vehicule v1 = factory.creerVehicule(Terrain.AIR);
		v1.avancer();
		
		Vehicule v2 = factory.creerVehicule(Terrain.TERRE);
		v2.avancer();
		
		Vehicule v3 = factory.creerVehicule(Terrain.MER);
		v3.avancer();

	}

}
