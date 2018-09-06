package baralho;

public class Carta {
	String valor;
	String naipe;
	int valor2;
	int naipe2;
	
	protected void setValor(int valor,int naipe) {
		if(naipe == 0) this.naipe = "Copas";
		else if(naipe == 1) this.naipe = "Ouro";
		else if(naipe == 2) this.naipe = "Paus";
		else if(naipe == 3) this.naipe = "Espada";
		if(valor == 1) this.valor = "A";
		else if(valor == 11) this.valor = "J";
		else if(valor == 12) this.valor = "Q";
		else if(valor == 13) this.valor = "K";
		else this.valor = Integer.toString(valor);
	}
	
	protected boolean exibirCarta() {
		System.out.println(valor + naipe);
		return true;
	}
	protected String getValor() {
		return valor;
	}
	protected String getNaipe() {
		return naipe;
	}
}
