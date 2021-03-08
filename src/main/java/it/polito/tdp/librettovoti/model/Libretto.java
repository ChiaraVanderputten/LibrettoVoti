package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti; //bisogna importare util nno altri java list
	                         //variabile che non punta a nulla (null)
	public Libretto() {
		this.voti = new ArrayList <>(); //inizializzo la lista 
	}
	
	public void add(Voto v) {
		voti.add(v);
		
	}
	
	public String toString() {
		
		//return voti.toString(); //così però la lista ritorna gli indirizzi degli oggetti voti e non le stringhe dei voti veri e propri
		String s ="";
		
		for(Voto v : this.voti)
			s+=v.toString()+"\n";
		
		return s;
	}

}
