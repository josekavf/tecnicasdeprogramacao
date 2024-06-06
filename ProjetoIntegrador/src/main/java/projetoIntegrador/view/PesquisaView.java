package projetoIntegrador.view;

import java.io.IOException;
import java.util.ArrayList;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import projetoIntegrador.model.Cidade;


public class PesquisaView  {
	
	@FXML
	private TableView<Cidade> tabCity;

	@FXML
	private TableColumn<Cidade, String> tabCityArea;

/*	@FXML
	private TableColumn<Cidade, Integer> tabCityCod;

	@FXML
	private TableColumn<Cidade, Integer> tabCityDomicilio;

	@FXML
	private TableColumn<Cidade, Double> tabCityIDH;

	@FXML
	private TableColumn<Cidade, Double> tabCityIDHEduc;

	@FXML
	private TableColumn<Cidade, Double> tabCityIDHLong;

	@FXML
	private TableColumn<Cidade, String> tabCityMicroregiao;

	@FXML
	private TableColumn<Cidade, String> tabCityMunicipio;

	@FXML
	private TableColumn<Cidade, Integer> tabCityPEA;

	@FXML
	private TableColumn<Cidade, Double> tabCityPIB;

	@FXML
	private TableColumn<Cidade, Integer> tabCityPopulacao;

	@FXML
	private TableColumn<Cidade, String> tabCityRegiao;

	@FXML
	private TableColumn<Cidade, Double> tabCityRendaMedia;

	@FXML
	private TableColumn<Cidade, Double> tabCityRendaNominal;

	@FXML
	private TableColumn<Cidade, String> tabCityUF;  */

	private ObservableList<Cidade> obsCidades; 
	
	@FXML
	private void switchToPrimary() throws IOException {
		App.setRoot("LogIn");
	}
    
	
	
	@FXML
	public void initialize() {
		// TODO Auto-generated method stub
		tabCityArea = new TableColumn<Cidade, String>();
		tabCityArea.setCellValueFactory(new PropertyValueFactory<>("nomeCidade"));
		ArrayList<Cidade> cidades_ = new ArrayList<>();
		
		cidades_.add(new Cidade(1,"a","b","G","F",1.2,1,2,3.9,0.5,100.0,100.0,1,0.6,0.9));
        System.out.println(cidades_.get(0).getNomeCidade());
		obsCidades = FXCollections.observableArrayList(cidades_);
		//tabCity.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY); 
		tabCity.setItems(obsCidades);
		
		
		
	}

}