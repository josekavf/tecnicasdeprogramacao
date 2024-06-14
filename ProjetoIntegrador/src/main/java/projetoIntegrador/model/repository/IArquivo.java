package projetoIntegrador.model.repository;

import java.io.IOException;
import java.util.ArrayList;

import projetoIntegrador.model.Cidade;

public interface IArquivo {
	
	public ArrayList<Cidade> lerArquivo() throws IOException;
	public Boolean escreverArquivo(ArrayList<Cidade> cidades) throws IOException;

}
