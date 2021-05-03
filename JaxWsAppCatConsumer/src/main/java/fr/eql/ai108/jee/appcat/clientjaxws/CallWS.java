package fr.eql.ai108.jee.appcat.clientjaxws;

import com.catstat.ai108.CatStatIService;
import com.catstat.ai108.CatStatService;

public class CallWS {
	public static void main(String[] args) {
		CatStatIService stub = new CatStatService().getCatStatPort();
		System.out.println(stub.getNbCat());
		System.out.println(stub.getNbUser());
	}
}
