package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {
	
	//creazione di 10 voti in libreto
	
	public static void main(String[] args) { //IMPORTANTE SE MANCA MI DA ERRORE
	
	System.out.println("Test metodi di Libretto");	
	Libretto libretto = new Libretto();
	
	Voto voto1 = new Voto("Analisi 1", 30, LocalDate.of(2019, 2, 15));
	
	libretto.add(voto1); //add per aggiungere al libretto i voti

	libretto.add(new Voto("Fisca 1", 28, LocalDate.of(2019, 6, 17)));
	libretto.add(new Voto("Informatica", 20, LocalDate.of(2019, 9, 12)));
	libretto.add(new Voto("Chimica", 25, LocalDate.of(2019, 6, 20)));
	
	//mi serve un metodo per stmapre
	System.out.println(libretto); //così mi stampa l'indirizzo di memoria del libretto, deve dirglielo il libretto come stamparsi
	                              //tamite un toString in libretto
	
	List <Voto> venticinque = libretto.listaVotiUguali(25);
	//System.out.println(venticinque); // mi mette le parentesi perchè stampo l'oggetto lista
	
	Libretto librettoventicinque = libretto.votiUguali(25);
	System.out.println(librettoventicinque); // mi stampa ma senza più le parentesi e virgole perchè usa un metodo più intelligente di prima
	
	Voto analisi =libretto.ricercaVoto("Analisi 1");
	System.out.println(analisi);
	Voto analisi2 =libretto.ricercaVoto("Analisi 3");
	System.out.println(analisi2);
	
	Voto chimica = libretto.ricercaVoto("Chimica");
	Voto chimicaDoppio = new Voto("Chimica", 25, LocalDate.of(2019, 6, 20));
	Voto chimicaConflitto = new Voto("Chimica", 29, LocalDate.of(2019, 6, 20));
	System.out.println(chimica + " doppione di "+ chimicaDoppio+" ? ");
	
	}
}
