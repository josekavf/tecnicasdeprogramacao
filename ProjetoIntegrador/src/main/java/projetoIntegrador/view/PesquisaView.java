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
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import projetoIntegrador.model.Cidade;
import projetoIntegrador.util.exception.Constraints;

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
			this.nomeCidade = new SimpleStringProperty(nomeCidade);
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

		public void setCodIBGE(Integer codIBGE) {
			this.codIBGE.set(codIBGE);
		}

		public String getNomeCidade() {
			return StringUtils.newStringUtf8(nomeCidade.get().getBytes());
		}

		public void setNomeCidade(String nomeCidade) {
			this.nomeCidade.set(nomeCidade);
		}

		public String getMicroRegiao() {
			return this.microRegiao.get();
		}

		public void setMicroRegiao(String microRegiao) {
			this.microRegiao.set(microRegiao);
		}

		public String getUF() {
			return this.UF.get();
		}

		public void setUF(String uF) {
			this.UF.set(uF);
		}

		public String getRegiao() {
			return this.regiao.get();
		}

		public void setRegiao(String regiao) {
			this.regiao.set(regiao);
		}

		public Double getArea() {
			return area.get();
		}

		public void setArea(Double area) {
			this.area.set(area);
		}

		public Integer getPopulacao() {
			return populacao.get();
		}

		public void setPopulacao(Integer populacao) {
			this.populacao.set(populacao);
		}

		public Integer getDomicilios() {
			return domicilios.get();
		}

		public void setDomicilios(Integer domicilios) {
			this.domicilios.set(domicilios);
		}

		public Double getPib() {
			return pib.get();
		}

		public void setPib(Double pib) {
			this.pib.set(pib);
		}

		public Double getIdhGeral() {
			return idhGeral.get();
		}

		public void setIdhGeral(Double idhGeral) {
			this.idhGeral.set(idhGeral);
		}

		public Double getRendaMedia() {
			return rendaMedia.get();
		}

		public void setRendaMedia(Double rendaMedia) {
			this.rendaMedia.set(rendaMedia);
		}

		public Double getRendaNominal() {
			return rendaNominal.get();
		}

		public void setRendaNominal(Double rendaNominal) {
			this.rendaNominal.set(rendaNominal);
		}

		public Integer getPeaDia() {
			return peaDia.get();
		}

		public void setPeaDia(Integer peaDia) {
			this.peaDia.set(peaDia);
		}

		public Double getIdhEduc() {
			return idhEduc.get();

		}

		public void setIdhEduc(Double idhEduc) {
			this.idhEduc.set(idhEduc);
		}

		public Double getIdhLong() {
			return idhLong.get();
		}

		public void setIdhLong(Double idhLong) {
			this.idhLong.set(idhLong);
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
	private Button btCarregar;

	@FXML
	private Button btEditar;

	@FXML
	private Button btEstatisticas;

	@FXML
	private Button btExportar;

	@FXML
	private Button btIncluir;

	@FXML
	private Button btRemover;

	@FXML
	private Button btSair;

	@FXML
	private Button btSalvar;
	
    @FXML
    private TextField txPesquisaCodIBGE;

	private Integer codIBGESelecionado = 0;


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

		tabCity.getSelectionModel().selectedItemProperty()
				.addListener((obsCidades, oldValue, newValue) -> selecionarCidadeTabCity(newValue));
		
		tabCity.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
		
		Constraints.setTextFieldInteger(txPesquisaCodIBGE);
		
		this.carregarCidades();
	}

	@FXML
	private void sair() throws IOException {
		App.setRoot("LogIn");
	}

	private void carregarview(ArrayList<CidadeView> cityView) {
		for (Cidade a : App.controle.getCidades()) {
			cityView.add(new CidadeView(a.get_codIBGE(), a.get_nomeCidade(), a.get_microRegiao(), a.get_UF(),
					a.get_regiao(), a.get_area(), a.get_populacao(), a.get_domicilios(), a.get_pib(), a.get_idhGeral(),
					a.get_rendaMedia(), a.get_rendaNominal(), a.get_peaDia(), a.get_idhEduc(), a.get_idhLong()));
		}

		btCarregar.setDisable(true);
		btEditar.setDisable(false);
		btEstatisticas.setDisable(false);
		btExportar.setDisable(true);
		btIncluir.setDisable(false);
		btRemover.setDisable(false);
		btSalvar.setDisable(true);

	}

	@FXML
	private void carregarCidades() {
		ArrayList<CidadeView> cidades_ = new ArrayList<>();
		carregarview(cidades_);
		obsCidades = FXCollections.observableArrayList(cidades_);
		tabCity.setItems(obsCidades);

	}

	private void selecionarCidadeTabCity(CidadeView cv) {
		codIBGESelecionado = cv.getCodIBGE();
	}

	@FXML
	public void removerCidade() {

		int indiceSelecionado = -1;
		for (CidadeView c : obsCidades) {
			if (c.getCodIBGE().equals(codIBGESelecionado)) {
				indiceSelecionado = obsCidades.indexOf(c);
			}
		}
		if (Constraints.alertaSimNao("Atenção!",
				String.format("Deseja remover a cidade %s?", obsCidades.get(indiceSelecionado).getNomeCidade()))) {
			System.out.println(codIBGESelecionado);
			btSalvar.setDisable(false);
		}
	}

	@FXML
	public void salvarAlteracoes() {
		if (Constraints.alertaSimNao("Salvar", "Deseja Salvar dados alteraros ?")) {
			App.controle.salvarAlteracoes(obsCidades);
			btSalvar.setDisable(true);
			btExportar.setDisable(true);
		}
	}

	@FXML
	public void incluirCidade() throws IOException {
		// Implementar Inclusão
		App.controle.setCodCidadeSelecionada(-1);
		App.setRoot("Edit");
	}

	@FXML
	public void editarCidade() throws IOException {
		// Implementar Edição
		App.controle.setCodCidadeSelecionada(codIBGESelecionado);
		App.setRoot("Edit");

	}
    
	@FXML
	public void abrirEstatisticas() {
		// Implementar Tela de Estatisticas.
	}
	
	@FXML
	public ObservableList<CidadeView> buscar(){
		 ObservableList<CidadeView> listaPesquisada = FXCollections.observableArrayList();
		 for (CidadeView c: obsCidades ) {
			 if (c.getCodIBGE().toString().contains(txPesquisaCodIBGE.getText())) {
				 listaPesquisada.add(c); 
			 }
		 }
		return listaPesquisada;
	}
	
	
	@FXML
	public void keyPresstxPesqusa() {
		tabCity.setItems(buscar());
	}

	@FXML
	public void exportarDados() {
		App.controle.escreverArquivo();
		btCarregar.setDisable(false);
		btExportar.setDisable(true);
		btCarregar.setDisable(true);
		btEditar.setDisable(true);
		btEstatisticas.setDisable(true);
		btIncluir.setDisable(true);
		btRemover.setDisable(true);
		btSalvar.setDisable(true);
	}

}