package it.polito.tdp.librettovoti;

import javafx.application.Application;
import static javafx.application.Application.launch;

import it.polito.tdp.librettovoti.model.Libretto;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class EntryPoint extends Application {

    @Override
    public void start(Stage stage) throws Exception {
    	FXMLLoader loader = new FXMLLoader (getClass().getResource("/fxml/Scene.fxml")); //modifico modo in cui viene caricato il FXML
        Parent root = loader.load();
        FXMLController controller = loader.getController();
        
        Libretto model = new Libretto(); //creato il modello e informato qual'è il modello su cui vogliamo lavorare
        //modello deve essere noto al controller-> andremo ad aggiungerla nel controller
        
        controller.setModel(model); //mi da errore su controller-> devo modificare creando una classe
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
