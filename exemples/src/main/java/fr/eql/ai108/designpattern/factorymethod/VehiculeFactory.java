package fr.eql.ai108.designpattern.factorymethod;

public class VehiculeFactory {
	
	
	
	public Vehicule creerVehicule(Terrain typeTerrain) {
		
		
		switch (typeTerrain) {
		case AIR:
			Vehicule vehicule = new Avion();
			return vehicule;
			
		
		case MER:
			Vehicule bateau = new Bateau();
			return bateau;

		case TERRE:
			Vehicule voiture = new Voiture();	
			return voiture;
			
		default:
			return null;
		}
		
	
		
	}
}
