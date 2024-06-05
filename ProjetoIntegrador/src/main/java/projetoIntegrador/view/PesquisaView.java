package projetoIntegrador.view;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;
import projetoIntegrador.model.Cidade;
import projetoIntegrador.model.repository.CidadeRepository;

public class PesquisaView {

    @FXML
    private void switchToPrimary() throws IOException { 	
        App.setRoot("LogIn");
    }
}