package projetoIntegrador.model;

public class CidadeRank {
	
	private Integer codIBGE;
	private String municipio;
	private Double pibPerCapita;
	private Integer rankIDHGeral;
	private Integer rankIDHLong;
	private Integer rankIDHEduc;
	
	public Integer getCodIBGE() {
		return codIBGE;
	}
	public void setCodIBGE(Integer codIBGE) {
		this.codIBGE = codIBGE;
	}
	public Integer getRankIDHGeral() {
		return rankIDHGeral;
	}
	public void setRankIDHGeral(Integer rankIDHGeral) {
		this.rankIDHGeral = rankIDHGeral;
	}
	public Integer getRankIDHLong() {
		return rankIDHLong;
	}
	public void setRankIDHLong(Integer rankIDHLong) {
		this.rankIDHLong = rankIDHLong;
	}
	public Integer getRankIDHEduc() {
		return rankIDHEduc;
	}
	public void setRankIDHEduc(Integer rankIDHEduc) {
		this.rankIDHEduc = rankIDHEduc;
	}
	public CidadeRank() {
	}
	public String getMunicipio() {
		return this.municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public Double getPibPerCapita() {
		return pibPerCapita;
	}
	public void setPibPerCapita(Double pibPerCapita) {
		this.pibPerCapita = pibPerCapita;
	}
	

}
