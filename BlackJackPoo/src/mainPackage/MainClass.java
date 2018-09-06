package mainPackage;
import java.util.*;
import players.*;
import baralho.*;

public class MainClass {

	public static void main(String[] args) {
		Player[] players;
		Scanner scan = new Scanner(System.in);
		Baralho baralho = new Baralho();
		
		baralho.embaralhar();
		
		int numJogadores;
		System.out.print("Digite o n�mero de participantes: ");
		numJogadores = scan.nextInt();
		scan.nextLine();
		
		players = new Player[numJogadores];
		Dealer dealer = new Dealer();
		
		for(int i=0;i<numJogadores;i++) {
			System.out.print("Digite o nome do primeiro jogador: ");
			players[i] = new Player();
			players[i].setarNick(scan.nextLine());
		}
		scan.close();
	}
}
