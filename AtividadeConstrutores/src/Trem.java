import java.util.Date;

public class Trem {
	private int cont=0;
	private Vagao vagao;
	private Locomotiva locomotiva;
	private String prefixo;
	private Date dFormacao;
	private Estacao_Ferroviaria origem;
	private Estacao_Ferroviaria destino;
	public Trem(Vagao vagao, Locomotiva locomotiva, String prefixo, Date dFormacao, Estacao_Ferroviaria origem,
			Estacao_Ferroviaria destino) {
		if(origem!=destino) {
			cont+=2;
			this.vagao = vagao;
			this.locomotiva = locomotiva;
			this.prefixo = prefixo;
			this.dFormacao = dFormacao;
			this.origem = origem;
			this.destino = destino;
		}

	}
	public Vagao getVagao() {
		return vagao;
	}
	public void setVagao(Vagao vagao) {
		if(cont<150) {
			cont++;
			this.vagao = vagao;
		}
	}
	public Locomotiva getLocomotiva() {
		return locomotiva;
	}
	public void setLocomotiva(Locomotiva locomotiva) {
		if(cont<150) {
			cont++;
			this.locomotiva = locomotiva;
		}
	}
	public String getPrefixo() {
		return prefixo;
	}
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
	public Date getdFormacao() {
		return dFormacao;
	}
	public Estacao_Ferroviaria getOrigem() {
		return origem;
	}

	public Estacao_Ferroviaria getDestino() {
		return destino;
	}

}
