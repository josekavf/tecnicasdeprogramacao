package projetoIntegrador.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Cidade {
	
	public Cidade(Integer codIBGE, String nomeCidade, String microRegiao, String uF, String regiao, Double area,
			Integer populacao, Integer domicilios, Double pib, Double idhGeral, Double rendaMedia, Double rendaNominal,
			Integer peaDia, Double idhEduc, Double idhLong) {
		
		
		
		this._codIBGE = codIBGE;
		this._nomeCidade = nomeCidade;
		this._microRegiao = microRegiao;
		this._UF = uF;
		this._regiao = regiao;
		this._area = area;
		this._populacao =  populacao;
		this._domicilios = domicilios;
		this._pib = pib;
		this._idhGeral = idhGeral;
		this._rendaMedia = rendaMedia;
		this._rendaNominal = rendaNominal;
		this._peaDia = peaDia;
		this._idhEduc = idhEduc;
		this._idhLong =  idhLong;
		

		this.setDtUltimaAlteracao();
		this.setDensidadeDemografica();
		this.setPibPerCapita();
		this.setClassific_idhGeral();
		this.setClassific_idhEduc();
		this.setClassific_idhLong();

	}
	

	
	
	

	public Integer get_codIBGE() {
		return _codIBGE;
	}
	public void set_codIBGE(Integer _codIBGE) {
		this._codIBGE = _codIBGE;
	}
	public String get_nomeCidade() {
		return _nomeCidade;
	}
	public void set_nomeCidade(String _nomeCidade) {
		this._nomeCidade = _nomeCidade;
	}
	public String get_microRegiao() {
		return _microRegiao;
	}
	public void set_microRegiao(String _microRegiao) {
		this._microRegiao = _microRegiao;
	}
	public String get_UF() {
		return _UF;
	}
	public void set_UF(String _UF) {
		this._UF = _UF;
	}
	public String get_regiao() {
		return _regiao;
	}
	public void set_regiao(String _regiao) {
		this._regiao = _regiao;
	}
	public Double get_area() {
		return _area;
	}
	public void set_area(Double _area) {
		this._area = _area;
	}
	public Integer get_populacao() {
		return _populacao;
	}
	public void set_populacao(Integer _populacao) {
		this._populacao = _populacao;
	}
	public Integer get_domicilios() {
		return _domicilios;
	}
	public void set_domicilios(Integer _domicilios) {
		this._domicilios = _domicilios;
	}
	public Double get_pib() {
		return _pib;
	}
	public void set_pib(Double _pib) {
		this._pib = _pib;
	}
	public Double get_idhGeral() {
		return _idhGeral;
	}
	public void set_idhGeral(Double _idhGeral) {
		this._idhGeral = _idhGeral;
	}
	public Double get_rendaMedia() {
		return _rendaMedia;
	}
	public void set_rendaMedia(Double _rendaMedia) {
		this._rendaMedia = _rendaMedia;
	}
	public Double get_rendaNominal() {
		return _rendaNominal;
	}
	public void set_rendaNominal(Double _rendaNominal) {
		this._rendaNominal = _rendaNominal;
	}
	public Integer get_peaDia() {
		return _peaDia;
	}
	public void set_peaDia(Integer _peaDia) {
		this._peaDia = _peaDia;
	}
	public Double get_idhEduc() {
		return _idhEduc;
	}
	public void set_idhEduc(Double _idhEduc) {
		this._idhEduc = _idhEduc;
	}
	public Double get_idhLong() {
		return _idhLong;
	}
	public void set_idhLong(Double _idhLong) {
		this._idhLong = _idhLong;
	}
	
	
	private Integer _codIBGE;
	private String _nomeCidade;
	private String _microRegiao;
	private String _UF;
	private String _regiao;
	private Double _area;
	private Integer _populacao;
	private Integer _domicilios;
	private Double _pib;
	private Double _idhGeral;
	private Double _rendaMedia;
	private Double _rendaNominal;
	private Integer _peaDia;
	private Double _idhEduc;
	private Double _idhLong;
	
	//Campos Calculados
	private Double pibPerCapita;
	private Double densidadeDemografica;
	private ClassifcIDH classific_idhGeral;
	private ClassifcIDH classific_idhEduc;
	private ClassifcIDH classific_idhLong;
	private String dtUltimaAlteracao;
	
	
	public Double getDensidadeDemografica() {
		return densidadeDemografica;
	}
	public void setDensidadeDemografica() {
		if (this._area.equals(0.0)) {
			this.densidadeDemografica = (Double) (this._populacao/1.0);
		}
		else {
		this.densidadeDemografica = (Double) (this._populacao/this._area);
		}
	}
	
	public Double getPibPerCapita() {
		return pibPerCapita;
	}
	
	public void setPibPerCapita() {
		if (this._populacao.equals(0)) {
			this.pibPerCapita = (Double) ((this._pib*1000.00)/1.0);
		}else {
			this.pibPerCapita = (Double) ((this._pib*1000.00)/this._populacao);
		}
		
	}
	
	public ClassifcIDH getClassific_idhGeral() {
		return this.classific_idhGeral;
	}
	
	public void setClassific_idhGeral() {
		if (this._idhGeral < 0.55) {
			this.classific_idhGeral = ClassifcIDH.BAIXO;
		}else if ( this._idhGeral <= 0.70) {
			this.classific_idhGeral = ClassifcIDH.MEDIO;
		} else if (this._idhGeral <= 0.80) {
			this.classific_idhGeral = ClassifcIDH.ALTO;
		} else {
			this.classific_idhGeral = ClassifcIDH.MUITO_ALTO;
		}
	}
	
	public ClassifcIDH getClassific_idhEduc() {
		return this.classific_idhEduc;
	}
	
	public void setClassific_idhEduc() {
		if (this._idhEduc < 0.55) {
			this.classific_idhEduc = ClassifcIDH.BAIXO;
		}else if ( this._idhEduc <= 0.70) {
			this.classific_idhEduc = ClassifcIDH.MEDIO;
		} else if (this._idhEduc <= 0.80) {
			this.classific_idhEduc = ClassifcIDH.ALTO;
		} else {
			this.classific_idhEduc = ClassifcIDH.MUITO_ALTO;
		}
	}
	
	public ClassifcIDH getClassific_idhLong() {
		return this.classific_idhLong;
	}
	
	public void setClassific_idhLong() {
		if (this._idhLong < 0.55) {
			this.classific_idhLong = ClassifcIDH.BAIXO;
		}else if ( this._idhLong <= 0.70) {
			this.classific_idhLong = ClassifcIDH.MEDIO;
		} else if (this._idhLong <= 0.80) {
			this.classific_idhLong = ClassifcIDH.ALTO;
		} else {
			this.classific_idhLong = ClassifcIDH.MUITO_ALTO;
		}
	}


	@Override
	public String toString() {
		return "Cidade [codIBGE=" + _codIBGE + ", nomeCidade=" + _nomeCidade + ", microRegiao=" + _microRegiao + ", UF="
				+ _UF + ", regiao=" + _regiao + ", area=" + _area + ", populacao=" + _populacao + ", domicilios="
				+ _domicilios + ", pib=" + _pib + ", idhGeral=" + _idhGeral + ", rendaMedia=" + _rendaMedia
				+ ", rendaNominal=" + _rendaNominal + ", peaDia=" + _peaDia + ", idhEduc=" + _idhEduc + ", idhLong="
				+ _idhLong + ", densidadeDemografica=" + densidadeDemografica + ", pibPerCapita=" + pibPerCapita
				+ ", classific_idhGeral=" + classific_idhGeral + ", classific_idhEduc=" + classific_idhEduc
				+ ", classific_idhLong=" + classific_idhLong + "]";
	}
	public String getDtUltimaAlteracao() {
		return dtUltimaAlteracao;
	}
	
	public void setDtUltimaAlteracao() {
		this.dtUltimaAlteracao = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
	}

	
	

}
