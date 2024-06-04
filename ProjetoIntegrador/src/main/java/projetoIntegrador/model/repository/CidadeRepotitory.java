package projetoIntegrador.model.repository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.apache.commons.codec.binary.StringUtils;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;

import projetoIntegrador.model.Cidade;

public class CidadeRepotitory implements IArquivo {

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

		Reader reader = Files.newBufferedReader(Paths.get("C:/Projeto Integrador/In/01.ProjetoIntegrador_BaseMunicipios_In.csv"));
		CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();

		for (String[] s : csvReader.readAll()) {
			codIBGE = tratarInteiros(s[0]);
			nomeCidade = StringUtils.newStringUtf8(s[1].getBytes()) ;
			microRegiao = StringUtils.newStringUtf8(s[2].getBytes());
			UF = StringUtils.newStringUtf8(s[3].getBytes());
			regiao = StringUtils.newStringUtf8(s[4].getBytes());
			area = tratarDouble(s[5]);
			populacao = tratarInteiros(s[6]);
			domicilios = tratarInteiros(s[7]);
			pib = tratarDouble(s[8]) * 1000.00;
			idhGeral = tratarDouble(s[9]);
			rendaMedia = tratarDouble(s[10]);
			rendaNominal = tratarDouble(s[11]);
			peaDia = tratarInteiros(s[12]);
			idhEduc = tratarDouble(s[13]);
			idhLong = tratarDouble(s[14]);
			cidades.add(new Cidade(codIBGE, nomeCidade, microRegiao, UF, regiao, area, populacao, domicilios, pib,
					idhGeral, rendaMedia, rendaNominal, peaDia, idhEduc, idhLong));
		}

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
				String[] linha = { city.getCodIBGE().toString(), city.getNomeCidade(), city.getMicroRegiao(),
						city.getUF(), city.getRegiao(), city.getArea().toString(), city.getPopulacao().toString(),
						city.getDomicilios().toString(), city.getPib().toString(), city.getIdhGeral().toString(),
						city.getRendaMedia().toString(), city.getRendaNominal().toString(), city.getPeaDia().toString(),
						city.getIdhEduc().toString(), city.getIdhLong().toString(), city.getDtUltimaAlteracao()

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

}
