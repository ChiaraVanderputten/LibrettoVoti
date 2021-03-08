package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class TestLibretto {
	
	//creazione di 10 voti in libreto
	
	public static void main(String[] args) { //IMPORTANTE SE MANCA MI DA ERRORE
	
	System.out.println("Test metodi di Libretto");	
	Libretto libretto = new Libretto();
	
	Voto voto1 = new Voto("Analisi 1", 30, LocalDate.of(2019, 2, 15));
	
	libretto.add(voto1); //add per aggiungere al libretto i voti

	libretto.add(new Voto("Fisca 1", 28, LocalDate.of(2019, 6, 17)));
	libretto.add(new Voto("Informatica", 20, LocalDate.of(2019, 9, 12)));
	
	//mi serve un metodo per stmapre
	System.out.println(libretto); //così mi stampa l'indirizzo di memoria del libretto, deve dirglielo il libretto come stamparsi
	                              //tamite un toString in libretto
	}
}
