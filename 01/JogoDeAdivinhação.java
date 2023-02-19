/*
	JogoDeAdivinhação.java
	Juliany Eufásio
	--
	Objetivo: criar um programa de adivinhação simples usando estrutura de repetiçãos
 */

import java.util.Scanner;
import java.util.Random;

public class JogoDeAdivinhação {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner (System.in);
		Random random = new Random();
		
		int option;
		int maxNum;
		int gameRandomNum;
		int userChoise;
		String name;
		
		System.out.println("Ola! Eu sou o Randino, qual o seu nome? ");
		System.out.print("Meu nome é . . ");
		name = scan.nextLine();
		System.out.println("\nPrazer em te conhecer " + name + "! Você quer jogar comigo?");
		System.out.print("Escolha 1 para SIM e 2 para NÃO\nQual sua escolha? ");
		option = scan.nextInt();
		
		while(option != 1 && option != 2){
			System.out.print("\nEssa opção é invalida! Escolha 1 para SIM e 2 para NÃO\nQual sua escolha?");
			option = scan.nextInt();
		}
		
		if(option == 2){
			System.out.println("\nOh, que pena! Talvez outro dia então :/");
		}
		else{
			System.out.println("\nQue bom! Vamos la, o jogo é assim:");
			System.out.println("Você escolhe um numero limite e eu vou gerar um numero aleatorio entre 0 e o numero limite que voce escolher e \nse voce adivinhar o numero que eu escolhi voce ganha!");
			System.out.print("Escolha um numero limite: ");
			maxNum = scan.nextInt();
			
			//gera numero aleatorio
			gameRandomNum = random.nextInt(maxNum + 1);
			
			System.out.println("Okay! agora tente adivinhar um numero entre 0 e " + maxNum + "!");
			
			do{
				userChoise = scan.nextInt();
				
				if(userChoise != gameRandomNum){
					System.out.println("Resposta errada!");
					}
					else{
						System.out.println("Parabens! O numero aleatorio que eu escolhi é " + gameRandomNum + "!!!");
					}
			}while(gameRandomNum != userChoise);
		}
	}
}

