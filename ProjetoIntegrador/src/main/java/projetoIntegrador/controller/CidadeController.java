package projetoIntegrador.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import projetoIntegrador.model.Cidade;
import projetoIntegrador.model.repository.CidadeRepository;
import projetoIntegrador.view.PesquisaView.CidadeView;

public class CidadeController {

	private ArrayList<Cidade> cidades;

	public ArrayList<Cidade> getCidades() {
		return cidades;
	}

	private CidadeRepository repositorio;

	public CidadeController() throws IOException {
		repositorio = new CidadeRepository();
		cidades = repositorio.lerArquivo();
	}

	private Cidade salvarCidade(CidadeView city) {
		return new Cidade(city.getCodIBGE(), city.getNomeCidade(), city.getMicroRegiao(), city.getUF(),
				city.getRegiao(), city.getArea(), city.getPopulacao(), city.getDomicilios(), city.getPib(),
				city.getIdhGeral(), city.getRendaMedia(), city.getRendaNominal(), city.getPeaDia(), city.getIdhEduc(),
				city.getIdhLong());
	}

	public void salvarAlteracoes(List<CidadeView> listaCidades) {
		cidades.clear();
		for (CidadeView c : listaCidades) {
			cidades.add(salvarCidade(c));
		}
	}

	public void escreverArquivo() {
		repositorio.escreverArquivo(cidades);
	}

}
