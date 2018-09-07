package baralho;
import java.util.*;



public class Baralho {	
	private Carta[] cartas;
	private int cont=0;
	private int card =-1;
	
	public Baralho() {
		cartas = new Carta[52];
		for(int i=0;i<4;i++) {
			for(int x=1;x<14;x++) {
				cartas[cont] = new Carta();
				cartas[cont].setValor(x, i);
				cont++;
			}
		}
	}
	
	Random gera = new Random();
	
	public void embaralhar() {
		int n1,n2;
		Carta tmp = new Carta();
		for(int i=0;i<100;i++) {
			n1 = gera.nextInt(52);
			n2 = gera.nextInt(52);
			tmp = cartas[n1];
			cartas[n1] = cartas[n2];
			cartas[n2] = tmp;
		}
	}
	
	public Carta pegarCarta() {
		card++;
		return cartas[card++];
	}
	
	public void mostrarBaralho() {
		for(Carta x : cartas) System.out.println(x.getValor() + x.getNaipe());
	}
}
