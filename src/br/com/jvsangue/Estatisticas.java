package br.com.jvsangue;

import java.util.Scanner;

public class Estatisticas extends BancoEstatisticas {
	
	public static void mostraEstatistica() {
		
		Scanner input = new Scanner(System.in);
		
		mostraEstGerais();
		
		input.close();
	}
}
