package br.com.jvsangue;

import java.util.Scanner;

public class Cadastro {
	
	static void cadastrando() {
		
		Scanner leia = new Scanner(System.in);
		
		Usuario usu = new Usuario();
		
		System.out.println("\n============================= PREENCHA O CADASTRO =============================\n");
		
		System.out.print("Digite seu nome completo: ");
		usu.setNome(leia.nextLine());
		
		System.out.print("\nDigite sua idade: ");
		usu.setIdade(leia.nextInt());
		
		System.out.print("\nDigite seu CPF: ");
		usu.setCpf(leia.nextLong());
				
		System.out.print("\nDigite seu endere�o: ");
		usu.setEndereco(leia.next());
				
		System.out.print("\nDigite a regi�o onde mora: ");
		usu.setRegiao(leia.next());
		
	leia.close();	
	}

}
