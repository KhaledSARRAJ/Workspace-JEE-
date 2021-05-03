package fr.eql.ai108.systemefichiers;



import java.util.ArrayList;
import java.util.List;

public class Dossier extends Element{

	private List<Element> enfants = new ArrayList<Element>();
	
	
	
	public List<Element> getEnfants() {
		return enfants;
	}
	public void setEnfants(List<Element> enfants) {
		this.enfants = enfants;
	}
	
	public List<Element> ajouterEnfant(Element enfant) {
		enfants.add(enfant);
		return enfants;
	}
}
