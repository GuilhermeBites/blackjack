package baralho;
import java.util.*;



public class Baralho {	
	Carta[] cartas;
	int Valor;
	int naipe;
	boolean tmp = false;
	
	Random gera = new Random();
	
	public void embaralhar() {
		cartas = new Carta[52];
		for(int i=0;i<52;i++) {
			Carta novaCarta = new Carta();
			do {
				novaCarta.setValor(gera.nextInt(13)+1, gera.nextInt(4));
			//	System.out.println(novaCarta.getNaipe() + novaCarta.getValor());
				for(Carta x : cartas) {
					if((x.getNaipe() == novaCarta.getNaipe()) && (x.getValor() == novaCarta.getValor())) tmp = true;
				//	System.out.println("Teste");
				}
			}while(tmp==true);
			cartas[i] = novaCarta;
		}
	}
	
	public void mostrarBaralho() {
		for(Carta x : cartas) System.out.println(x.exibirCarta());
	}
}
