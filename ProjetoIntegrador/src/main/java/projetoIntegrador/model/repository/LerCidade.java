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
import com.opencsv.bean.OpencsvUtils;

import projetoIntegrador.model.Cidade;

public class LerCidade implements IArquivo {

	@Override
	public ArrayList<Cidade> lerArquivo(String nomeArquivo) throws IOException {
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

		Reader reader = Files.newBufferedReader(Paths.get(nomeArquivo));
		CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();

		for (String[] s : csvReader.readAll()) {
			codIBGE = tratarInteiros(s[0]);
			nomeCidade = s[1];
			microRegiao = s[2];
			UF = s[3];
			regiao = s[4];
			area = tratarDouble(s[5]);
			populacao = tratarInteiros(s[6]);
			domicilios = tratarInteiros(s[7]);
			pib = tratarDouble(s[8]);
			idhGeral = tratarDouble(s[9]);
			rendaMedia = tratarDouble(s[10]);
			rendaNominal = tratarDouble(s[11]);
			peaDia = tratarInteiros(s[12]);
			idhEduc = tratarDouble(s[13]);
			idhLong = tratarDouble(s[14]);
			cidades.add(new Cidade(codIBGE, nomeCidade, microRegiao, UF, regiao, area, populacao, domicilios, pib, idhGeral,
					rendaMedia, rendaNominal, peaDia, idhEduc, idhLong));
		}

		
		return cidades;
	}

	private Integer tratarInteiros(String entrada) {
		String saida = entrada.replace(".", "");
		if (saida.indexOf(',') > 0) {
			return Integer.parseInt(saida.substring(0,saida.indexOf(',') ));
		}else
			return Integer.parseInt(saida);
	}

	private Double tratarDouble(String entrada) {
		String saida = entrada.replace(".", "");
		return Double.parseDouble(saida.replace(",", "."));
	}

	@Override
	public Boolean escreverArquivo(ArrayList<Cidade> cidades) {
		File file = new File("caminhoArquivo"); 
	    try { 
	        // create FileWriter object with file as parameter 
	        FileWriter outputfile = new FileWriter(file); 
	  
	        // create CSVWriter object filewriter object as parameter 
	        CSVWriter writer = new CSVWriter(outputfile); 
	  
	        // adding header to csv 
	        String[] header = { "Name", "Class", "Marks" }; 
	        writer.writeNext(header); 
	  
            for (Cidade city : cidades) {
            	String [] linha = {city.getCodIBGE().toString() ,
            			           city.getNomeCidade()};
            	writer.writeNext(linha);
            }
	        writer.close(); 
	    } 
	    catch (IOException e) { 
	        // TODO Auto-generated catch block 
	        e.printStackTrace(); 
	    } 
		return true;
	}

}
