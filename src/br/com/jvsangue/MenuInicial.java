package br.com.jvsangue;

import java.util.Scanner;

public class MenuInicial {

	public void menu() {

		System.out.println("\n******************************** MENU INICIAL *********************************");
		System.out.println("\n========================  Seja bem-vinde ao JVSangue!! "
				+						 "========================");

		Scanner leia = new Scanner(System.in);

		int opcao = 0;

		System.out.print("\nPor favor, selecione uma opção: "
				+ "\n1) Login: \n"
				+ "2) Criar conta: \n"
				);
		System.out.print("Opção selecionada: ");

		opcao = leia.nextInt();

		if(opcao == 1) {
			
			Cadastro cad = new Cadastro();
			cad.login();

		}else if(opcao == 2) {
			
			Cadastro cad = new Cadastro();
			cad.cadastrando();
		}

		leia.close();
	}

}

