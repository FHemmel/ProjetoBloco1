package br.com.jvsangue;

import java.util.Scanner;

public class Cadastro {
	
	static void cadastrando() {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao = 0;
		
		Usuario usu = new Usuario();
		
		System.out.println("\n============================= PREENCHA O CADASTRO =============================\n");
		
		System.out.print("Digite seu nome completo: ");
		usu.setNome(leia.nextLine());
		
		System.out.print("\nDigite sua idade: ");
		usu.setIdade(leia.nextInt());
		
		System.out.print("\nDigite seu CPF: ");
		usu.setCpf(leia.nextLong());
		
		System.out.print("\nDigite seu endereço: ");
		usu.setEndereco(leia.next());
				
		System.out.println("\n  Selecione a opção correspondente ao seu gênero: \n"
				+ "1) Feminino \n"
				+ "2) Masculino \n");
		System.out.print("Opção selecionada: ");
		opcao = leia.nextInt();		
	
		if (opcao == 1) {
			System.out.println("======================== CADASTRO EFETUADO COM SUCESSO! ========================");
			System.out.println("\n================================ FAÇA O LOGIN ==================================");
			Login.login();
		}else if (opcao == 2) {
			System.out.println("============================= CADASTRO EFETUADO COM SUCESSO! =============================");
			System.out.println("\n============================= FAÇA O LOGIN ==============================");
			Login.login();
		}
		
	leia.close();	
	}

}
