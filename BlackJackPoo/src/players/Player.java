package players;
import baralho.*;

public class Player extends PessoaMesa {
	
	public boolean hit(Carta novaCarta) {
		receberCarta(novaCarta);
		return true;
	}
	
	public double getAposta() {
		return this.aposta;
	}
	public void setAposta(double novaAposta) {
		this.aposta = novaAposta;
	}

}
