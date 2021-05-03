package fr.eql.ai108.systemefichiers;

import java.io.File;

public abstract class Element {
	




	private Dossier parent;

	private String name;

	String getChemin() {
		StringBuffer sb = new StringBuffer();
		String nomParent = null;
		while (parent != null) {
			nomParent = sb.append(parent.getName()).toString();
			getChemin();
		}
		return nomParent;
	}
	

	
	public Dossier getParent() {
		return parent;
	}

	public String getName() {
		return name;
	}
	
	public void setParent(Dossier parent) {
		this.parent = parent;
	}

	public void setName(String name) {
		this.name = name;
	}



}
