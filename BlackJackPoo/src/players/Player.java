package players;
import baralho.*;

public class Player {
	private String nickName;
	private double saldo;
	private boolean status = true;
	private int numCartas;
	private Carta[] mao;
	
	public Player() {
		mao = new Carta[21];
		saldo = 1000.0;
		numCartas = 0;
	}
	
	public void setarNick(String nome) {
		this.nickName = nome;
	}
	
	public String getNick() {
		return nickName;
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
		mao[numCartas] = carta;
		numCartas++;
		}
	}
	
	public void mostrarMao() {
		for(int i=0;i<numCartas;i++) {
			mao[i].exibirCarta();
		}
	}
}
