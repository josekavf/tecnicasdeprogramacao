package projetoIntegrador.principal;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;
import projetoIntegrador.model.Cidade;
import projetoIntegrador.model.repository.CidadeRepository;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
    	CidadeRepository repo = new CidadeRepository();
    	ArrayList<Cidade> cidades = repo.lerArquivo();
    	System.out.println(repo.escreverArquivo(cidades));
    	
        App.setRoot("primary");
    }
}