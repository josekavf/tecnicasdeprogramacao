/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package projetoIntegrador.view;

import java.io.IOException;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import org.apache.commons.codec.binary.StringUtils;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class EditView {

    @FXML
    private TextField tabCity;

    @FXML
    private TextField tabCityArea;

    @FXML
    private TextField tabCityCod;

    @FXML
    private TextField tabCityDomicilio;

    @FXML
    private TextField tabCityIDH;

    @FXML
    private TextField tabCityIDHEduc;

    @FXML
    private TextField tabCityIDHLong;

    @FXML
    private TextField tabCityMicroregiao;

    @FXML
    private TextField tabCityMunicipio;

    @FXML
    private TextField tabCityPEA;

    @FXML
    private TextField tabCityPIB;

    @FXML
    private TextField tabCityPopulacao;

    @FXML
    private TextField tabCityRegiao;

    @FXML
    private TextField tabCityRendaMedia;

    @FXML
    private TextField tabCityRendaNominal;

    @FXML
    private TextField tabCityUF;

    @FXML
    private Button btSim;

    @FXML
    private Button btSair;

    private PesquisaView pesquisa;

    public EditView() {
    }

    @FXML
    private void sair() throws IOException {
        App.setRoot("Pesquisa");
    }

}
