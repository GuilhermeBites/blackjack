package baralho;
import java.util.*;



public class Baralho {	
	private Carta[] cartas;
	private int cont=0;
	private boolean tmp = false;
	
	Random gera = new Random();
	
	public void embaralhar() {
		cartas = new Carta[52];
		for(int i=0;i<52;i++) {
			Carta novaCarta = new Carta();
			do {
				novaCarta.setValor(gera.nextInt(13)+1, gera.nextInt(4));
			}while(tmp == true);
			cartas[i] = novaCarta;
		}
	}
	
	public Carta pegarCarta() {
		cont++;
		return cartas[cont];
	}
	
	public void mostrarBaralho() {
		for(Carta x : cartas) System.out.println(x.getValor() + x.getNaipe());
	}
}
