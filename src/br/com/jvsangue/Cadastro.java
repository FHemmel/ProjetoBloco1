package br.com.jvsangue;

import java.util.Scanner;

public class Cadastro extends Usuario {
	
	static void cadastrando() {
		
		Scanner leia = new Scanner(System.in);
		
		Usuario usu = new Usuario();
		
		System.out.println("\n============================= PREENCHA O CADASTRO =============================\n");
		
		System.out.print("Digite seu nome completo: ");
		usu.setNome(leia.nextLine());
		
		
		System.out.print("\nDigite seu CPF: ");
		usu.setCpf(leia.nextLong());
		
		System.out.print("\nDigite seu endereço: ");
		usu.setEndereco(leia.next());
		
		System.out.println("======================== CADASTRO EFETUADO COM SUCESSO! ========================");
		System.out.println("\n================================ FAÇA O LOGIN ==================================");
		Login.login();
		
			leia.close();	
		}
	}

