package players;
import baralho.Carta;
import java.util.*;

public class Dealer extends PessoaMesa {
	Random gera = new Random();
	
	public Dealer(){
		this.nome = "Dealer";
		this.saldo = 5000;
	}
	
	public boolean hit(Carta novaCarta) {
		if(this.mao.length <= 1) receberCarta(novaCarta);
		else if(this.valorMao < 15) receberCarta(novaCarta);
		else if(this.valorMao == 17) {
			if(gera.nextInt(5) == 2) receberCarta(novaCarta);
			else return false;
		}
		return true;
	}
}
