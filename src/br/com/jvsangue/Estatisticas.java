package br.com.jvsangue;

import java.util.Scanner;

public class Estatisticas extends BancoEstatisticas {


	public void mostraEstatistica() {

		Scanner input = new Scanner(System.in);

		System.out.println("\n================================ ESTATÍSTICAS =================================\n");
		System.out.println();
		System.out.println("Olá, " + "Amanda" + "! Aqui estão algumas estatísticas sobre doação de sangue."
				+ "\nAo final você terá a opção de saber mais sobre seu tipo sanguíneo. Vamos lá? ");

		mostraEstGerais();

		System.out.println();
		System.out.println("Agora vamos ver alguns dados sobre o seu sangue."
				+ "\nPrimeiro, me diga qual seu tipo sanguíneo: ");

		System.out.println("1) A+");
		System.out.println("2) A-");
		System.out.println("3) B+");
		System.out.println("4) B-");
		System.out.println("5) AB+");
		System.out.println("6) AB-");
		System.out.println("7) O+");
		System.out.println("8) O-");
		System.out.println("9) Não sei");
		char opcao1 = input.next().charAt(0);

		switch(opcao1) {
		case '1':
			mostraAPositivo();
			break;
		case '2':
			mostraANegativo();
			break;
		case '3':
			mostraBPositivo();
			break;
		case '4':
			mostraBNegativo();
			break;
		case '5':
			mostraABPositivo();
			break;
		case '6':
			mostraABNegativo();
			break;
		case '7':
			mostraOPositivo();
			break;
		case '8':
			mostraONegativo();
			break;
		case '9':
			System.out.println("Veja como você pode descobrir seu tipo sanguíneo de duas formas diferentes:"
					+ "\n1) Faça um exame de sangue comum e peça para descobrir seu tipo sanguíneo;"
					+ "\n2) Responda nosso questionário para descobrir se você está apto a dor sangue,"
					+ "\npois ao doar você ficará sabendo qual seu tipo e ainda ganha um cartão de doador!");
		}

		System.out.println();
		System.out.println("Deseja retornar ao menu principal?");
		System.out.println("1) Sim");
		System.out.println("2) Não");
		char opcao2 = input.next().charAt(0);

		switch (opcao2) {
		case '1':
			MenuInicial menu = new MenuInicial();
			menu.menu();
			break;
		case '2':
			System.out.println("Você saiu do programa.");
			System.exit(0);
			break;
		}
		input.close();
	}
}
