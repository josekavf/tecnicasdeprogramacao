package projetoIntegrador.model.repository;

import java.io.IOException;
import java.util.ArrayList;

import projetoIntegrador.model.Cidade;

public interface ILerArquivo {
	
	public ArrayList<Cidade> lerArquivo(String nomeArquivo) throws IOException;

}
