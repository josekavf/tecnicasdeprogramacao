package projetoIntegrador.model.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.StringUtils;
import com.opencsv.CSVWriter;

import projetoIntegrador.model.Cidade;

public class CidadeRepository implements IArquivo {

	@Override
	public ArrayList<Cidade> lerArquivo() throws IOException {
		ArrayList<Cidade> cidades = new ArrayList<>();
		Integer codIBGE = 0;
		String nomeCidade = "";
		String microRegiao = "";
		String UF = "";
		String regiao = "";
		Double area = 0.0;
		Integer populacao = 0;
		Integer domicilios = 0;
		Double pib = 0.0;
		Double idhGeral = 0.0;
		Double rendaMedia = 0.0;
		Double rendaNominal = 0.0;
		Integer peaDia = 0;
		Double idhEduc = 0.0;
		Double idhLong = 0.0;
		
	
		Charset charset = StandardCharsets.UTF_8;
		
		List<String[]> records = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader("C:/Projeto Integrador/In/01.ProjetoIntegrador_BaseMunicipios_In.csv",charset ));
		    String line;
		    while ((line = br.readLine()) != null) {
		        String[] values = line.split(";");
		        records.add(values);
		    }
		
        Integer cont = 0;
		for (String[] s : records) {
			if (!cont.equals(0)) {
			codIBGE = tratarInteiros(s[0]);
			nomeCidade = (s[1]) ;
			microRegiao = StringUtils.newStringUtf8(s[2].getBytes());
			UF = StringUtils.newStringUtf8(s[3].getBytes());
			regiao = StringUtils.newStringUtf8(s[4].getBytes());
			area = tratarDouble(s[5]);
			populacao = tratarInteiros(s[6]);
			domicilios = tratarInteiros(s[7]);
			pib = tratarDouble(s[8]);
			idhGeral = tratarDouble(s[9]);
			rendaMedia = tratarDouble(s[10]);
			rendaNominal = (tratarDouble(s[11])/1000.00);
			peaDia = tratarInteiros(s[12]);
			idhEduc = tratarDouble(s[13]);
			idhLong = tratarDouble(s[14]);
			cidades.add(new Cidade(codIBGE, nomeCidade, microRegiao, UF, regiao, area, populacao, domicilios, pib,
					idhGeral, rendaMedia, rendaNominal, peaDia, idhEduc, idhLong));
			}
			cont++;
		}
        br.close();
		return cidades;
	}

	private Integer tratarInteiros(String entrada) {
		String saida = entrada.replace(".", "");
		if (saida.indexOf(',') > 0) {
			return Integer.parseInt(saida.substring(0, saida.indexOf(',')));
		} else
			return Integer.parseInt(saida);
	}

	private Double tratarDouble(String entrada) {
		String saida = entrada.replace(".", "");
		return Double.parseDouble(saida.replace(",", "."));
	}
	
	public boolean existeArquivo() {
		return new File("C:/Projeto Integrador/In/01.ProjetoIntegrador_BaseMunicipios_In.csv").exists();
	}

	@Override
	public Boolean escreverArquivo(ArrayList<Cidade> cidades) {
	    
		File file = new File("C:/Projeto Integrador/Out/01.ProjetoIntegrador_BaseMunicipios_Out.csv");
		try {
			ArrayList<String[]> linhas = new ArrayList<>();
			FileWriter outputfile = new FileWriter(file);
			CSVWriter writer = new CSVWriter(outputfile);
			String[] cabecalho = { "Código IBGE", "Municipios", "Microregião", "Estado", "Região Geográfica",
					"Área km²", "População", "Domicilios", "PIB Total(R$ mil)",
					"IDH - Índice de Desenvolvimento Humano Geral", "Renda Média", "Renda Nominal", "PEA Dia",
					"IDH Dimensão Educação", "IDH Dimensão Longividade", "Data de Última Alteração" };

			linhas.add(cabecalho);

			for (Cidade city : cidades) {
				String[] linha = { city.get_codIBGE().toString(), city.get_nomeCidade(), city.get_microRegiao(),
						city.get_UF(), city.get_regiao(), city.get_area().toString(), city.get_populacao().toString(),
						city.get_domicilios().toString(), city.get_pib().toString(), city.get_idhGeral().toString(),
						city.get_rendaMedia().toString(), city.get_rendaNominal().toString(), city.get_peaDia().toString(),
						city.get_idhEduc().toString(), city.get_idhLong().toString(), city.getDtUltimaAlteracao()

				};
				linhas.add(linha);
			}

			writer.writeAll(linhas);
			writer.close();
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public CidadeRepository() {}

}
