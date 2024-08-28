package jogodavelha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		while(menu==0) {
		System.out.println("------------JOGO DA VELHA------------\n");
		System.out.println("-----------| 1-Jogador   |-----------");
		System.out.println("-----------| 2-Jogadores |-----------");
		System.out.println("-----------| 3-Instrução |-----------");
		System.out.println("\n------------JOGO DA VELHA------------");
		System.out.println("\nDigite a opção desejada (1, 2 ou 3): ");
		int modo = sc.nextInt();
		if(modo == 1) {
			menu=1;
			System.out.println("-----------ESCOLHA O NIVEL------------\n");
			System.out.println("-----------|  1-Fácil    |------------");
			System.out.println("-----------|  2-Normal   |------------");
			System.out.println("-----------|  3-Difícil  |------------");
			System.out.println("\n-----------ESCOLHA O NIVEL------------");
			System.out.println("\nDigite o Nivel de dificuldade (1, 2 ou 3): ");
			System.out.println("Para voltar digite 0!");
			int nivel = sc.nextInt();
			if(nivel==0) {
				menu=0;
			}
			switch(nivel) {
			
			case 1: 
				
				
			case 2:
				
				
			case 3:
				
				
			}
			
			
			
		}
		if(modo == 2) {
			menu=2;
			int resultado= 0;
			String n1 = "1";
			String n2 = "2";
			String n3 = "3";
			String n4 = "4";
			String n5 = "5";
			String n6 = "6";
			String n7 = "7";
			String n8 = "8";
			String n9 = "9";
			int j = 1;
			int b = 2;
			int t = b;
			int cont = 0;
			String erro = "";
			while(resultado==0) {
				
		System.out.println("\n");
		System.out.println("-----------------\n");
		System.out.println("  "+n1+"  |  "+n2+"  |  "+n3+"   ");
		System.out.println("_____|_____|_____");
		System.out.println("  "+n4+"  |  "+n5+"  |  "+n6+"   ");
		System.out.println("_____|_____|_____");
		System.out.println("  "+n7+"  |  "+n8+"  |  "+n9+"   ");
		System.out.println("     |     |     ");
		System.out.println("\n-----------------");
		System.out.println("\n");
		System.out.println(erro);
		System.out.println("\nDigite: '0' para voltar ao menu principal!");
		System.out.println("Vez do Jogador "+j+":");
		int vez = sc.nextInt();
			
		if(vez==0) {
			resultado = 1;
			menu = 0;
		}
		if (j == 1) {
		    switch (vez) {
		        case 1:
		            if (n1.equals("1")) {
		                n1 = "X";
		                t = j;
		                j = b;
		                b = t;
		                cont++;
		                erro = "";
		            } else {
		                erro = "⚠️ Essa posição já foi marcada, escolha outra posição!";
		                j = 1;
		            }
		            break;
		        case 2:
		            if (n2.equals("2")) {
		                n2 = "X";
		                t = j;
		                j = b;
		                b = t;
		                cont++;
		                erro = "";
		            } else {
		                erro = "⚠️ Essa posição já foi marcada, escolha outra posição!";
		                j = 1;
		            }
		            break;
		        case 3:
		            if (n3.equals("3")) {
		                n3 = "X";
		                t = j;
		                j = b;
		                b = t;
		                cont++;
		                erro = "";
		            } else {
		                erro = "⚠️ Essa posição já foi marcada, escolha outra posição!";
		                j = 1;
		            }
		            break;
		        case 4:
		            if (n4.equals("4")) {
		                n4 = "X";
		                t = j;
		                j = b;
		                b = t;
		                cont++;
		                erro = "";
		            } else {
		                erro = "⚠️ Essa posição já foi marcada, escolha outra posição!";
		                j = 1;
		            }
		            break;
		        case 5:
		            if (n5.equals("5")) {
		                n5 = "X";
		                t = j;
		                j = b;
		                b = t;
		                cont++;
		                erro = "";
		            } else {
		                erro = "⚠️ Essa posição já foi marcada, escolha outra posição!";
		                j = 1;
		            }
		            break;
		        case 6:
		            if (n6.equals("6")) {
		                n6 = "X";
		                t = j;
		                j = b;
		                b = t;
		                cont++;
		                erro = "";
		            } else {
		                erro = "⚠️ Essa posição já foi marcada, escolha outra posição!";
		                j = 1;
		            }
		            break;
		        case 7:
		            if (n7.equals("7")) {
		                n7 = "X";
		                t = j;
		                j = b;
		                b = t;
		                cont++;
		                erro = "";
		            } else {
		                erro = "⚠️ Essa posição já foi marcada, escolha outra posição!";
		                j = 1;
		            }
		            break;
		        case 8:
		            if (n8.equals("8")) {
		                n8 = "X";
		                t = j;
		                j = b;
		                b = t;
		                cont++;
		                erro = "";
		            } else {
		                erro = "⚠️ Essa posição já foi marcada, escolha outra posição!";
		                j = 1;
		            }
		            break;
		        case 9:
		            if (n9.equals("9")) {
		                n9 = "X";
		                t = j;
		                j = b;
		                b = t;
		                cont++;
		                erro = "";
		            } else {
		                erro = "⚠️ Essa posição já foi marcada, escolha outra posição!";
		                j = 1;
		            }
		            break;
		    }
		} else if (j == 2) {
		    switch (vez) {
		        case 1:
		            if (n1.equals("1")) {
		                n1 = "O";
		                t = j;
		                j = b;
		                b = t;
		                cont++;
		                erro = "";
		            } else {
		                erro = "⚠️ Essa posição já foi marcada, escolha outra posição!";
		                j = 2;
		            }
		            break;
		        case 2:
		            if (n2.equals("2")) {
		                n2 = "O";
		                t = j;
		                j = b;
		                b = t;
		                cont++;
		                erro = "";
		            } else {
		                erro = "⚠️ Essa posição já foi marcada, escolha outra posição!";
		                j = 2;
		            }
		            break;
		        case 3:
		            if (n3.equals("3")) {
		                n3 = "O";
		                t = j;
		                j = b;
		                b = t;
		                cont++;
		                erro = "";
		            } else {
		                erro = "⚠️ Essa posição já foi marcada, escolha outra posição!";
		                j = 2;
		            }
		            break;
		        case 4:
		            if (n4.equals("4")) {
		                n4 = "O";
		                t = j;
		                j = b;
		                b = t;
		                cont++;
		                erro = "";
		            } else {
		                erro = "⚠️ Essa posição já foi marcada, escolha outra posição!";
		                j = 2;
		            }
		            break;
		        case 5:
		            if (n5.equals("5")) {
		                n5 = "O";
		                t = j;
		                j = b;
		                b = t;
		                cont++;
		                erro = "";
		            } else {
		                erro = "⚠️ Essa posição já foi marcada, escolha outra posição!";
		                j = 2;
		            }
		            break;
		        case 6:
		            if (n6.equals("6")) {
		                n6 = "O";
		                t = j;
		                j = b;
		                b = t;
		                cont++;
		                erro = "";
		            } else {
		                erro = "⚠️ Essa posição já foi marcada, escolha outra posição!";
		                j = 2;
		            }
		            break;
		        case 7:
		            if (n7.equals("7")) {
		                n7 = "O";
		                t = j;
		                j = b;
		                b = t;
		                cont++;
		                erro = "";
		            } else {
		                erro = "⚠️ Essa posição já foi marcada, escolha outra posição!";
		                j = 2;
		            }
		            break;
		        case 8:
		            if (n8.equals("8")) {
		                n8 = "O";
		                t = j;
		                j = b;
		                b = t;
		                cont++;
		                erro = "";
		            } else {
		                erro = "⚠️ Essa posição já foi marcada, escolha outra posição!";
		                j = 2;
		            }
		            break;
		        case 9:
		            if (n9.equals("9")) {
		                n9 = "O";
		                t = j;
		                j = b;
		                b = t;
		                cont++;
		                erro = "";
		            } else {
		                erro = "⚠️ Essa posição já foi marcada, escolha outra posição!";
		                j = 2;
		            }
		            break;
		    }
		}


	
		if (n1.equals(n2) && n2.equals(n3)) {
			resultado = 1;
			System.out.println("-----------------\n");
			System.out.println("  "+n1+"  |  "+n2+"  |  "+n3+"   ");
			System.out.println("_____|_____|_____");
			System.out.println("  "+n4+"  |  "+n5+"  |  "+n6+"   ");
			System.out.println("_____|_____|_____");
			System.out.println("  "+n7+"  |  "+n8+"  |  "+n9+"   ");
			System.out.println("     |     |     ");
			System.out.println("\n-----------------");
			if (n1.equals("X")) {
				System.out.println("\nO jogador 1 Venceu!");
			}else {
				System.out.println("\nO jogador 2 Venceu!");
			}
		}else if (n4.equals(n5) && n5.equals(n6)) {
			resultado = 1;
			System.out.println("-----------------\n");
			System.out.println("  "+n1+"  |  "+n2+"  |  "+n3+"   ");
			System.out.println("_____|_____|_____");
			System.out.println("  "+n4+"  |  "+n5+"  |  "+n6+"   ");
			System.out.println("_____|_____|_____");
			System.out.println("  "+n7+"  |  "+n8+"  |  "+n9+"   ");
			System.out.println("     |     |     ");
			System.out.println("\n-----------------");
			if (n4.equals("X")) {
				System.out.println("\nO jogador 1 Venceu!");
			}else {
				System.out.println("\nO jogador 2 Venceu!");
			}
		}else if (n7.equals(n8) && n8.equals(n9)) {
			resultado = 1;
			System.out.println("-----------------\n");
			System.out.println("  "+n1+"  |  "+n2+"  |  "+n3+"   ");
			System.out.println("_____|_____|_____");
			System.out.println("  "+n4+"  |  "+n5+"  |  "+n6+"   ");
			System.out.println("_____|_____|_____");
			System.out.println("  "+n7+"  |  "+n8+"  |  "+n9+"   ");
			System.out.println("     |     |     ");
			System.out.println("\n-----------------");
			if (n7.equals("X")) {
				System.out.println("\nO jogador 1 Venceu!");
			}else {
				System.out.println("\nO jogador 2 Venceu!");
			}
		}else if (n1.equals(n4) && n4.equals(n7)) {
			resultado = 1;
			System.out.println("-----------------\n");
			System.out.println("  "+n1+"  |  "+n2+"  |  "+n3+"   ");
			System.out.println("_____|_____|_____");
			System.out.println("  "+n4+"  |  "+n5+"  |  "+n6+"   ");
			System.out.println("_____|_____|_____");
			System.out.println("  "+n7+"  |  "+n8+"  |  "+n9+"   ");
			System.out.println("     |     |     ");
			System.out.println("\n-----------------");
			if (n1.equals("X")) {
				System.out.println("\nO jogador 1 Venceu!");
			}else {
				System.out.println("\nO jogador 2 Venceu!");
			}
		}else if (n2.equals(n5) && n5.equals(n8)) {
			resultado = 1;
			System.out.println("-----------------\n");
			System.out.println("  "+n1+"  |  "+n2+"  |  "+n3+"   ");
			System.out.println("_____|_____|_____");
			System.out.println("  "+n4+"  |  "+n5+"  |  "+n6+"   ");
			System.out.println("_____|_____|_____");
			System.out.println("  "+n7+"  |  "+n8+"  |  "+n9+"   ");
			System.out.println("     |     |     ");
			System.out.println("\n-----------------");
			if (n2.equals("X")) {
				System.out.println("\nO jogador 1 Venceu!");
			}else {
				System.out.println("\nO jogador 2 Venceu!");
			}
		}else if (n3.equals(n6) && n6.equals(n9)) {
			resultado = 1;
			System.out.println("-----------------\n");
			System.out.println("  "+n1+"  |  "+n2+"  |  "+n3+"   ");
			System.out.println("_____|_____|_____");
			System.out.println("  "+n4+"  |  "+n5+"  |  "+n6+"   ");
			System.out.println("_____|_____|_____");
			System.out.println("  "+n7+"  |  "+n8+"  |  "+n9+"   ");
			System.out.println("     |     |     ");
			System.out.println("\n-----------------");
			if (n3.equals("X")) {
				System.out.println("\nO jogador 1 Venceu!");
			}else {
				System.out.println("\nO jogador 2 Venceu!");
			}
		}else if (n1.equals(n5) && n5.equals(n9)) {
			resultado = 1;
			System.out.println("-----------------\n");
			System.out.println("  "+n1+"  |  "+n2+"  |  "+n3+"   ");
			System.out.println("_____|_____|_____");
			System.out.println("  "+n4+"  |  "+n5+"  |  "+n6+"   ");
			System.out.println("_____|_____|_____");
			System.out.println("  "+n7+"  |  "+n8+"  |  "+n9+"   ");
			System.out.println("     |     |     ");
			System.out.println("\n-----------------");
			if (n1.equals("X")) {
				System.out.println("\nO jogador 1 Venceu!");
			}else {
				System.out.println("\nO jogador 2 Venceu!");
			}
		}else if (n3.equals(n5) && n5.equals(n7)) {
			resultado = 1;
			System.out.println("-----------------\n");
			System.out.println("  "+n1+"  |  "+n2+"  |  "+n3+"   ");
			System.out.println("_____|_____|_____");
			System.out.println("  "+n4+"  |  "+n5+"  |  "+n6+"   ");
			System.out.println("_____|_____|_____");
			System.out.println("  "+n7+"  |  "+n8+"  |  "+n9+"   ");
			System.out.println("     |     |     ");
			System.out.println("\n-----------------");
			if (n1.equals("X")) {
				System.out.println("\nO jogador 1 Venceu!");
			}else {
				System.out.println("\nO jogador 2 Venceu!");
			}
		}else if(cont == 9){
			resultado = 1;
			System.out.println("-----------------\n");
			System.out.println("  "+n1+"  |  "+n2+"  |  "+n3+"   ");
			System.out.println("_____|_____|_____");
			System.out.println("  "+n4+"  |  "+n5+"  |  "+n6+"   ");
			System.out.println("_____|_____|_____");
			System.out.println("  "+n7+"  |  "+n8+"  |  "+n9+"   ");
			System.out.println("     |     |     ");
			System.out.println("\n-----------------");
			System.out.println("\nDeu Velha!");
		}
			}
		}
		if(modo == 3) {
			menu=3;
			System.out.println("--------------INSTRUÇÃO--------------\n");
			System.out.println("VOCÊ DEVE DIGITAR O NUMERO DA POSIÇÃO\nONDE VOCÊ QUER COLOCAR O 'X' OU A 'O'.\nBOM JOGO!");
			System.out.println("\n--------------INSTRUÇÃO----------------");
			System.out.println("\nDigite: '0' para voltar ao menu principal: ");
			menu = sc.nextInt();
		}
		
		}//Fim do While	
		sc.close();
	}

}
