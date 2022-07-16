package br.com.jvsangue;

import java.util.Scanner;

public class Login {

	static void login() {

		String user = "admin";
		String senha = "admin";
		int opcao = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite seu usuário: ");
		user = leia.next(user);


		System.out.println("Digite sua senha: ");
		senha = leia.next(senha);

		if(user.equals(user) && senha.equals(senha)) {

			System.out.println("=========================  Login efetuado com sucesso =========================");
			System.out.println("\n  Por favor, selecione uma opção:\n"
					+ "1) Começar questionário \n"
					+ "2) Ver estatísticas\n"
					);
			System.out.print("Opção selecionada: ");
			opcao = leia.nextInt();

			if(opcao == 1) {
				//  Colocar metodo para ir ao questionário
			}else if (opcao == 2){
				// Colocar metodo para ir à estatisticas
			}

		}else 
			System.out.println("Usuário ou senha incorreta!");


		leia.close();
	}

}
