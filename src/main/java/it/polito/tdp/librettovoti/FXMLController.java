package it.polito.tdp.librettovoti;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import it.polito.tdp.librettovoti.model.Libretto;
import it.polito.tdp.librettovoti.model.Voto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	private Libretto model;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtEsame;

    @FXML
    private TextField txtVoto;

    @FXML
    private TextField txtData;

    @FXML
    private TextArea result;

    @FXML
    void doInserisci(ActionEvent event) {
    	//sarà diviso in 3 parti
    	//1) Leggi e controlla i dati
    	String nomeEsame = txtEsame.getText(); //dovremmo per tutti controllare che saino stringhe che non ci siano numeri dove non devono esserci, che non ci siano caratteri speciali...
    	String votoEsame = txtVoto.getText();
    	int votoInt= Integer.parseInt(votoEsame);
    	String DataEsame = txtData.getText();
    	LocalDate data = LocalDate.parse(DataEsame);
    	
    	//controlliamo che il nome d'esame sia stato inserito
    	if(nomeEsame.length()==0) {
    		result.setText("ERRORE: nome esame vuoto");
    		return;
    	}
    	
    	
    	//2) Esegui l'azione
    	Voto voto = new Voto(nomeEsame, votoInt, data);
    	model.add(voto); //controlli di logica non lo sa il controller, immagina il controller come senza memoria può chiedere al modello se il valore va bene
    	
    	//3) Aggiorna i risultati (nella view)
    	result.setText(model.toString());

    }
    
    public void setModel(Libretto model) {
    	this.model=model;
    }

    @FXML
    void initialize() {
        assert txtEsame != null : "fx:id=\"txtEsame\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtVoto != null : "fx:id=\"txtVoto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtData != null : "fx:id=\"txtData\" was not injected: check your FXML file 'Scene.fxml'.";
        assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
