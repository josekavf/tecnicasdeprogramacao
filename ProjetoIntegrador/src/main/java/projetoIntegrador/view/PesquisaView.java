package projetoIntegrador.view;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.codec.binary.StringUtils;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import projetoIntegrador.model.Cidade;

public class PesquisaView {

	public class CidadeView {

		private SimpleIntegerProperty codIBGE;
		private SimpleStringProperty nomeCidade;
		private SimpleStringProperty microRegiao;
		private SimpleStringProperty UF;
		private SimpleStringProperty regiao;
		private SimpleDoubleProperty area;
		private SimpleIntegerProperty populacao;
		private SimpleIntegerProperty domicilios;
		private SimpleDoubleProperty pib;
		private SimpleDoubleProperty idhGeral;
		private SimpleDoubleProperty rendaMedia;
		private SimpleDoubleProperty rendaNominal;
		private SimpleIntegerProperty peaDia;
		private SimpleDoubleProperty idhEduc;
		private SimpleDoubleProperty idhLong;

		public CidadeView(Integer codIBGE, String nomeCidade, String microRegiao, String uF, String regiao, Double area,
				Integer populacao, Integer domicilios, Double pib, Double idhGeral, Double rendaMedia,
				Double rendaNominal, Integer peaDia, Double idhEduc, Double idhLong) {

			this.codIBGE = new SimpleIntegerProperty(codIBGE);
			this.nomeCidade = new SimpleStringProperty(StringUtils.newStringUtf8(nomeCidade.getBytes()));
			this.microRegiao = new SimpleStringProperty(StringUtils.newStringUtf8(microRegiao.getBytes()));
			this.UF = new SimpleStringProperty(StringUtils.newStringUtf8(uF.getBytes()));
			this.regiao = new SimpleStringProperty(StringUtils.newStringUtf8(regiao.getBytes()));
			this.area = new SimpleDoubleProperty(area);
			this.populacao = new SimpleIntegerProperty(populacao);
			this.domicilios = new SimpleIntegerProperty(domicilios);
			this.pib = new SimpleDoubleProperty(pib);
			this.idhGeral = new SimpleDoubleProperty(idhGeral);
			this.rendaMedia = new SimpleDoubleProperty(rendaMedia);
			this.rendaNominal = new SimpleDoubleProperty(rendaNominal);
			this.peaDia = new SimpleIntegerProperty(peaDia);
			this.idhEduc = new SimpleDoubleProperty(idhEduc);
			this.idhLong = new SimpleDoubleProperty(idhLong);
		}

		public Integer getCodIBGE() {
			return codIBGE.get();
		}

		public void setCodIBGE(SimpleIntegerProperty codIBGE) {
			this.codIBGE = codIBGE;
		}

		public String getNomeCidade() {
			return StringUtils.newStringUtf8(nomeCidade.get().getBytes());
		}

		public void setNomeCidade(SimpleStringProperty nomeCidade) {
			this.nomeCidade = nomeCidade;
		}

		public String getMicroRegiao() {
			return StringUtils.newStringUtf8(microRegiao.get().getBytes());
		}

		public void setMicroRegiao(SimpleStringProperty microRegiao) {
			this.microRegiao = microRegiao;
		}

		public String getUF() {
			return StringUtils.newStringUtf8(UF.get().getBytes());
		}

		public void setUF(SimpleStringProperty uF) {
			UF = uF;
		}

		public String getRegiao() {
			return StringUtils.newStringUtf8(regiao.get().getBytes());
		}

		public void setRegiao(SimpleStringProperty regiao) {
			this.regiao = regiao;
		}

		public Double getArea() {
			return area.get();
		}

		public void setArea(SimpleDoubleProperty area) {
			this.area = area;
		}

		public Integer getPopulacao() {
			return populacao.get();
		}

		public void setPopulacao(SimpleIntegerProperty populacao) {
			this.populacao = populacao;
		}

		public Integer getDomicilios() {
			return domicilios.get();
		}

		public void setDomicilios(SimpleIntegerProperty domicilios) {
			this.domicilios = domicilios;
		}

		public Double getPib() {
			return pib.get();
		}

		public void setPib(SimpleDoubleProperty pib) {
			this.pib = pib;
		}

		public Double getIdhGeral() {
			return idhGeral.get();
		}

		public void setIdhGeral(SimpleDoubleProperty idhGeral) {
			this.idhGeral = idhGeral;
		}

		public Double getRendaMedia() {
			return rendaMedia.get();
		}

		public void setRendaMedia(SimpleDoubleProperty rendaMedia) {
			this.rendaMedia = rendaMedia;
		}

		public Double getRendaNominal() {
			return rendaNominal.get();
		}

		public void setRendaNominal(SimpleDoubleProperty rendaNominal) {
			this.rendaNominal = rendaNominal;
		}

		public Integer getPeaDia() {
			return peaDia.get();
		}

		public void setPeaDia(SimpleIntegerProperty peaDia) {
			this.peaDia = peaDia;
		}

		public Double getIdhEduc() {
			return idhEduc.get();
			
		}

		public void setIdhEduc(SimpleDoubleProperty idhEduc) {
			this.idhEduc = idhEduc;
		}

		public Double getIdhLong() {
			return idhLong.get();
		}

		public void setIdhLong(SimpleDoubleProperty idhLong) {
			this.idhLong = idhLong;
		}
	}

	@FXML
	private TableView<CidadeView> tabCity;

	@FXML
	private TableColumn<CidadeView, Double> tabCityArea;

	@FXML
	private TableColumn<CidadeView, Integer> tabCityCod;

	@FXML
	private TableColumn<CidadeView, Integer> tabCityDomicilio;

	@FXML
	private TableColumn<CidadeView, Double> tabCityIDH;

	@FXML
	private TableColumn<CidadeView, Double> tabCityIDHEduc;

	@FXML
	private TableColumn<CidadeView, Double> tabCityIDHLong;

	@FXML
	private TableColumn<CidadeView, String> tabCityMicroregiao;

	@FXML
	private TableColumn<CidadeView, String> tabCityMunicipio;

	@FXML
	private TableColumn<CidadeView, Integer> tabCityPEA;

	@FXML
	private TableColumn<CidadeView, Double> tabCityPIB;

	@FXML
	private TableColumn<CidadeView, Integer> tabCityPopulacao;

	@FXML
	private TableColumn<CidadeView, String> tabCityRegiao;

	@FXML
	private TableColumn<CidadeView, Double> tabCityRendaMedia;

	@FXML
	private TableColumn<CidadeView, Double> tabCityRendaNominal;

	@FXML
	private TableColumn<CidadeView, String> tabCityUF;

	private ObservableList<CidadeView> obsCidades;

	@FXML
	private void switchToPrimary() throws IOException {
		App.setRoot("LogIn");
	}

	@FXML
	public void initialize() {
		// TODO Auto-generated method stub
		tabCityCod.setCellValueFactory(new PropertyValueFactory<>("codIBGE"));
		tabCityArea.setCellValueFactory(new PropertyValueFactory<>("area"));
		tabCityDomicilio.setCellValueFactory(new PropertyValueFactory<>("domicilios"));
		tabCityIDH.setCellValueFactory(new PropertyValueFactory<>("idhGeral"));
		tabCityIDHEduc.setCellValueFactory(new PropertyValueFactory<>("idhEduc"));
		tabCityIDHLong.setCellValueFactory(new PropertyValueFactory<>("idhLong"));
		tabCityMicroregiao.setCellValueFactory(new PropertyValueFactory<>("microRegiao"));
		tabCityMunicipio.setCellValueFactory(new PropertyValueFactory<>("nomeCidade"));
		tabCityPEA.setCellValueFactory(new PropertyValueFactory<>("peaDia"));
		tabCityPIB.setCellValueFactory(new PropertyValueFactory<>("pib"));
		tabCityPopulacao.setCellValueFactory(new PropertyValueFactory<>("populacao"));
		tabCityRegiao.setCellValueFactory(new PropertyValueFactory<>("regiao"));
		tabCityRendaMedia.setCellValueFactory(new PropertyValueFactory<>("rendaMedia"));
		tabCityRendaNominal.setCellValueFactory(new PropertyValueFactory<>("rendaNominal"));
		tabCityUF.setCellValueFactory(new PropertyValueFactory<>("UF"));
	}

	private void carregarview(ArrayList<CidadeView> cityView) {
		for (Cidade a : App.controle.getCidades()) {
			cityView.add(new CidadeView(a.get_codIBGE(), a.get_nomeCidade(), a.get_microRegiao(), a.get_UF(),
					a.get_regiao(), a.get_area(), a.get_populacao(), a.get_domicilios(), a.get_pib(), a.get_idhGeral(),
					a.get_rendaMedia(), a.get_rendaNominal(), a.get_peaDia(), a.get_idhEduc(), a.get_idhLong()));
		}
	}

	@FXML
	private void teste() {
		ArrayList<CidadeView> cidades_ = new ArrayList<>();
		carregarview(cidades_);
		obsCidades = FXCollections.observableArrayList(cidades_);
		tabCity.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
		tabCity.setItems(obsCidades);

	}

}