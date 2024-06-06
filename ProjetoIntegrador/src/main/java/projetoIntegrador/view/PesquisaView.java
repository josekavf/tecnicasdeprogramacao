package projetoIntegrador.view;

import java.io.IOException;
import javafx.fxml.FXML;

public class PesquisaView {

    @FXML
    private void switchToPrimary() throws IOException { 
        App.setRoot("LogIn");
    }
    
    
}