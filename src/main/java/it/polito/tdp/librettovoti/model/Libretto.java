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
	
	
	/* public void stampaVotiUguali (int punteggio) {
		//Libretto stampa da  solo i voti
		//piuù da pigri farà solo stampa a video (sulla console)
		System.out.println();
	}
	
	public String votiUguali (int punteggio) {
		//calcola una stringa che contieen i voti
		//sarà poi il chiamante a stamparli
		//è un metodo più generale
		//questo metodo mi da una stringa che deciderò poi io se voglio di poterci fare ancora altre cose
	   //ma devo stampare solo il nome? e il voto? e la data? non lo dice il testo allora è ancora meglio il terzo metodo
	    //è più pulito il terzo metodo lascia libertà futuro di scegliere
	
	}
	*/
	public List<Voto> listaVotiUguali (int punteggio){
		//restituisce i voti uguali al criterio
		//risolve un altro problema
		//unico problema è che espone la struttura interna all'esterno perchè usa direttamente la lista
	
		List <Voto> risultato = new ArrayList<>();
		
		for(Voto v : this.voti) 
			if(v.getVoto()==punteggio) 
				risultato.add(v);   //stesso oggetto contenuto in due liste diverse non sono due ogetti diversi
			                        //lo capisco perchè non c'è new
		
		return risultato;
	
	}
	
	
	
	
	 
	   public Libretto votiUguali (int punteggio) {
		//un libretto che contiene solo 25 è esso stesso un libretto
		//SOLUZIONE MIGLIORE
		
		Libretto risultato = new Libretto ();
		
		for(Voto v : this.voti)
			if(v.getVoto()==punteggio) {
				risultato.add(v);   //add era già stato implementato per i punti prima in Libretto
		        	                //se no dovevo usre risultato.voti.add(v);	
			}
		
		return risultato;  //il risultato qua è un libretto
	}  
	
	public String toString() {
		
		//return voti.toString(); //così però la lista ritorna gli indirizzi degli oggetti voti e non le stringhe dei voti veri e propri
		String s ="";
		
		for(Voto v : this.voti)
			s+=v.toString()+"\n";
		
		return s;
	}

}
