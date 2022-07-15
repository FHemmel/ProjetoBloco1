package br.com.jvsangue;

import java.util.Scanner;

public class Questionario {

	private int genero;
	private int intervalo;
	private int continua;
	private int gravidez;
	private int periodo;
	private int parto;
	private int idade;



	Scanner leia =  new Scanner(System.in);

	public void realizarQuestionario() {
		System.out.println("Qual o seu gênero? \n 1 - Feminino, 2- Masculino, 3- Prefiro não informar. ");
		genero = leia.nextInt();
		if (genero == 1 || genero == 3) {

			questionarioFem();
		}
		else {
			questionarioMasc();
		}
	}

	public void questionarioMasc() {
		System.out.println("Doou sangue nos últimos 2 meses? \n 1- Sim 2- Não ");
		intervalo = leia.nextInt();
		if (intervalo == 2) {
			questionarioPermanente();
		}
		else {
			System.out.println("Para homens o intervalo mínimo para realizar doação de sangue é de 2 meses. Infelizmente você não está apto a realizar a doação."
					+ "Deseja continuar respondendo o questionário? \n 1- Sim 2- Não ");
			continua = leia.nextInt();
			if (continua == 2) {
				//menuiniciar metodo
			}
			questionarioPermanente();
		}

	}

	public void questionarioFem() {

		System.out.println("Você está em período gestacional?  \\n 1- Sim 2- Não");
		gravidez = leia.nextInt();
		if (gravidez == 1) { 
			System.out.println("Você não está apta a realizar a doação devido estar em período gestacional. Deseja continuar respondendo o questionário ?  \n 1- Sim 2- Não");
			continua = leia.nextInt();
			if (continua == 2) {
				//metodo menu inicial
			}
		}
		System.out.println("Você esteve em período gestacional nos últimos 12 meses? \\n 1- Sim 2- Não");
		periodo = leia.nextInt();
		if (periodo == 1) {
			System.out.println("Caso tenha sido parto normal você deve aguardar 90 dias e 180 dias para cesariana e"
					+ "\n caso esteja amamentando deve aguardar 12 meses após o parto para estar apta a realizar a doação, você se enquadra nestes requisitos?"
					+ "\n  1- Sim 2- Não");
			parto = leia.nextInt();		
			if (parto == 1) {
				System.out.println("Infelizmente você não está apta a realizar a doação no momento."
						+ " \n Deseja continuar respondendo? 1 - Sim 2 - Não");
				continua = leia.nextInt();	
				if (continua == 2) {
					//metodo menu iniciar}
				}
			}
		}

		System.out.println("Doou sangue nos últimos 3 meses? \n 1- Sim 2- Não ");
		intervalo = leia.nextInt();
		if (intervalo == 1) {
			System.out.println("Para mulheres o intervalo mínimo para realizar doação de sangue é de 3 meses. Infelizmente você não está apta a realizar a doação."
					+ "Deseja continuar respondendo o questionário? \n 1- Sim 2- Não ");
			continua = leia.nextInt();
			if(continua == 2) {
				//metodo menu iniciar
			}
			questionarioPermanente();
			}
		}


		public void questionarioPermanente() {
			System.out.println("Qual a sua idade? ");
			idade = leia.nextInt();
			

		}
	}
