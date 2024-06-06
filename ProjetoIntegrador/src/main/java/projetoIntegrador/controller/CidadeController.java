package projetoIntegrador.controller;

import java.io.IOException;
import java.util.ArrayList;

import projetoIntegrador.model.Cidade;
import projetoIntegrador.model.repository.CidadeRepository;

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
	
}
