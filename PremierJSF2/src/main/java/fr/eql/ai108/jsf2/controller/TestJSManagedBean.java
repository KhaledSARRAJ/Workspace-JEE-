package fr.eql.ai108.jsf2.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name = "mbJS")
@SessionScoped
public class TestJSManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	public String result;
	public String valJS;
	
	
	
	public String action() {
		System.out.println(result);
		return "displayJS.xhtml?faces-redirect=true";
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getValJS() {
		return valJS;
	}

	public void setValJS(String valJS) {
		this.valJS = valJS;
	}
	
	
}
