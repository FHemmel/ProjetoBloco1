package br.com.jvsangue;

import java.util.Scanner;

public class Questionario {

	private int genero;
	private int intervalo;
	private int continua;
	private int gravidez;


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
		if (intervalo == 1) {
			questionarioPermanente();
		}
		else {
			System.out.println("Para homens o intervalo mínimo para realizar doação de sangue é de 2 meses. Infelizmente você não está apto a realizar a doação."
					+ "Deseja continuar respondendo o questionário? \n 1- Sim 2- Não ");
			continua = leia.nextInt();
			if (continua == 1) {
				questionarioPermanente();
			}
			else {
				//MenuInicial.menu(); Colocar método menu inicial.
			}
		}

	}

	public void questionarioFem() {
		System.out.println("Doou sangue nos últimos 3 meses? \n 1- Sim 2- Não ");
		intervalo = leia.nextInt();
		if (intervalo == 1) {
			questionarioPermanente();
		}
		else {
			System.out.println("Para mulheres o intervalo mínimo para realizar doação de sangue é de 3 meses. Infelizmente você não está apta a realizar a doação."
					+ "Deseja continuar respondendo o questionário? \n 1- Sim 2- Não ");
			continua = leia.nextInt();
			if (continua == 1) {
				System.out.println("Está em período gestacional? \n 1- Sim 2- Não ");
				gravidez = leia.nextInt();
				if (gravidez == 1) {
					System.out.println("Você não está apta a realizar a doação. Devido a estar em período gestacional.");
				}
			}
			else {
				//MenuInicial.menu(); Colocar método menu inicial.

			}
		}
		}
		public void questionarioPermanente() {

		}
	}
