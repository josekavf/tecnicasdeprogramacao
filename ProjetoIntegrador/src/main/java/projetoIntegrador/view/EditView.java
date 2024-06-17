/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package projetoIntegrador.view;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import projetoIntegrador.model.Cidade;
import projetoIntegrador.util.exception.Constraints;

public class EditView {

	@FXML
	private Label lbCidade;

	@FXML
	private TextField txCityArea;

	@FXML
	private TextField txCityCod;

	@FXML
	private TextField txCityDomicilio;

	@FXML
	private TextField txCityIDH;

	@FXML
	private TextField txCityIDHEduc;

	@FXML
	private TextField txCityIDHLong;

	@FXML
	private TextField txCityMicroregiao;

	@FXML
	private TextField txCityMunicipio;

	@FXML
	private TextField txCityPEA;

	@FXML
	private TextField txCityPIB;

	@FXML
	private TextField txCityPopulacao;

	@FXML
	private TextField txCityRegiao;

	@FXML
	private TextField txCityRendaMedia;

	@FXML
	private TextField txCityRendaNominal;

	@FXML
	private TextField txCityUF;
	@FXML
	private Button btSim;

	@FXML
	private Button btSair;

	private Integer indexCidade = -1;

	public EditView() {
	}

	@FXML
	public void initialize() {

		Constraints.setTextFieldInteger(txCityCod);
		Constraints.setTextFieldInteger(txCityPopulacao);
		Constraints.setTextFieldInteger(txCityDomicilio);
		Constraints.setTextFieldInteger(txCityPEA);

		Constraints.setTextFieldDouble(txCityArea);
		Constraints.setTextFieldDouble(txCityPIB);
		Constraints.setTextFieldDouble(txCityIDH);
		Constraints.setTextFieldDouble(txCityRendaMedia);
		Constraints.setTextFieldDouble(txCityRendaNominal);
		Constraints.setTextFieldDouble(txCityIDHEduc);
		Constraints.setTextFieldDouble(txCityIDHLong);

		if (App.controle.getCodCidadeSelecionada().equals(-1)) {
			lbCidade.setText("Incluir Novo Município");

			txCityCod.setEditable(true);
			txCityMunicipio.setEditable(true);
			txCityMicroregiao.setEditable(true);
			txCityUF.setEditable(true);
			txCityRegiao.setEditable(true);
			txCityArea.setEditable(true);
			txCityPopulacao.setEditable(true);
			txCityDomicilio.setEditable(true);
			txCityPIB.setEditable(true);
			txCityIDH.setEditable(true);
			txCityRendaMedia.setEditable(true);
			txCityRendaNominal.setEditable(true);
			txCityPEA.setEditable(true);
			txCityIDHEduc.setEditable(true);
			txCityIDHLong.setEditable(true);

		} else {

			for (Cidade c : App.controle.getCidades()) {
				if (c.get_codIBGE().equals(App.controle.getCodCidadeSelecionada())) {
					indexCidade = App.controle.getCidades().indexOf(c);
				}
			}
			Cidade cv = App.controle.getCidades().get(indexCidade);
			lbCidade.setText("Editar Município");
			txCityCod.setText(cv.get_codIBGE().toString());
			txCityMunicipio.setText(cv.get_nomeCidade());
			txCityMicroregiao.setText(cv.get_microRegiao());
			txCityUF.setText(cv.get_UF());
			txCityRegiao.setText(cv.get_regiao());
			txCityArea.setText(cv.get_area().toString());
			txCityPopulacao.setText(cv.get_populacao().toString());
			txCityDomicilio.setText(cv.get_domicilios().toString());
			txCityPIB.setText(cv.get_pib().toString());
			txCityIDH.setText(cv.get_idhGeral().toString());
			txCityRendaMedia.setText(cv.get_rendaMedia().toString());
			txCityRendaNominal.setText(cv.get_rendaNominal().toString());
			txCityPEA.setText(cv.get_peaDia().toString());
			txCityIDHEduc.setText(cv.get_idhEduc().toString());
			txCityIDHLong.setText(cv.get_idhLong().toString());

			txCityCod.setEditable(false);
			txCityMunicipio.setEditable(false);
			txCityMicroregiao.setEditable(false);
			txCityUF.setEditable(false);
			txCityRegiao.setEditable(false);
			txCityArea.setEditable(false);
			txCityPopulacao.setEditable(true);
			txCityDomicilio.setEditable(true);
			txCityPIB.setEditable(true);
			txCityIDH.setEditable(true);
			txCityRendaMedia.setEditable(true);
			txCityRendaNominal.setEditable(true);
			txCityPEA.setEditable(true);
			txCityIDHEduc.setEditable(true);
			txCityIDHLong.setEditable(true);
			;

		}
	}

	@FXML
	private void sair() throws IOException {
		App.setRoot("Pesquisa");
	}

	private void validarInclusaoCidade() throws Exception {
		String nomeCidade = txCityMunicipio.getText();
		Integer CodCidade = -1;

		if (nomeCidade.isEmpty()) {
			Constraints.alertaOk("Salvar Cidade", "O nome da cidade é obrigatório!");
			throw new Exception("Erro de nome município vazio");
		} else {
			for (Cidade c : App.controle.getCidades()) {
				if (c.get_nomeCidade().equals(nomeCidade)) {
					Constraints.alertaOk("Salvar Cidade", "Já existe uma cidade com o mesmo nome!");
					throw new Exception("Erro de nome município repetido");
				}
			}
		}

		if (txCityCod.getText().isEmpty()) {
			Constraints.alertaOk("Salvar Cidade", "O codigo da cidade é obrigatório!");
			throw new Exception("Erro de Codigo IBGE vazio");
		} else {
			CodCidade = Integer.parseInt(txCityCod.getText());
			for (Cidade c : App.controle.getCidades()) {
				if (c.get_codIBGE().equals(CodCidade)) {
					Constraints.alertaOk("Salvar Cidade", "Já existe uma cidade com o mesmo codígo!");
					throw new Exception("Erro de Codigo IBGE repetido");
				}
			}
		}
                
		if (txCityArea.getText().isBlank() || txCityArea.getText().isEmpty()) {
			txCityArea.setText("0.00");
		}if (txCityMicroregiao.getText().isBlank() || txCityMicroregiao.getText().isEmpty()) {
			txCityMicroregiao.setText("0.00");
		}if (txCityUF.getText().isBlank() || txCityUF.getText().isEmpty()) {
			txCityUF.setText("0.00");
		}if (txCityPopulacao.getText().isBlank() || txCityPopulacao.getText().isEmpty()) {  
			txCityPopulacao.setText("0");
		}if (txCityRegiao.getText().isBlank() || txCityRegiao.getText().isEmpty()) {
			txCityRegiao.setText("0.00");
		}if (txCityDomicilio.getText().isBlank() || txCityDomicilio.getText().isEmpty()) {
			txCityDomicilio.setText("0");
		}if (txCityPIB.getText().isBlank() || txCityPIB.getText().isEmpty()) {
			txCityPIB.setText("0.00");
		}if (txCityIDH.getText().isBlank() || txCityIDH.getText().isEmpty()) {
			txCityIDH.setText("0.00");
		}if (txCityRendaMedia.getText().isBlank() || txCityRendaMedia.getText().isEmpty()) {
			txCityRendaMedia.setText("0.00");
		}if (txCityRendaNominal.getText().isBlank() || txCityRendaNominal.getText().isEmpty()) {
			txCityRendaNominal.setText("0.00");
		}if (txCityPEA.getText().isBlank() || txCityPEA.getText().isEmpty()) {
			txCityPEA.setText("0");
		}if (txCityIDHEduc.getText().isBlank() || txCityIDHEduc.getText().isEmpty()) {
			txCityIDHEduc.setText("0.00");
		}if (txCityIDHLong.getText().isBlank() || txCityIDHLong.getText().isEmpty()) {
			txCityIDHLong.setText("0.00");
		}
	}

	@FXML
	private void salvar() throws Exception {
		try {
			if (App.controle.getCodCidadeSelecionada().equals(-1)) {
				validarInclusaoCidade();
				if (Constraints.alertaSimNao("Salvar Cidade", "Deseja Realmente salvar a nova cidade ?")) {
					
					App.controle.getCidades().add(new Cidade(Integer.parseInt(txCityCod.getText()),
							txCityMunicipio.getText(), txCityMicroregiao.getText(), txCityUF.getText(),
							txCityRegiao.getText(), Double.parseDouble(txCityArea.getText()),
							Integer.parseInt(txCityPopulacao.getText()), Integer.parseInt(txCityDomicilio.getText()),
							Double.parseDouble(txCityPIB.getText()), Double.parseDouble(txCityIDH.getText()),
							Double.parseDouble(txCityRendaMedia.getText()),
							Double.parseDouble(txCityRendaNominal.getText()), Integer.parseInt(txCityPEA.getText()),
							Double.parseDouble(txCityIDHEduc.getText()), Double.parseDouble(txCityIDHLong.getText())));

					this.sair();
				}

			} else {
				if (!indexCidade.equals(-1)) {
					if (Constraints.alertaSimNao("Salvar Cidade", "Deseja Realmente salvar a nova cidade ?")) {
						App.controle.getCidades().get(indexCidade).set_populacao(Integer.parseInt(txCityPopulacao.getText()));
						App.controle.getCidades().get(indexCidade).set_domicilios(Integer.parseInt(txCityDomicilio.getText()));
						App.controle.getCidades().get(indexCidade).set_pib(Double.parseDouble(txCityPIB.getText()));
						App.controle.getCidades().get(indexCidade).set_idhGeral(Double.parseDouble(txCityIDH.getText()));
						App.controle.getCidades().get(indexCidade).set_rendaMedia(Double.parseDouble(txCityRendaMedia.getText()));
						App.controle.getCidades().get(indexCidade).set_rendaNominal(Double.parseDouble(txCityRendaNominal.getText()));
						App.controle.getCidades().get(indexCidade).set_peaDia(Integer.parseInt(txCityPEA.getText()));
						App.controle.getCidades().get(indexCidade).set_idhEduc(Double.parseDouble(txCityIDHEduc.getText()));
						App.controle.getCidades().get(indexCidade).set_idhLong(Double.parseDouble(txCityIDHLong.getText()));
						App.controle.getCidades().get(indexCidade).setPibPerCapita();
						App.controle.getCidades().get(indexCidade).setDensidadeDemografica();
						App.controle.getCidades().get(indexCidade).setClassific_idhGeral();
						App.controle.getCidades().get(indexCidade).setClassific_idhEduc();
						App.controle.getCidades().get(indexCidade).setClassific_idhLong();
						App.controle.getCidades().get(indexCidade).setDtUltimaAlteracao();
						this.sair();
					}
				}

			}
		} catch (Exception e) {
			Constraints.escreverLog(e.getMessage());
			//Constraints.alertaOk("Erro", "Erro ao salvar arquivo");
			Constraints.alertaOk("Erro", e.getMessage() );
		}

	}

}
