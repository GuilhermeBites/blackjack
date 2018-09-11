package players;
import baralho.*;

public class PessoaMesa {
	protected String nome;
	protected double saldo;
	protected boolean status = true;
	protected int numCartas;
	protected Carta[] mao;
	protected int valorMao = 0;
	protected double aposta;
	
	public PessoaMesa() {
		mao = new Carta[21];
		saldo = 1000.0;
		numCartas = 0;
	}
	
	public void setarNick(String nome) {
		this.nome = nome;
	}
	
	public String getNick() {
		return this.nome;
	}
	
	public void retirarSaldo(double aposta) {
		if(this.saldo < aposta) System.out.println(nome + " não tem saldo para essa aposta!");
		else this.saldo -= aposta;
	}
	
	public void acrescentarSaldo(double aposta) {
		this.saldo += aposta;
	}
	
	protected void receberCarta(Carta carta) {
		if(status){
		mao[numCartas] = carta;
		numCartas++;
		this.valorMao += carta.getValorCard();
		if(this.valorMao < 10) carta.mudarAs(11);
		}
	}
	
	public void mostrarMao() {
		for(int i=0;i<numCartas;i++) {
			mao[i].exibirCarta();
		}
	}
	
	public int getValorMao() {
		return valorMao;
	}
	
	public void limparMao() {
		this.numCartas = 0;
		this.valorMao = 0;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	
}
