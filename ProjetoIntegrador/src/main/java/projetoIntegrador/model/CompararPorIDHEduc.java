package projetoIntegrador.model;

import java.util.Comparator;

public class CompararPorIDHEduc implements Comparator<Cidade> {

	@Override
	public int compare(Cidade o1, Cidade o2) {
		return o1.get_idhEduc().compareTo(o2.get_idhEduc());
	}
	
}
