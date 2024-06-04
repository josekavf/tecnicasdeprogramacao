package projetoIntegrador.principal;


import projetoIntegrador.model.Cidade;
import projetoIntegrador.model.repository.LerCidade;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
    	/*ArrayList<Cidade> cidades = new LerCidade().lerArquivo("C:/Users/jose.vfelipe/Downloads/Teste.csv");
    	for (Cidade city : cidades) {
    		System.out.println(city.toString());
    	}
    	System.out.println(cidades.size());*/
        App.setRoot("secondary");
    }
}
