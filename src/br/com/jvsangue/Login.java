package br.com.jvsangue;

import java.util.Scanner;

public class Login {

	public static void login() {

		String user = "Amanda";
		String senha = "admin";
		int opcao = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite seu usu�rio: ");
		user = leia.next(user);


		System.out.println("Digite sua senha: ");
		senha = leia.next(senha);

		if(user.equals(user) && senha.equals(senha)) {

			System.out.println("=========================  LOGIN EFETUADO COM SUCESSO =========================");
			System.out.println("\nPor favor, selecione uma op��o:\n"
					+ "1) Come�ar question�rio \n"
					+ "2) Ver estat�sticas\n");

			System.out.print("Op��o selecionada: ");
			opcao = leia.nextInt();

			if(opcao == 1) {
				Questionario questionario = new Questionario();
				questionario.realizarQuestionario();

			}else if (opcao == 2){
				Estatisticas.mostraEstatistica(user);
			}

		}else 
			System.out.println("Usu�rio ou senha incorreta!");


		leia.close();
	}

}
