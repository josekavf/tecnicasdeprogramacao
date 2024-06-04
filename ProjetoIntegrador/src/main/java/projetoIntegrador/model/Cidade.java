package projetoIntegrador.model;

public class Cidade {
	
	public Cidade(Integer codIBGE, String nomeCidade, String microRegiao, String uF, String regiao, Double area,
			Integer populacao, Integer domicilios, Double pib, Double idhGeral, Double rendaMedia, Double rendaNominal,
			Integer peaDia, Double idhEduc, Double idhLong) {
		super();
		this.codIBGE = codIBGE;
		this.nomeCidade = nomeCidade;
		this.microRegiao = microRegiao;
		this.UF = uF;
		this.regiao = regiao;
		this.area = area;
		this.populacao = populacao;
		this.domicilios = domicilios;
		this.pib = pib;
		this.idhGeral = idhGeral;
		this.rendaMedia = rendaMedia;
		this.rendaNominal = rendaNominal;
		this.peaDia = peaDia;
		this.idhEduc = idhEduc;
		this.idhLong = idhLong;
		
		setDensidadeDemografica();
		setPibPerCapita();
		setClassific_idhGeral();
		setClassific_idhEduc();
		setClassific_idhLong();

	}
	
	private Integer codIBGE;
	private String nomeCidade;
	private String microRegiao;
	private String UF;
	private String regiao;
	private Double area;
	private Integer populacao;
	private Integer domicilios;
	private Double pib;
	private Double idhGeral;
	private Double rendaMedia;
	private Double rendaNominal;
	private Integer peaDia;
	private Double idhEduc;
	private Double idhLong;
	
	
	private Double densidadeDemografica;
	public Double getDensidadeDemografica() {
		return densidadeDemografica;
	}
	public void setDensidadeDemografica() {
		this.densidadeDemografica = (Double) (this.populacao/this.area);
	}
	
	public Double getPibPerCapita() {
		return pibPerCapita;
	}
	
	public void setPibPerCapita() {
		this.pibPerCapita = (Double) (this.pib/this.populacao);
	}
	
	public ClassifcIDH getClassific_idhGeral() {
		return this.classific_idhGeral;
	}
	
	public void setClassific_idhGeral() {
		if (this.idhGeral < 0.55) {
			this.classific_idhGeral = ClassifcIDH.BAIXO;
		}else if ( this.idhGeral <= 0.70) {
			this.classific_idhGeral = ClassifcIDH.MEDIO;
		} else if (this.idhGeral <= 0.80) {
			this.classific_idhGeral = ClassifcIDH.ALTO;
		} else {
			this.classific_idhGeral = ClassifcIDH.MUITO_ALTO;
		}
	}
	
	public ClassifcIDH getClassific_idhEduc() {
		return this.classific_idhEduc;
	}
	
	public void setClassific_idhEduc() {
		if (this.idhEduc < 0.55) {
			this.classific_idhEduc = ClassifcIDH.BAIXO;
		}else if ( this.idhEduc <= 0.70) {
			this.classific_idhEduc = ClassifcIDH.MEDIO;
		} else if (this.idhEduc <= 0.80) {
			this.classific_idhEduc = ClassifcIDH.ALTO;
		} else {
			this.classific_idhEduc = ClassifcIDH.MUITO_ALTO;
		}
	}
	
	public ClassifcIDH getClassific_idhLong() {
		return this.classific_idhLong;
	}
	
	public void setClassific_idhLong() {
		if (this.idhLong < 0.55) {
			this.classific_idhLong = ClassifcIDH.BAIXO;
		}else if ( this.idhLong <= 0.70) {
			this.classific_idhLong = ClassifcIDH.MEDIO;
		} else if (this.idhLong <= 0.80) {
			this.classific_idhLong = ClassifcIDH.ALTO;
		} else {
			this.classific_idhLong = ClassifcIDH.MUITO_ALTO;
		}
	}

	
	//Campos Calculados
	private Double pibPerCapita;
	private ClassifcIDH classific_idhGeral;
	private ClassifcIDH classific_idhEduc;
	private ClassifcIDH classific_idhLong;
	
	public Integer getCodIBGE() {
		return codIBGE;
	}
	public void setCodIBGE(Integer codIBGE) {
		this.codIBGE = codIBGE;
	}
	public String getNomeCidade() {
		return nomeCidade;
	}
	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	public String getMicroRegiao() {
		return microRegiao;
	}
	public void setMicroRegiao(String microRegiao) {
		this.microRegiao = microRegiao;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public Integer getPopulacao() {
		return populacao;
	}
	public void setPopulacao(Integer populacao) {
		this.populacao = populacao;
	}
	public Integer getDomicilios() {
		return domicilios;
	}
	public void setDomicilios(Integer domicilios) {
		this.domicilios = domicilios;
	}
	public Double getPib() {
		return pib;
	}
	public void setPib(Double pib) {
		this.pib = pib;
	}
	public Double getIdhGeral() {
		return idhGeral;
	}
	public void setIdhGeral(Double idgGeral) {
		this.idhGeral = idgGeral;
	}
	public Double getRendaMedia() {
		return rendaMedia;
	}
	public void setRendaMedia(Double rendaMedia) {
		this.rendaMedia = rendaMedia;
	}
	public Double getRendaNominal() {
		return rendaNominal;
	}
	public void setRendaNominal(Double rendaNominal) {
		this.rendaNominal = rendaNominal;
	}
	public Integer getPeaDia() {
		return peaDia;
	}
	public void setPeaDia(Integer peaDia) {
		this.peaDia = peaDia;
	}
	public Double getIdhEduc() {
		return idhEduc;
	}
	public void setIdhEduc(Double idhEduc) {
		this.idhEduc = idhEduc;
	}
	public Double getIdhLong() {
		return idhLong;
	}
	public void setIdhLong(Double idhLong) {
		this.idhLong = idhLong;
	}
	@Override
	public String toString() {
		return "Cidade [codIBGE=" + codIBGE + ", nomeCidade=" + nomeCidade + ", microRegiao=" + microRegiao + ", UF="
				+ UF + ", regiao=" + regiao + ", area=" + area + ", populacao=" + populacao + ", domicilios="
				+ domicilios + ", pib=" + pib + ", idhGeral=" + idhGeral + ", rendaMedia=" + rendaMedia
				+ ", rendaNominal=" + rendaNominal + ", peaDia=" + peaDia + ", idhEduc=" + idhEduc + ", idhLong="
				+ idhLong + ", densidadeDemografica=" + densidadeDemografica + ", pibPerCapita=" + pibPerCapita
				+ ", classific_idhGeral=" + classific_idhGeral + ", classific_idhEduc=" + classific_idhEduc
				+ ", classific_idhLong=" + classific_idhLong + "]";
	}
	
	

}
