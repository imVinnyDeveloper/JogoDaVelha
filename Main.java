package jogodavelha;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String ANSI_BOLD = "\u001B[1m";
        String ANSI_RESET = "\u001B[0m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_LIGHT_YELLOW = "\033[0;93m";
        String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        String VERMELHO_FUNDO_CLARO = "\u001B[48;5;196m";
        String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        String RESET = "\u001B[0m";
        String GREEN_LIGHT = "\u001B[92m"; // Verde claro
        String BLUE_LIGHT = "\u001B[94m";  // Azul claro
        String WHITE = "\u001B[97m";       // Branco
        String BOLD = "\u001B[1m";         // Negrito

        // Cores de fundo
        String BG_GREEN_LIGHT = "\u001B[102m";  // Fundo verde claro
        String BG_BLUE_LIGHT = "\u001B[104m";   // Fundo azul claro
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int menu = 0;
		while(menu==0) {
			    System.out.println(BOLD + BLUE_LIGHT + "\n\n✧✧✧✧✧✧✧✧ JOGO DA VELHA ✧✧✧✧✧✧✧✧\n" + RESET);
		        System.out.println(GREEN_LIGHT + "❖❖❖❖❖❖❖ " + BG_GREEN_LIGHT + WHITE + BOLD+"1 - Jogador    " + RESET + GREEN_LIGHT + " ❖❖❖❖❖❖❖" + RESET);
		        System.out.println(BLUE_LIGHT + "❖❖❖❖❖❖❖ " + BG_BLUE_LIGHT + WHITE + BOLD+"2 - Jogadores  " + RESET + BLUE_LIGHT + " ❖❖❖❖❖❖❖" + RESET);
		        System.out.println(GREEN_LIGHT + "❖❖❖❖❖❖❖ " + BG_GREEN_LIGHT + WHITE + BOLD+"3 - Instruções " + RESET + GREEN_LIGHT + " ❖❖❖❖❖❖❖" + RESET);
		        System.out.println(BOLD + BLUE_LIGHT + "\n✧✧✧✧✧✧✧✧ JOGO DA VELHA ✧✧✧✧✧✧✧✧\n" + RESET);
		        System.out.print(GREEN_LIGHT + BOLD+ "Digite a opção desejada (1, 2 ou 3): " + RESET);
		int modo = sc.nextInt();
		if(modo == 1) {
			menu=1;
			System.out.println(BOLD + BLUE_LIGHT + "\n\n✧✧✧✧✧✧✧ ESCOLHA O NÍVEL ✧✧✧✧✧✧✧\n" + RESET);
	        System.out.println(GREEN_LIGHT + "❖❖❖❖❖❖ " + BG_GREEN_LIGHT + WHITE + BOLD+"1 - Fácil        " + RESET + GREEN_LIGHT + " ❖❖❖❖❖❖" + RESET);
	        System.out.println(BLUE_LIGHT + "❖❖❖❖❖❖ " + BG_BLUE_LIGHT + WHITE + BOLD+"2 - Normal       " + RESET + BLUE_LIGHT + " ❖❖❖❖❖❖" + RESET);
	        System.out.println(GREEN_LIGHT + "❖❖❖❖❖❖ " + BG_GREEN_LIGHT + WHITE + BOLD+"3 - Díficl       " + RESET + GREEN_LIGHT + " ❖❖❖❖❖❖" + RESET);
	        System.out.println(BOLD + BLUE_LIGHT + "\n✧✧✧✧✧✧✧ ESCOLHA O NÍVEL ✧✧✧✧✧✧✧\n" + RESET);
			System.out.println(BOLD+GREEN_LIGHT+"\nDigite o Nivel de dificuldade (1, 2 ou 3): "+RESET);
			System.out.println(ANSI_LIGHT_YELLOW+BOLD+"Para voltar digite 0!"+RESET);
			int nivel = sc.nextInt();
			if(nivel==0) {
				menu=0;
			}
			switch(nivel) {
			
			case 1: 
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
				int sair = 0;
				String erro = "";
				int cont = 0;
			while(resultado==0) {
					sair = 0;
			if (j == 1) {
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("  "+n1+"  |  "+n2+"  |  "+n3+"   ");
				System.out.println("_____|_____|_____");
				System.out.println("  "+n4+"  |  "+n5+"  |  "+n6+"   ");
				System.out.println("_____|_____|_____");
				System.out.println("  "+n7+"  |  "+n8+"  |  "+n9+"   ");
				System.out.println("     |     |     ");
				System.out.println("\n");
				System.out.println(erro);
				System.out.println(ANSI_LIGHT_YELLOW+BOLD+"\nDigite: '0' para voltar ao menu principal!"+ANSI_RESET);
				System.out.print(ANSI_GREEN+ANSI_BOLD+"[ SUA VEZ ] "+ANSI_RESET);
				int vez = sc.nextInt();
				 for (int i = 11; i > 0; i--) {
				        System.out.print(ANSI_GREEN+"█"+ANSI_RESET); 
				        try {
				            Thread.sleep(50);
				        } catch (InterruptedException e) {
				            e.printStackTrace();
				        }
				    }	   
				    try {
				        Thread.sleep(50); 
				    } catch (InterruptedException e) {
				        e.printStackTrace();
				    }
				if(vez==0) {
					resultado = 1;
			        menu = 0;
				}
				
				switch (vez) {
			    case 1:
			        if (n1.equals("1")) {
			            n1 = ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET;
			            j = 2;
			            erro = "";
			            cont++;
			        } else {
			            erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!";
			            j = 1;
			        }
			        break;

			    case 2:
			        if (n2.equals("2")) {
			            n2 = ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET;
			            j = 2;
			            cont++;
			            erro = "";
			        } else {
			            erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!";
			            j = 1;
			        }
			        break;

			    case 3:
			        if (n3.equals("3")) {
			            n3 = ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET;
			            j = 2;
			            cont++;
			            erro = "";
			        } else {
			            erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!";
			            j = 1;
			        }
			        break;

			    case 4:
			        if (n4.equals("4")) {
			            n4 = ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET;
			            j = 2;
			            cont++;
			            erro = "";
			        } else {
			            erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!";
			            j = 1;
			        }
			        break;

			    case 5:
			        if (n5.equals("5")) {
			            n5 = ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET;
			            j = 2;
			            cont++;
			            erro = "";
			        } else {
			            erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!";
			            j = 1;
			        }
			        break;

			    case 6:
			        if (n6.equals("6")) {
			            n6 = ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET;
			            j = 2;
			            cont++;
			            erro = "";
			        } else {
			            erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!";
			            j = 1;
			        }
			        break;

			    case 7:
			        if (n7.equals("7")) {
			            n7 = ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET;
			            j = 2;
			            cont++;
			            erro = "";
			        } else {
			            erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!";
			            j = 1;
			        }
			        break;

			    case 8:
			        if (n8.equals("8")) {
			            n8 = ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET;
			            j = 2;
			            cont++;
			            erro = "";
			        } else {
			            erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!";
			            j = 1;
			        }
			        break;

			    case 9:
			        if (n9.equals("9")) {
			            n9 = ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET;
			            j = 2;
			            cont++;
			            erro = "";
			        } else {
			            erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!";
			            j = 1;
			        }
			        break;
			}

				}else if (j == 2) {
					
					System.out.println("\n");
					System.out.println("\n");
					System.out.println("  "+n1+"  |  "+n2+"  |  "+n3+"   ");
					System.out.println("_____|_____|_____");
					System.out.println("  "+n4+"  |  "+n5+"  |  "+n6+"   ");
					System.out.println("_____|_____|_____");
					System.out.println("  "+n7+"  |  "+n8+"  |  "+n9+"   ");
					System.out.println("     |     |     ");
					System.out.println("\n");
					System.out.println("\n");
				    System.out.print(ANSI_YELLOW+ANSI_BOLD+"\n[ VEZ DO COMPUTADOR ]\n"+ANSI_RESET);
				    
				    
				    for (int i = 21; i > 0; i--) {
				        System.out.print(ANSI_YELLOW+"█"+ANSI_RESET); 
				        try {
				            Thread.sleep(50);
				        } catch (InterruptedException e) {
				            e.printStackTrace();
				        }
				    }
				    
				   
				    

				   
				    try {
				        Thread.sleep(25); 
				    } catch (InterruptedException e) {
				        e.printStackTrace();
				    }

				    while (sair == 0) {
				        int numerosorteio = random.nextInt(9) + 1;
				        switch (numerosorteio) {
				        case 1:
				            if (n1.equals("1")) {
				                n1 = ANSI_YELLOW + ANSI_BOLD + "O" + ANSI_RESET;
				                j = 1;
				                cont++;
				                sair = 1;
				            } else {
				                j = 2;
				            }
				            break;

				        case 2:
				            if (n2.equals("2")) {
				                n2 = ANSI_YELLOW + ANSI_BOLD + "O" + ANSI_RESET;
				                j = 1;
				                cont++;
				                sair = 1;
				            } else {
				                j = 2;
				            }
				            break;

				        case 3:
				            if (n3.equals("3")) {
				                n3 = ANSI_YELLOW + ANSI_BOLD + "O" + ANSI_RESET;
				                j = 1;
				                cont++;
				                sair = 1;
				            } else {
				                j = 2;
				            }
				            break;

				        case 4:
				            if (n4.equals("4")) {
				                n4 = ANSI_YELLOW + ANSI_BOLD + "O" + ANSI_RESET;
				                j = 1;
				                cont++;
				                sair = 1;
				            } else {
				                j = 2;
				            }
				            break;

				        case 5:
				            if (n5.equals("5")) {
				                n5 = ANSI_YELLOW + ANSI_BOLD + "O" + ANSI_RESET;
				                j = 1;
				                cont++;
				                sair = 1;
				            } else {
				                j = 2;
				            }
				            break;

				        case 6:
				            if (n6.equals("6")) {
				                n6 = ANSI_YELLOW + ANSI_BOLD + "O" + ANSI_RESET;
				                j = 1;
				                cont++;
				                sair = 1;
				            } else {
				                j = 2;
				            }
				            break;

				        case 7:
				            if (n7.equals("7")) {
				                n7 = ANSI_YELLOW + ANSI_BOLD + "O" + ANSI_RESET;
				                j = 1;
				                cont++;
				                sair = 1;
				            } else {
				                j = 2;
				            }
				            break;

				        case 8:
				            if (n8.equals("8")) {
				                n8 = ANSI_YELLOW + ANSI_BOLD + "O" + ANSI_RESET;
				                j = 1;
				                cont++;
				                sair = 1;
				            } else {
				                j = 2;
				            }
				            break;

				        case 9:
				            if (n9.equals("9")) {
				                n9 = ANSI_YELLOW + ANSI_BOLD + "O" + ANSI_RESET;
				                j = 1;
				                cont++;
				                sair = 1;
				            } else {
				                j = 2;
				            }
				            break;
				    }

				    }
				}
			if (n1.equals(n2) && n2.equals(n3)) {
			    resultado = 1;

			    if (n1.equals(ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET)) {
			        n1 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        n2 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        n3 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        System.out.println("\n\n\n");
			        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
			        System.out.println("     |     |     ");
			        System.out.println("\n");
			        System.out.println(ANSI_BOLD + ANSI_GREEN_BACKGROUND + "\nVOCÊ VENCEU!" + ANSI_RESET);
			    } else {
			        n1 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        n2 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        n3 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        System.out.println("\n\n\n");
			        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
			        System.out.println("     |     |     ");
			        System.out.println("\n");
			        System.out.println(ANSI_BOLD + ANSI_YELLOW_BACKGROUND + "\nO COMPUTADOR VENCEU!" + ANSI_RESET);
			    }
			} else if (n4.equals(n5) && n5.equals(n6)) {
			    resultado = 1;

			    if (n4.equals(ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET)) {
			        n4 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        n5 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        n6 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        System.out.println("\n\n\n");
			        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
			        System.out.println("     |     |     ");
			        System.out.println("\n");
			        System.out.println(ANSI_BOLD + ANSI_GREEN_BACKGROUND + "\nVOCÊ VENCEU!" + ANSI_RESET);
			    } else {
			        n4 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        n5 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        n6 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        System.out.println("\n\n\n");
			        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
			        System.out.println("     |     |     ");
			        System.out.println("\n");
			        System.out.println(ANSI_BOLD + ANSI_YELLOW_BACKGROUND + "\nO COMPUTADOR VENCEU!" + ANSI_RESET);
			    }
			} else if (n7.equals(n8) && n8.equals(n9)) {
			    resultado = 1;

			    if (n7.equals(ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET)) {
			        n7 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        n8 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        n9 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        System.out.println("\n\n\n");
			        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
			        System.out.println("     |     |     ");
			        System.out.println("\n");
			        System.out.println(ANSI_BOLD + ANSI_GREEN_BACKGROUND + "\nVOCÊ VENCEU!" + ANSI_RESET);
			    } else {
			        n7 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        n8 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        n9 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        System.out.println("\n\n\n");
			        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
			        System.out.println("     |     |     ");
			        System.out.println("\n");
			        System.out.println(ANSI_BOLD + ANSI_YELLOW_BACKGROUND + "\nO COMPUTADOR VENCEU!" + ANSI_RESET);
			    }
			} else if (n1.equals(n4) && n4.equals(n7)) {
			    resultado = 1;

			    if (n1.equals(ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET)) {
			        n1 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        n4 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        n7 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        System.out.println("\n\n\n");
			        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
			        System.out.println("     |     |     ");
			        System.out.println("\n");
			        System.out.println(ANSI_BOLD + ANSI_GREEN_BACKGROUND + "\nVOCÊ VENCEU!" + ANSI_RESET);
			    } else {
			        n1 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        n4 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        n7 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        System.out.println("\n\n\n");
			        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
			        System.out.println("     |     |     ");
			        System.out.println("\n");
			        System.out.println(ANSI_BOLD + ANSI_YELLOW_BACKGROUND + "\nO COMPUTADOR VENCEU!" + ANSI_RESET);
			    }
			} else if (n2.equals(n5) && n5.equals(n8)) {
			    resultado = 1;

			    if (n2.equals(ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET)) {
			        n2 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        n5 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        n8 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        System.out.println("\n\n\n");
			        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
			        System.out.println("     |     |     ");
			        System.out.println("\n");
			        System.out.println(ANSI_BOLD + ANSI_GREEN_BACKGROUND + "\nVOCÊ VENCEU!" + ANSI_RESET);
			    } else {
			        n2 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        n5 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        n8 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        System.out.println("\n\n\n");
			        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
			        System.out.println("     |     |     ");
			        System.out.println("\n");
			        System.out.println(ANSI_BOLD + ANSI_YELLOW_BACKGROUND + "\nO COMPUTADOR VENCEU!" + ANSI_RESET);
			    }
			} else if (n3.equals(n6) && n6.equals(n9)) {
			    resultado = 1;

			    if (n3.equals(ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET)) {
			        n3 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        n6 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        n9 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        System.out.println("\n\n\n");
			        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
			        System.out.println("     |     |     ");
			        System.out.println("\n");
			        System.out.println(ANSI_BOLD + ANSI_GREEN_BACKGROUND + "\nVOCÊ VENCEU!" + ANSI_RESET);
			    } else {
			        n3 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        n6 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        n9 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        System.out.println("\n\n\n");
			        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
			        System.out.println("     |     |     ");
			        System.out.println("\n");
			        System.out.println(ANSI_BOLD + ANSI_YELLOW_BACKGROUND + "\nO COMPUTADOR VENCEU!" + ANSI_RESET);
			    }
			} else if (n1.equals(n5) && n5.equals(n9)) {
			    resultado = 1;

			    if (n1.equals(ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET)) {
			        n1 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        n5 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        n9 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        System.out.println("\n\n\n");
			        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
			        System.out.println("     |     |     ");
			        System.out.println("\n");
			        System.out.println(ANSI_BOLD + ANSI_GREEN_BACKGROUND + "\nVOCÊ VENCEU!" + ANSI_RESET);
			    } else {
			        n1 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        n5 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        n9 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        System.out.println("\n\n\n");
			        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
			        System.out.println("     |     |     ");
			        System.out.println("\n");
			        System.out.println(ANSI_BOLD + ANSI_YELLOW_BACKGROUND + "\nO COMPUTADOR VENCEU!" + ANSI_RESET);
			    }
			} else if (n3.equals(n5) && n5.equals(n7)) {
			    resultado = 1;
			    if (n3.equals(ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET)) {
			        n3 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        n5 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        n7 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
			        System.out.println("\n\n\n");
			        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
			        System.out.println("     |     |     ");
			        System.out.println("\n");
			        System.out.println(ANSI_BOLD + ANSI_GREEN_BACKGROUND + "\nVOCÊ VENCEU!" + ANSI_RESET);
			    } else {
			        n3 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        n5 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        n7 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
			        System.out.println("\n\n\n");
			        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
			        System.out.println("_____|_____|_____");
			        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
			        System.out.println("     |     |     ");
			        System.out.println("\n");
			        System.out.println(ANSI_BOLD + ANSI_YELLOW_BACKGROUND + "\nO COMPUTADOR VENCEU!" + ANSI_RESET);
			        }
			}else if(cont == 9){
				resultado = 1;
				System.out.println("\n\n\n");
				System.out.println("  "+n1+"  |  "+n2+"  |  "+n3+"   ");
				System.out.println("_____|_____|_____");
				System.out.println("  "+n4+"  |  "+n5+"  |  "+n6+"   ");
				System.out.println("_____|_____|_____");
				System.out.println("  "+n7+"  |  "+n8+"  |  "+n9+"   ");
				System.out.println("     |     |     ");
				System.out.println("\n");
				System.out.println(ANSI_PURPLE_BACKGROUND+ANSI_BOLD+"\nDEU VELHA!"+ANSI_RESET);
			}
				}
			break;
				
				
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
		System.out.print(ANSI_LIGHT_YELLOW+BOLD+"\nDigite: '0' para voltar ao menu principal!"+RESET);
		if(j==1) {
		System.out.print(ANSI_GREEN+ANSI_BOLD+"\n[ VEZ DO JOGADOR "+j+" ] "+ANSI_RESET);
		}else {
			System.out.print(ANSI_YELLOW+ANSI_BOLD+"\n[ VEZ DO JOGADOR "+j+" ] "+ANSI_RESET);
		}
		int vez = sc.nextInt();
			
		if(vez==0) {
			resultado = 1;
			menu = 0;
		}
		if (j == 1) {
		    switch (vez) {
		        case 1:
		            if (n1.equals("1")) {
		                n1 = ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET;
		                j = 2;
		                erro = "";
		                cont++;
		            } else {
		                erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!"+ANSI_RESET;
		                j = 1;
		            }
		            break;
		        case 2:
		            if (n2.equals("2")) {
		                n2 = ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET;
		                j = 2;
		                cont++;
		                erro = "";
		            } else {
		                erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!"+ANSI_RESET;
		                j = 1;
		            }
		            break;
		        case 3:
		            if (n3.equals("3")) {
		                n3 = ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET;
		                j = 2;
		                erro = "";
		                cont++;
		            } else {
		                erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!"+ANSI_RESET;
		                j = 1;
		            }
		            break;
		        case 4:
		            if (n4.equals("4")) {
		                n4 = ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET;
		                j = 2;
		                cont++;
		                erro = "";
		            } else {
		                erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!"+ANSI_RESET;
		                j = 1;
		            }
		            break;
		        case 5:
		            if (n5.equals("5")) {
		                n5 = ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET;
		                j = 2;
		                erro = "";
		                cont++;
		            } else {
		                erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!"+ANSI_RESET;
		                j = 1;
		            }
		            break;
		        case 6:
		            if (n6.equals("6")) {
		                n6 = ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET;
		                j = 2;
		                cont++;
		                erro = "";
		            } else {
		                erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!"+ANSI_RESET;
		                j = 1;
		            }
		            break;
		        case 7:
		            if (n7.equals("7")) {
		                n7 = ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET;
		                j = 2;
		                cont++;
		                erro = "";
		            } else {
		                erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!"+ANSI_RESET;
		                j = 1;
		            }
		            break;
		        case 8:
		            if (n8.equals("8")) {
		                n8 = ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET;
		                j = 2;
		                cont++;
		                erro = "";
		            } else {
		                erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!"+ANSI_RESET;
		                j = 1;
		            }
		            break;
		        case 9:
		            if (n9.equals("9")) {
		                n9 = ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET;
		                j = 2;
		                erro = "";
		                cont++;
		            } else {
		                erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!"+ANSI_RESET;
		                j = 1;
		            }
		            break;
		    }
		    for (int i = 20; i > 0; i--) {
		        System.out.print(ANSI_GREEN+"█"+ANSI_RESET); 
		        try {
		            Thread.sleep(40);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		    }
		    
		   
		    

		   
		    try {
		        Thread.sleep(25); 
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		} else if (j == 2) {
		    switch (vez) {
		        case 1:
		            if (n1.equals("1")) {
		                n1 = ANSI_YELLOW + ANSI_BOLD + "O" + ANSI_RESET;
		                j = 1;
		                cont++;
		                erro = "";
		            } else {
		                erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!"+ANSI_RESET;
		                j = 2;
		            }
		            break;
		        case 2:
		            if (n2.equals("2")) {
		                n2 = ANSI_YELLOW + ANSI_BOLD + "O" + ANSI_RESET;
		                j = 1;
		                cont++;
		                erro = "";
		            } else {
		                erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!"+ANSI_RESET;
		                j = 2;
		            }
		            break;
		        case 3:
		            if (n3.equals("3")) {
		                n3 = ANSI_YELLOW + ANSI_BOLD + "O" + ANSI_RESET;
		                j = 1;
		                erro = "";
		                cont++;
		            } else {
		                erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!"+ANSI_RESET;
		                j = 2;
		            }
		            break;
		        case 4:
		            if (n4.equals("4")) {
		                n4 = ANSI_YELLOW + ANSI_BOLD + "O" + ANSI_RESET;
		                j = 1;
		                erro = "";
		                cont++;
		            } else {
		                erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!"+ANSI_RESET;
		                j = 2;
		            }
		            break;
		        case 5:
		            if (n5.equals("5")) {
		                n5 = ANSI_YELLOW + ANSI_BOLD + "O" + ANSI_RESET;
		                j = 1;
		                erro = "";
		                cont++;
		            } else {
		                erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!"+ANSI_RESET;
		                j = 2;
		            }
		            break;
		        case 6:
		            if (n6.equals("6")) {
		                n6 = ANSI_YELLOW + ANSI_BOLD + "O" + ANSI_RESET;
		                j = 1;
		                erro = "";
		                cont++;
		            } else {
		                erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!"+ANSI_RESET;
		                j = 2;
		            }
		            break;
		        case 7:
		            if (n7.equals("7")) {
		                n7 = ANSI_YELLOW + ANSI_BOLD + "O" + ANSI_RESET;
		                j = 1;
		                cont++;
		                erro = "";
		            } else {
		                erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!"+ANSI_RESET;
		                j = 2;
		            }
		            break;
		        case 8:
		            if (n8.equals("8")) {
		                n8 = ANSI_YELLOW + ANSI_BOLD + "O" + ANSI_RESET;
		                j = 1;
		                cont++;
		                erro = "";
		            } else {
		                erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!"+ANSI_RESET;
		                j = 2;
		            }
		            break;
		        case 9:
		            if (n9.equals("9")) {
		                n9 = ANSI_YELLOW + ANSI_BOLD + "O" + ANSI_RESET;
		                j = 1;
		                cont++;
		                erro = "";
		            } else {
		                erro = ANSI_BOLD+VERMELHO_FUNDO_CLARO+"⚠️ Essa posição já foi marcada, escolha outra posição!"+ANSI_RESET;
		                j = 2;
		            }
		            break;
		    }
		    for (int i = 20; i > 0; i--) {
		        System.out.print(ANSI_YELLOW+"█"+ANSI_RESET); 
		        try {
		            Thread.sleep(40);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		    }
		    
		   
		    

		   
		    try {
		        Thread.sleep(25); 
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		}


	
		if (n1.equals(n2) && n2.equals(n3)) {
		    resultado = 1;

		    if (n1.equals(ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET)) {
		        n1 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        n2 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        n3 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        System.out.println("\n\n\n");
		        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
		        System.out.println("     |     |     ");
		        System.out.println("\n");
		        System.out.println(ANSI_BOLD + ANSI_GREEN_BACKGROUND + "\nJOGADOR 1 VENCEU!" + ANSI_RESET);
		    } else {
		        n1 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        n2 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        n3 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        System.out.println("\n\n\n");
		        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
		        System.out.println("     |     |     ");
		        System.out.println("\n");
		        System.out.println(ANSI_BOLD + ANSI_YELLOW_BACKGROUND + "\nJOGADOR 2 VENCEU!" + ANSI_RESET);
		    }
		} else if (n4.equals(n5) && n5.equals(n6)) {
		    resultado = 1;

		    if (n4.equals(ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET)) {
		        n4 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        n5 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        n6 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        System.out.println("\n\n\n");
		        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
		        System.out.println("     |     |     ");
		        System.out.println("\n");
		        System.out.println(ANSI_BOLD + ANSI_GREEN_BACKGROUND + "\nJOGADOR 1 VENCEU!" + ANSI_RESET);
		    } else {
		        n4 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        n5 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        n6 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        System.out.println("\n\n\n");
		        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
		        System.out.println("     |     |     ");
		        System.out.println("\n");
		        System.out.println(ANSI_BOLD + ANSI_YELLOW_BACKGROUND + "\nJOGADOR 2 VENCEU!" + ANSI_RESET);
		    }
		} else if (n7.equals(n8) && n8.equals(n9)) {
		    resultado = 1;

		    if (n7.equals(ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET)) {
		        n7 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        n8 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        n9 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        System.out.println("\n\n\n");
		        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
		        System.out.println("     |     |     ");
		        System.out.println("\n");
		        System.out.println(ANSI_BOLD + ANSI_GREEN_BACKGROUND + "\nJOGADOR 1 VENCEU!" + ANSI_RESET);
		    } else {
		        n7 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        n8 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        n9 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        System.out.println("\n\n\n");
		        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
		        System.out.println("     |     |     ");
		        System.out.println("\n");
		        System.out.println(ANSI_BOLD + ANSI_YELLOW_BACKGROUND + "\nJOGADOR 2 VENCEU!" + ANSI_RESET);
		    }
		} else if (n1.equals(n4) && n4.equals(n7)) {
		    resultado = 1;

		    if (n1.equals(ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET)) {
		        n1 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        n4 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        n7 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        System.out.println("\n\n\n");
		        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
		        System.out.println("     |     |     ");
		        System.out.println("\n");
		        System.out.println(ANSI_BOLD + ANSI_GREEN_BACKGROUND + "\nJOGADOR 1 VENCEU!" + ANSI_RESET);
		    } else {
		        n1 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        n4 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        n7 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        System.out.println("\n\n\n");
		        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
		        System.out.println("     |     |     ");
		        System.out.println("\n");
		        System.out.println(ANSI_BOLD + ANSI_YELLOW_BACKGROUND + "\nJOGADOR 2 VENCEU!" + ANSI_RESET);
		    }
		} else if (n2.equals(n5) && n5.equals(n8)) {
		    resultado = 1;

		    if (n2.equals(ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET)) {
		        n2 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        n5 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        n8 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        System.out.println("\n\n\n");
		        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
		        System.out.println("     |     |     ");
		        System.out.println("\n");
		        System.out.println(ANSI_BOLD + ANSI_GREEN_BACKGROUND + "\nJOGADOR 1 VENCEU!" + ANSI_RESET);
		    } else {
		        n2 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        n5 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        n8 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        System.out.println("\n\n\n");
		        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
		        System.out.println("     |     |     ");
		        System.out.println("\n");
		        System.out.println(ANSI_BOLD + ANSI_YELLOW_BACKGROUND + "\nJOGADOR 2 VENCEU!" + ANSI_RESET);
		    }
		} else if (n3.equals(n6) && n6.equals(n9)) {
		    resultado = 1;

		    if (n3.equals(ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET)) {
		        n3 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        n6 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        n9 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        System.out.println("\n\n\n");
		        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
		        System.out.println("     |     |     ");
		        System.out.println("\n");
		        System.out.println(ANSI_BOLD + ANSI_GREEN_BACKGROUND + "\nJOGADOR 1 VENCEU!" + ANSI_RESET);
		    } else {
		        n3 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        n6 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        n9 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        System.out.println("\n\n\n");
		        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
		        System.out.println("     |     |     ");
		        System.out.println("\n");
		        System.out.println(ANSI_BOLD + ANSI_YELLOW_BACKGROUND + "\nJOGADOR 2 VENCEU!" + ANSI_RESET);
		    }
		} else if (n1.equals(n5) && n5.equals(n9)) {
		    resultado = 1;

		    if (n1.equals(ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET)) {
		        n1 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        n5 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        n9 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        System.out.println("\n\n\n");
		        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
		        System.out.println("     |     |     ");
		        System.out.println("\n");
		        System.out.println(ANSI_BOLD + ANSI_GREEN_BACKGROUND + "\nJOGADOR 1 VENCEU!" + ANSI_RESET);
		    } else {
		        n1 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        n5 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        n9 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        System.out.println("\n\n\n");
		        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
		        System.out.println("     |     |     ");
		        System.out.println("\n");
		        System.out.println(ANSI_BOLD + ANSI_YELLOW_BACKGROUND + "\nJOGADOR 2 VENCEU!" + ANSI_RESET);
		    }
		} else if (n3.equals(n5) && n5.equals(n7)) {
		    resultado = 1;

		    if (n3.equals(ANSI_GREEN + ANSI_BOLD + "X" + ANSI_RESET)) {
		        n3 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        n5 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        n7 = ANSI_BOLD + ANSI_RED + "X" + ANSI_RESET;
		        System.out.println("\n\n\n");
		        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
		        System.out.println("     |     |     ");
		        System.out.println("\n");
		        System.out.println(ANSI_BOLD + ANSI_GREEN_BACKGROUND + "\nJOGADOR 1 VENCEU!" + ANSI_RESET);
		    } else {
		        n3 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        n5 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        n7 = ANSI_BOLD + ANSI_RED + "O" + ANSI_RESET;
		        System.out.println("\n\n\n");
		        System.out.println("  " + n1 + "  |  " + n2 + "  |  " + n3 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n4 + "  |  " + n5 + "  |  " + n6 + "   ");
		        System.out.println("_____|_____|_____");
		        System.out.println("  " + n7 + "  |  " + n8 + "  |  " + n9 + "   ");
		        System.out.println("     |     |     ");
		        System.out.println("\n");
		        System.out.println(ANSI_BOLD + ANSI_YELLOW_BACKGROUND + "\nJOGADOR 2 VENCEU!" + ANSI_RESET);
		    }
		}else if(cont == 9){
			resultado = 1;
			System.out.println("\n\n\n");
			System.out.println("  "+n1+"  |  "+n2+"  |  "+n3+"   ");
			System.out.println("_____|_____|_____");
			System.out.println("  "+n4+"  |  "+n5+"  |  "+n6+"   ");
			System.out.println("_____|_____|_____");
			System.out.println("  "+n7+"  |  "+n8+"  |  "+n9+"   ");
			System.out.println("     |     |     ");
			System.out.println("\n");
			System.out.println(ANSI_PURPLE_BACKGROUND+ANSI_BOLD+"\nDEU VELHA!"+ANSI_RESET);
		}
			}
		}
		if(modo == 3) {
			menu=3;
			System.out.println(BOLD + BLUE_LIGHT + "\n\n✧✧✧✧✧✧✧✧ INSTRUÇÃO ✧✧✧✧✧✧✧✧\n" + RESET);
			System.out.println(BLUE_LIGHT+"VOCÊ DEVE DIGITAR O NUMERO DA POSIÇÃO\nONDE VOCÊ QUER COLOCAR O 'X' OU A 'O'.\nBOM JOGO!"+RESET);
			System.out.println(BOLD + BLUE_LIGHT + "\n\n✧✧✧✧✧✧✧✧ INSTRUÇÃO ✧✧✧✧✧✧✧✧\n" + RESET);
			System.out.println(ANSI_LIGHT_YELLOW+BOLD+"\nDigite: '0' para voltar ao menu principal: "+RESET);
			menu = sc.nextInt();
		}
		
		}//Fim do While	
		sc.close();
	}

}
