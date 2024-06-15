package projetoIntegrador.view;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class RankingView {
	
    @FXML
    private TextField txMaiorCodIBGE;

    @FXML
    private TextField txMaiorMunicipio;

    @FXML
    private TextField txMaiorPibPerCapita;

    @FXML
    private TextField txMaiorRankingIDHEduc;

    @FXML
    private TextField txMaiorRankingIDHGeral;

    @FXML
    private TextField txMaiorRankingIDHLong;

    @FXML
    private TextField txMenorMunicipio;

    @FXML
    private TextField txMenorRakingIDHLong;

    @FXML
    private TextField txMenorRankingCodIBGE;

    @FXML
    private TextField txMenorRankingIDHEduc;

    @FXML
    private TextField txMenorRankingIDHGeral;

    @FXML
    private TextField txMenorRendaPerCapita;
    
    @FXML
    private void initialize() {
    	txMaiorCodIBGE.setText(App.controle.getMaiorPerCapita().getCodIBGE().toString());
    	txMaiorMunicipio.setText(App.controle.getMaiorPerCapita().getMunicipio());
    	txMaiorPibPerCapita.setText(String.format("R$ %.2f", App.controle.getMaiorPerCapita().getPibPerCapita()));
    	txMaiorRankingIDHEduc.setText(String.format("%dº", App.controle.getMaiorPerCapita().getRankIDHEduc()));
    	txMaiorRankingIDHGeral.setText(String.format("%dº", App.controle.getMaiorPerCapita().getRankIDHGeral()));
    	txMaiorRankingIDHLong.setText(String.format("%.dº", App.controle.getMaiorPerCapita().getRankIDHLong()));
    	
    	txMenorRankingCodIBGE.setText(App.controle.getMenorPerCapita().getCodIBGE().toString());
    	txMenorMunicipio.setText(App.controle.getMenorPerCapita().getMunicipio());
    	txMenorRendaPerCapita.setText(String.format("R$ %.2f", App.controle.getMenorPerCapita().getPibPerCapita()));
    	txMenorRankingIDHGeral.setText(String.format("%dº", App.controle.getMenorPerCapita().getRankIDHGeral()));
    	txMenorRankingIDHEduc.setText(String.format("%dº", App.controle.getMenorPerCapita().getRankIDHEduc()));
    	txMenorRakingIDHLong.setText(String.format("%dº", App.controle.getMenorPerCapita().getRankIDHLong()));
    }
    
    @FXML
    private void sair() throws IOException {
    	App.setRoot("Pesquisa");
    }
}
