package br.com.jvsangue;

import java.util.Scanner;

public class Questionario extends Cadastro{

	private int genero;
	private int intervalo;
	private int continua;
	private int gravidez;
	private int periodo;
	private int parto;
	private int idade;
	private int doouAnteriormente;
	private double peso;
	private int doencasPermanentes;
	private int p1,p2,p3,p4,p5,p7,ret;
	



	Scanner leia =  new Scanner(System.in);
	
	Usuario usu = new Usuario();

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

				MenuInicial.menu();
			}
			questionarioPermanente();
		}

	}

	public void questionarioFem() {

		System.out.println("Você está em período gestacional?  \n 1- Sim 2- Não");
		gravidez = leia.nextInt();
		if (gravidez == 1) { 
			System.out.println("Você não está apta a realizar a doação devido estar em período gestacional. Deseja continuar respondendo o questionário ?  \n 1- Sim 2- Não");
			continua = leia.nextInt();
			if (continua == 2) {

				MenuInicial.menu();
			}
		}
		System.out.println("Você esteve em período gestacional nos últimos 12 meses? \n 1- Sim 2- Não");
		periodo = leia.nextInt();
		if (periodo == 1) {
			System.out.println("Caso tenha sido parto normal você deve aguardar 90 dias e 180 dias para cesariana e"
					+ "\n caso esteja amamentando deve aguardar 12 meses após o parto para estar apta a realizar a doação, você se enquadra nestes requisitos?"
					+ "\n  1- Sim 2- Não");
			parto = leia.nextInt();		
			if (parto == 1) {
				System.out.println("Infelizmente você n�o está apta a realizar a doação no momento."
						+ " \n Deseja continuar respondendo? 1 - Sim 2 - Não");
				continua = leia.nextInt();	
					if (continua == 2) {

					MenuInicial.menu();
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

				MenuInicial.menu();
				
			}
		}
		questionarioPermanente();
	}


	public void questionarioPermanente() {
		System.out.println("Qual a sua idade? ");
		idade = leia.nextInt();
		if (idade < 16 && idade > 69 ) {
			System.out.println("A faixa de idade apta a realizar a doação é de 16 a 69 anos. Infelizmente você não está apte a realizar a doação.");

			MenuInicial.menu();
		}
		if (idade >= 60 && idade <= 69) {
			System.out.println("Você já doou sangue anteriormente? \n 1 - Sim 2 - Não");	
			doouAnteriormente = leia.nextInt();
			if(doouAnteriormente == 2) {
				System.out.println("Infelizmente você não esté apte a realizar a doação. ");
				
				MenuInicial.menu();
			}
		}
		System.out.println("Qual o seu peso? ");
		peso = leia.nextDouble();
		if (peso < 50) {
			System.out.println("Para realizar a doação precisa ter 50kg ou mais. Infelizmente você não está apte a realizar a doação.");
			
			MenuInicial.menu();
		}
		System.out.println("Você teve hepatite após os 11 anos ou evidência das seguintes doenças hepatite B e C, AIDS doenças associadas ao vírus HTLV I e II e Doença de chagas?"
				+ "\n Fez uso de drogas ilícitas injetáveis? \n Teve malária? \n Tem piercing em cavidade oral ou região genital?"
				+ "\n Caso afirmativo para qualquer uma das perguntas acima digite 1. ");
		doencasPermanentes = leia.nextInt();		
		if (doencasPermanentes == 1) {
			System.out.println("Infelizmente você não poderá realizar a doação de sangue.");
		}
		questionarioTemporario();
	}
	public void questionarioTemporario() {
		p1();
		p2();
		p3();
		p4();
		p5();
		p7();
		resultado();
	}
	
	public void p1() {
		System.out.println("Você precisou de transfusão de sangue ou foi exposto a situações de risco acrescido para infecções sexualmente transmissíveis ou Você fez tatuagem e/ou piercing nos últimos 12 meses? \n 1 - Sim \n2 - Não");
		p1=leia.nextInt();
		}
	public void p2() {
		System.out.println("Você teve alguma dessas doenças nos últimos 6 meses: Colecistectomia, histerectomia, nefrectomia, redução de fraturas, politraumatismos sem seqüelas graves, tireoidectomia, colectomia ou Passou por exames ou procedimentos que houve a utilização de endoscópio ? \n 1 - Sim \n2 - Não");
		p2=leia.nextInt();
		
	}
	public void p3() {
		System.out.println("Você teve alguma dessas doenças nos últimos 3 meses:  apendicite, hérnia, amigdalectomia, varizes? \n 1 - Sim \n2 - Não ");
		p3=leia.nextInt();
		
	}
	public void p4() {
		System.out.println("Teve Gripe, resfriado e febre nos últimos 7 dias?\n 1 - Sim \n2 - Não");
		p4=leia.nextInt();
	}
	public void p5() {
		System.out.println("Você fez Extração dentária nas últimas 72 horas? \n 1 - Sim \n2 - Não");
		p5=leia.nextInt();
	}
	public void p7() {
		System.out.println("Tomou vacina nos últimos 7 dias? \n 1 - Sim \n2 - Não");
		p7=leia.nextInt();
	}
	public void resultado() {
		System.out.println("================================================================");
		System.out.println("=                          RESULTADOS                          =");
		System.out.println("================================================================");
		System.out.println("Nome: "+ usu.getNome() + "| Idade: "+idade+"| Gênero: "+genero+"| Peso: "+peso+"kg");
		avisos();
		
	}
	
	public void avisos() {
		if(p1==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde o periodo de 12 meses se completar para poder realizar sua doação");
		}
		if(p2==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde o periodo de 6 meses se completar para poder realizar sua doação");
		}
		if(p3==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde o periodo de 3 meses se completar para para poder realizar sua doação");
		}
		if(p4==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde o periodo de 7 dias se completar para para poder realizar sua doação");
		}
		if(p5==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde o periodo de 72 horas se completar para para poder realizar sua doação");
		}
		if(p7==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde o periodo de 7 dias se completar para para poder realizar sua doação");
		}
		if(p1==2 && p2==2 && p3==2 && p4==2 && p5==2 && p7==2) {
			System.out.println("PARABÉNS VOCÊ ESTÁ APTX PARA FAZER A DOAÇÃO DE SANGUE");
		}
		Regiao();
	}
	public void Regiao() {
		System.out.println("================================================================");
		System.out.println("=                      PONTOS DE DOAÇÃO                        =");
		System.out.println("================================================================");
		if(usu.getRegiao() ==1) {
			System.out.println("O hospital mais próximo de você para doação é :\n Hemocentro da Santa Casa de São Paulo- R. Marquês de Itu, 579 \n Banco de Sangue de São Paulo - R. Dr. Tomás Carvalhal, 711 \n Hospital das Clínicas da Universidade de São Paulo- Av. Dr. Enéas Carvalho de Aguiar, 155 ");
		}
		if(usu.getRegiao()==2) {
			System.out.println("O hospital mais próximo de você para doação é :\n Conjunto Hospitalar do Mandaqui - R. Voluntários da Pátria, 4227 \n ");
		}
		if(usu.getRegiao()==3) {
			System.out.println("O hospital mais próximo de você para doação é :\n Hospital Regional Dr Vivaldo Martins Simões-R. Ari Barroso, 355 \n Hospital Central Sorocabana - R. Faustolo, 1633 ");
		}
		if(usu.getRegiao()==4) {
			System.out.println("O hospital mais próximo de você para doação é : \n Hemocentro HSP Unifesp -R. Dr. Diogo de Faria, 824 \n Banco de Sangue de São Paulo e Serviços de Hemoterapia- R. Dr. Alceu de Campos Rodrigues, 95 \n Banco de Sangue Paulista- R. Iguatinga, 382/386 \n Banco de Sangue - Unidade Einstein Morumbi - Av. Albert Einstein, 627 ");
		}
		if(usu.getRegiao()==5) {
			System.out.println("O hospital mais próximo de você para doação é : \n Hospital Santa Marcelina -R. Harry Dannenberg ,473 \n Hospital Municipal do Tatuapé - Av. Celso Garcia, 4815 \n Hospital Municipal Professor Doutor Alípio Corrêa Netto- Alameda Rodrigo de Brum, 1989 ");
		}
		System.out.println("Deseja retornar ao menu?\n 1 - Sim \n2 - Não");
		ret=leia.nextInt();
		if(ret==1) {
			
			MenuInicial.menu();
		}
		else {
			System.out.println("Saindo do programa................");
		}
		
	}
}
