package mainPackage;
import players.*;
import baralho.*;
import java.util.*;

public class Jogo {
	Scanner scan = new Scanner(System.in);
	Player[] players;
	Dealer dealer = new Dealer();
	Baralho novoBaralho;
	boolean fimDeJogo = false;
	int numJogadores;
	
	public boolean iniciarJogo() {
		boolean vez = true;
		preencherJogadores();
		novoBaralho = new Baralho();
		novoBaralho.embaralhar();
		int playerOp;
		
		do {
			System.out.println("Hora de apostar!");
			for(int k=0;k<numJogadores;k++) {
				System.out.print(players[k].getNick() + ", digite o valor da sua aposta ==> ");
				players[k].setAposta(scan.nextDouble());
				scan.nextLine();
			}
			
			System.out.println("Vamos começar o jogo.");
			dealer.hit(novoBaralho.pegarCarta());
			System.out.print("Mão inicial do Dealer ==> ");
			dealer.mostrarMao();
			System.out.println("");
			for(int i=0;i<numJogadores;i++) {
				vez = true;
				System.out.println(players[i].getNick() + " é a sua vez de jogar, você receberá duas cartas iniciais.");
				players[i].hit(novoBaralho.pegarCarta());
				players[i].hit(novoBaralho.pegarCarta());
				while(vez != false) {
					System.out.print("Essa é a sua mão ==> ");
					players[i].mostrarMao();
					System.out.println("");
					System.out.print("Selecione o que deseja fazer => ");
					System.out.println("1 - HIT ou 2 - STAND");
					System.out.print("==> ");
					playerOp = scan.nextInt();
					switch(playerOp) {
					case 1:
						players[i].hit(novoBaralho.pegarCarta());
						break;
					case 2:
						vez = false;
						break;
					}
				}
				System.out.print(players[i].getNick() + " ==> "); players[i].mostrarMao();
				System.out.println("");
			}
			
			dealer.mostrarMao();
			System.out.println("");
			for(Player x : players) {
				x.mostrarMao();
				System.out.println("");
			}
			
			for(int j=0;j<numJogadores;j++) {
				if(players[j].getValorMao() > 21) {
					System.out.println("OPS... Você ultrapassou 21 pontos...");
					players[j].retirarSaldo(players[j].getAposta());
				}else if(players[j].getValorMao() > dealer.getValorMao()){
					System.out.println("Você recebeu 3:2 da sua aposta!");
					players[j].setAposta(players[j].getAposta()*1.5);
					dealer.retirarSaldo(players[j].getAposta());
				}else if(players[j].getValorMao() < dealer.getValorMao()) {
					System.out.println("Você perdeu para o dealer!");
					players[j].retirarSaldo(players[j].getAposta());
					dealer.acrescentarSaldo(players[j].getAposta());
				}
			}
			
			if(dealer.getSaldo() <= 0) fimDeJogo = true;
			
		}while(fimDeJogo != true);
		
		
		
		
		return true;
	}
	
	
	private void preencherJogadores() {
		System.out.print("Digite o número de jogadores (Máx 6) => ");
		this.numJogadores = scan.nextInt();
		scan.nextLine();
		
		players = new Player[this.numJogadores];
		
		for(int i=0;i<this.numJogadores;i++) {
			System.out.print("Digite o nome do jogador " + (i+1) + ": ");
			players[i] = new Player();
			players[i].setarNick(scan.nextLine());
		}
	}
	
	
}
