package br.com.jvsangue;

import java.util.Scanner;

public class Login {

	public static void login() {

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
					+ "2) Ver estatísticas\n");
			
			System.out.print("Opção selecionada: ");
			opcao = leia.nextInt();

			if(opcao == 1) {
				Questionario questionario = new Questionario();
				questionario.realizarQuestionario();
				
			}else if (opcao == 2){
				Estatisticas.mostraEstatistica(user);
			}

		}else 
			System.out.println("Usuário ou senha incorreta!");


		leia.close();
	}

}
