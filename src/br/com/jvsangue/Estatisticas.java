package br.com.jvsangue;

import java.util.Scanner;

public class Estatisticas extends BancoEstatisticas {
	
	Cadastro usu;
	
	public Estatisticas(Cadastro usu) {
		super();
		this.usu = usu;
	}


	public static void mostraEstatistica(String nome) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("========================================================");
		System.out.println("==ESTATÃ�STICAS GERAIS SOBRE DOAÃ‡ÃƒO DE SANGUE NO BRASIL==");
		System.out.println("========================================================");
		System.out.println();
		System.out.println("OlÃ¡, " + nome + "! Aqui estÃ£o algumas estatÃ­sticas sobre doaÃ§Ã£o de sangue."
                + "\nAo final vocÃª terÃ¡ a opÃ§Ã£o de saber mais sobre seu tipo sanguÃ­neo. Vamos lÃ¡? ");
		
		System.out.println();
		
		mostraEstGerais();
		
		System.out.println();
		System.out.println("Agora vamos ver alguns dados sobre o seu sangue."
                + "\nPrimeiro, me diga qual seu tipo sanguÃ­neo: ");
		
		System.out.println("(1) A+");
		System.out.println("(2) A-");
		System.out.println("(3) B+");
		System.out.println("(4) B-");
		System.out.println("(5) AB+");
		System.out.println("(6) AB-");
		System.out.println("(7) O+");
		System.out.println("(8) O-");
		System.out.println("(9) NÃ£o sei");
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
			System.out.println("Veja como vocÃª pode descobrir seu tipo sanguÃ­neo de duas formas diferentes:"
                    + "\n1) FaÃ§a um exame de sangue comum e peÃ§a para descobrir seu tipo sanguÃ­neo;"
                    + "\n2) Responda nosso questionÃ¡rio para descobrir se vocÃª estÃ¡ apto a dor sangue,"
                    + "\npois ao doar vocÃª ficarÃ¡ sabendo qual seu tipo e ainda ganha um cartÃ£o de doador!");
		}
		
		System.out.println();
		System.out.println("Deseja retornar ao menu principal?");
		System.out.println("(1) Sim");
		System.out.println("(2) NÃ£o");
		char opcao2 = input.next().charAt(0);
		
		switch (opcao2) {
		case '1':
			MenuInicial.menu();
			break;
		case '2':
			System.out.println("VocÃª saiu do programa.");
			System.exit(0);
			break;
		}
		input.close();
	}
}
