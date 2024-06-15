package projetoIntegrador.model;

import java.util.Comparator;

public class CompararPorMunicipio implements Comparator<Cidade>{

	@Override
	public int compare(Cidade o1, Cidade o2) {
		// TODO Auto-generated method stub
		return o1.get_nomeCidade().compareTo(o2.get_nomeCidade());
	}

}
