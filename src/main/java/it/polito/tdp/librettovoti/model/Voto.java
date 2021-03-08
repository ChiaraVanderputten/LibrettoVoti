package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

//POJO - Plain Old Java Obbject
//Java Bean
//Semplice contenitore di dati, nno ha "logica", non fa operazioni
	
/**
 * Memorizza il risultato di un esame singolo
 * 
 * @author 39377
 *
 */

public class Voto {
	
	private String nome;
	private int voto; //30L come lo rappresento?
	private LocalDate data; //usato per le date //data superamento esame
	
	/**
	 * Costruttore dela classe voto
	 * @param nome -> Nome del corso superato
	 * @param voto -> Voto ottenuto
	 * @param data -> Data di superamento
	 */
	
	public Voto(String nome, int voto, LocalDate data) {
		
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getVoto() {
		return voto;
	}


	public void setVoto(int voto) {
		this.voto = voto;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}

	public String toString() {
		
		return "Esame" + nome +" superato con " + voto+ " il "+data;
		
	}
	
	
}
