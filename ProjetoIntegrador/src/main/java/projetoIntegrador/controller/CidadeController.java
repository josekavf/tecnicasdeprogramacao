package projetoIntegrador.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import projetoIntegrador.model.Cidade;
import projetoIntegrador.model.CidadeRank;
import projetoIntegrador.model.CompararPorIDHEduc;
import projetoIntegrador.model.CompararPorIDHGeral;
import projetoIntegrador.model.CompararPorMunicipio;
import projetoIntegrador.model.CompararPorIDHLong;
import projetoIntegrador.model.repository.CidadeRepository;
import projetoIntegrador.view.PesquisaView.CidadeView;

public class CidadeController {

	private ArrayList<Cidade> cidades;
	private Integer codCidadeSelecionada;
	private CidadeRank maiorPerCapita;
	private CidadeRank menorPerCapita;

	public CidadeRank getMaiorPerCapita() {
		return maiorPerCapita;
	}

	public void setMaiorPerCapita(CidadeRank maiorPerCapita) {
		this.maiorPerCapita = maiorPerCapita;
	}

	public CidadeRank getMenorPerCapita() {
		return menorPerCapita;
	}

	public void setMenorPerCapita(CidadeRank menorPerCapita) {
		this.menorPerCapita = menorPerCapita;
	}

	public Integer getCodCidadeSelecionada() {
		return codCidadeSelecionada;
	}

	public void setCodCidadeSelecionada(Integer codCidadeSelecionada) {
		this.codCidadeSelecionada = codCidadeSelecionada;
	}

	public ArrayList<Cidade> getCidades() {
		return cidades;
	}

	private CidadeRepository repositorio;

	public CidadeController() throws IOException {
		repositorio = new CidadeRepository();
		cidades = repositorio.lerArquivo();
		maiorPerCapita = new CidadeRank();
		menorPerCapita = new CidadeRank();
		carregarDadosEstatisticos();
		Collections.sort((List<Cidade>) cidades, new CompararPorMunicipio());
	}

	private Cidade salvarCidade(CidadeView city) {
		return new Cidade(city.getCodIBGE(), city.getNomeCidade(), city.getMicroRegiao(), city.getUF(),
				city.getRegiao(), city.getArea(), city.getPopulacao(), city.getDomicilios(), city.getPibDouble(),
				city.getIdhGeral(), city.getRendaMediaDouble(), city.getRendaNominalDouble(), city.getPeaDia(), city.getIdhEduc(),
				city.getIdhLong());
	}

	public void salvarAlteracoes(List<CidadeView> listaCidades) {
		cidades.clear();
		for (CidadeView c : listaCidades) {
			cidades.add(salvarCidade(c));
		}
	}

	public void escreverArquivo() throws IOException {
		repositorio.escreverArquivo(cidades);
	}
	
	private void carregarDadosEstatisticos() {
		Double maiorPibPerCapito = 0.00, menorPibPerCapita = 10000000000.00;
		Cidade menorPib = null, MaiorPib = null;
		for (Cidade c: cidades) {
			if (maiorPibPerCapito < c.getPibPerCapita()) {
				maiorPibPerCapito = c.getPibPerCapita();
				MaiorPib = c;
				maiorPerCapita.setCodIBGE(c.get_codIBGE());
				maiorPerCapita.setMunicipio(c.get_nomeCidade());
				maiorPerCapita.setPibPerCapita(c.getPibPerCapita());
			}
			if (menorPibPerCapita > c.getPibPerCapita()) {
				menorPibPerCapita = c.getPibPerCapita();
				menorPib = c;
				menorPerCapita.setCodIBGE(c.get_codIBGE());
				menorPerCapita.setMunicipio(c.get_nomeCidade());
				menorPerCapita.setPibPerCapita(c.getPibPerCapita());
			}	
		}
		Collections.sort(cidades, new CompararPorIDHGeral());
		maiorPerCapita.setRankIDHGeral(cidades.indexOf(MaiorPib));
		menorPerCapita.setRankIDHGeral(cidades.indexOf(menorPib));
		
		Collections.sort(cidades, new CompararPorIDHLong());
		maiorPerCapita.setRankIDHLong(cidades.indexOf(MaiorPib));
		menorPerCapita.setRankIDHLong(cidades.indexOf(menorPib));
		
		Collections.sort(cidades, new CompararPorIDHEduc());
		maiorPerCapita.setRankIDHEduc(cidades.indexOf(MaiorPib));
		menorPerCapita.setRankIDHEduc(cidades.indexOf(menorPib));
		
	}

}
