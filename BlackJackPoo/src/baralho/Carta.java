package baralho;

public class Carta {
	protected String valor;
	protected String naipe;
	protected int valorCard;
	
	protected void setValor(int valor,int naipe) {
		if(naipe == 0) this.naipe = "Copas";
		else if(naipe == 1) this.naipe = "Ouro";
		else if(naipe == 2) this.naipe = "Paus";
		else if(naipe == 3) this.naipe = "Espada";
		if(valor == 1) {
			this.valor = "A";
			this.valorCard = 1;
		}
		else if(valor == 11) {
			this.valor = "J";
			this.valorCard = 10;
		}
		else if(valor == 12) {
			this.valor = "Q";
			this.valorCard = 10;
		}
		else if(valor == 13) {
			this.valor = "K";
			this.valorCard = 10;
		}
		else {
			this.valor = Integer.toString(valor);
			this.valorCard = valor;
		}
	}
	
	public void mudarAs(int novoValor) {
		if(this.valor == "A") this.valorCard = novoValor;
	}
	
	public void exibirCarta() {
		System.out.println(valor + naipe);
	}
	public String getValor() {
		return valor;
	}
	public String getNaipe() {
		return naipe;
	}
	
	public int getValorCard() {
		return valorCard;
	}
}
