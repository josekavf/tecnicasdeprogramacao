package projetoIntegrador.model;

import java.util.Comparator;

public class CompararPorIDHLong implements Comparator<Cidade> {

	@Override
	public int compare(Cidade o1, Cidade o2) {
		return o1.get_idhLong().compareTo(o2.get_idhLong());
	}

}
