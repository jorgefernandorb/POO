

public class Linha_Ferroviaria {
	int id;
	float extensao;
	String decricao;
	Locomotiva locomotiva;
	Vagao vagao;
	Trem trem;
	public Linha_Ferroviaria(Locomotiva locomotiva, Vagao vagao, Trem trem) {
		this.locomotiva = locomotiva;
		this.vagao = vagao;
		this.trem = trem;
	}
	public Linha_Ferroviaria() {

	}
	public Linha_Ferroviaria(Locomotiva locomotiva) {
		this.locomotiva = locomotiva;
	}
	public Linha_Ferroviaria(Locomotiva locomotiva, Vagao vagao) {
		this.locomotiva = locomotiva;
		this.vagao = vagao;
	}
	
}
