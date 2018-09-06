package players;
import baralho.Carta;

public class Dealer {
	String name = "Dealer";
	double pot;
	boolean status;
	int numCartas=0;
	Carta[] mao;
	
	public Dealer(){
		pot = 1000;
	}
	
	public void retirarSaldo(double aposta) {
		if(this.pot < aposta) System.out.println("O jogador " + name + " não tem saldo para essa aposta!");
		else this.pot -= aposta;
	}
	public void colocarSaldo(double aposta) {
		this.pot = aposta;
	}
	public void receberCarta(Carta carta) {
		mao[numCartas] = new Carta();
		mao[numCartas] = carta;
		numCartas++;
	}
	public void mostrarBaralho() {
		for(Carta x : mao) {
			x.exibirCarta();
		}
	}
}
