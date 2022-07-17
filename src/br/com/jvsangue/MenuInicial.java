package br.com.jvsangue;

import java.util.Scanner;

public class MenuInicial {

	public static void menu() {
		
	System.out.println("\n******************************** MENU INICIAL *********************************");
	System.out.println("\n========================  Seja bem vinde ao JvSangue!! "
			 +						 "========================");
	
	Scanner leia = new Scanner(System.in);
	
	int opcao = 0;
		
	System.out.print("\n  Por favor, selecione uma opção: "
			+ "\n1) Login: \n"
			+ "2) Criar conta: \n"
			);
	System.out.print("Opção selecionada: ");
	
	opcao = leia.nextInt();
	
	if(opcao == 1) {
		
		Login.login();
		
	}else if(opcao == 2) {
		
		Cadastro.cadastrando();
	}
	 
	leia.close();
	}

}

