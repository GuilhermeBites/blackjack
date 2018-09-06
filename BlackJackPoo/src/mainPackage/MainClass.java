package mainPackage;
import java.util.*;
import players.*;
import baralho.*;

public class MainClass {

	public static void main(String[] args) {
		Player[] players;
		int op=0;
		Scanner scan = new Scanner(System.in);
		Baralho baralho = new Baralho();
		
		baralho.embaralhar();
		
		int numJogadores;
		System.out.print("Digite o número de participantes: ");
		numJogadores = scan.nextInt();
		scan.nextLine();
		
		players = new Player[numJogadores];
		Dealer dealer = new Dealer();
		
		for(int i=0;i<numJogadores;i++) {
			System.out.print("Digite o nome do jogador " + (i+1) + ": ");
			players[i] = new Player();
			players[i].setarNick(scan.nextLine());
		} 
		
		do {
			for(int x=0;x<numJogadores;x++) {
				System.out.println("Vez do jogador " + players[x].getNick());
				players[x].receberCarta(baralho.pegarCarta());
				players[x].receberCarta(baralho.pegarCarta());
				players[x].mostrarMao();
			}
		}while(op!=0);
		
		
		
		scan.close();
	}
}
