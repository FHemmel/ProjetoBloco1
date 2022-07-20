package br.com.jvsangue;

import java.util.Scanner;

public class Cadastro {
	
	Usuario usu = new Usuario(null, 0, 0, 0, null, 0, null, null);

	public void cadastrando() {

		Scanner leia = new Scanner(System.in);

		System.out.println("\n============================= PREENCHA O CADASTRO =============================\n");

		System.out.println("Digite seu nome completo: ");
		usu.setNome(leia.nextLine());
		
		System.out.println("Digite sua idade: ");
		usu.setIdade(leia.nextInt());
		
		System.out.print("Digite seu CPF: ");
		usu.setCpf(leia.nextLong());
		
		System.out.println("Selecione seu g�nero: ");
		System.out.println("1) Feminino");
		System.out.println("2) Masculino");
		System.out.println("3) Outros / Prefiro n�o informar");
		usu.setGenero(leia.nextInt());
		
		System.out.print("Digite seu endere�o: ");
		usu.setEndereco(leia.next());
		
		System.out.println("Selecione sua regi�o: ");
		System.out.println("1) Regi�o Norte");
		System.out.println("2) Regi�o Sul");
		System.out.println("3) Regi�o Leste");
		System.out.println("4) Regi�o Oeste");
		System.out.println("5) Regi�o Central");
		System.out.println("6) N�o sei minha regi�o\n");
		usu.setRegiao(leia.nextInt());
		
		System.out.print("Digite seu usu�rio: ");
		usu.setUsuario(leia.next());
		
		System.out.print("Digite sua senha: ");
		usu.setSenha(leia.next());

		System.out.println(usu.getNome());
		System.out.println(usu.getIdade());
		System.out.println(usu.getCpf());
		System.out.println(usu.getGenero());
		System.out.println(usu.getEndereco());
		System.out.println(usu.getRegiao());
		System.out.println(usu.getUsuario());
		System.out.println(usu.getSenha());
		System.out.println("======================== CADASTRO EFETUADO COM SUCESSO! =======================");
		System.out.println("\n================================ FA�A O LOGIN =================================");
		
		login();
		leia.close();
	}
				
		public void login() {

			String user = usu.getUsuario();
			String senha = usu.getSenha();
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
					Estatisticas est = new Estatisticas();
					est.mostraEstatistica();
				}

			}else 
				System.out.println("Usu�rio ou senha incorreta!");


			leia.close();
		}	
	}

