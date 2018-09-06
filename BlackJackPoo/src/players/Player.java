package players;
import baralho.*;

public class Player {
	String nickName;
	double saldo;
	boolean status;
	int numCartas;
	Carta[] mao;
	
	public Player() {
		saldo = 1000.0;
		numCartas = 0;
	}
	
	public void setarNick(String nome) {
		this.nickName = nome;
	}
	
	public void retirarSaldo(double aposta) {
		if(this.saldo < aposta) System.out.println("O jogador " + nickName + " não tem saldo para essa aposta!");
		else this.saldo -= aposta;
	}
	
	public void acrescentarSaldo(double aposta) {
		this.saldo += aposta;
	}
	
	public void receberCarta(Carta carta) {
		if(status){
		mao[numCartas] = new Carta();
		mao[numCartas] = carta;
		numCartas++;
		}
	}
}
