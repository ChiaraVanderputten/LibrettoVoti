package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibrettoMigliorato {
	
	//corrisponde al Model del MVC
	
		private List<Voto> voti; //bisogna importare util nno altri java list
		                         //variabile che non punta a nulla (null)
		
		private Map<String,Voto> votiMap; 
		
		public LibrettoMigliorato() {
			this.voti = new ArrayList <>(); 
			
		    this.votiMap= new HashMap<>();
		}
		
		public void add(Voto v) {
			
			Voto temp = votiMap.get(v.getNome());
			
			if(temp==null) { 
				
			if(v.getVoto()>=18 && v.getVoto()< 24) {                                //punto 7
					Voto vtemp = new Voto(v.getNome(), v.getVoto()+1, v.getData());
			voti.add(vtemp);
			votiMap.put(v.getNome(), vtemp);
			}else if(v.getVoto()>=24 && v.getVoto()<=28) {
			Voto vtemp = new Voto(v.getNome(), v.getVoto()+2, v.getData());
			voti.add(vtemp);
			votiMap.put(v.getNome(), vtemp);
				}
			else if(v.getVoto()>=29) {
				
				Voto vtemp = new Voto(v.getNome(), 30, v.getData());
				voti.add(vtemp);
				votiMap.put(v.getNome(), vtemp);
				}
					
			}else {
				System.out.println("Stai provando ad aggiungere un voto che entra in conflitto con un altro voto o che già esiste");
			}
			
		}
		
		
		
		
		public Map<String, Voto> getVotiMap() {
			return votiMap;
		}

		public List<Voto> listaVotiUguali (int punteggio){
			
			List <Voto> risultato = new ArrayList<>();
			
			for(Voto v : this.voti) 
				if(v.getVoto()==punteggio) 
					risultato.add(v);   
			
			return risultato;
		
		}
		
		
		public Voto ricercaVoto(String nomeCorso) { 
			return this.votiMap.get(nomeCorso);
		}
		
		 
		   public Libretto votiUguali (int punteggio) {
			
			Libretto risultato = new Libretto ();
			
			for(Voto v : this.voti)
				if(v.getVoto()==punteggio) {
					risultato.add(v);   
				}
			
			return risultato;  
		}  
		
		   
		   
		   public boolean esisteDuplicato (Voto v) { 
			   
			   Voto trovato = this.votiMap.get(v.getNome());  
			   if(trovato==null)
				   return false;
			   if(trovato.getVoto()==v.getVoto())
				   return true;
			   else
				   return false;
		   }
		   
		  
		   public boolean esisteConflitto(Voto v) { 
			 
			   Voto trovato = this.votiMap.get(v.getNome());  
			   if(trovato==null)
				   return false;
			   if(trovato.getVoto()!=v.getVoto())
				   return true;
			   else
				   return false;
			   
		   }
		   
		   
		public String toString() {
			
			
			String s ="";
			
			for(Voto v : this.voti)
				s+=v.toString()+"\n";
			
			return s;
		}

}
