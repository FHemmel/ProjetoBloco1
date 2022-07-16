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
	private int doouAnteriormente;
	private double peso;
	private int doencasPermanentes;
	private int p1,p2,p3,p4,p5,p7,ret;
	



	Scanner leia =  new Scanner(System.in);

	public void realizarQuestionario() {
		System.out.println("Qual o seu g�nero? \n 1 - Feminino, 2- Masculino, 3- Prefiro n�o informar. ");
		genero = leia.nextInt();
		if (genero == 1 || genero == 3) {

			questionarioFem();
		}
		else {
			questionarioMasc();
		}
	}

	public void questionarioMasc() {
		System.out.println("Doou sangue nos �ltimos 2 meses? \n 1- Sim 2- N�o ");
		intervalo = leia.nextInt();
		if (intervalo == 2) {
			questionarioPermanente();
		}
		else {
			System.out.println("Para homens o intervalo m�nimo para realizar doa��o de sangue � de 2 meses. Infelizmente voc� n�o est� apto a realizar a doa��o."
					+ "Deseja continuar respondendo o question�rio? \n 1- Sim 2- N�o ");
			continua = leia.nextInt();
			if (continua == 2) {

				MenuInicial.menu();
			}
			questionarioPermanente();
		}

	}

	public void questionarioFem() {

		System.out.println("Voc� est� em per�odo gestacional?  \\n 1- Sim 2- N�o");
		gravidez = leia.nextInt();
		if (gravidez == 1) { 
			System.out.println("Voc� n�o est� apta a realizar a doa��o devido estar em per�odo gestacional. Deseja continuar respondendo o question�rio ?  \n 1- Sim 2- N�o");
			continua = leia.nextInt();
			if (continua == 2) {

				MenuInicial.menu();
			}
		}
		System.out.println("Voc� esteve em per�odo gestacional nos �ltimos 12 meses? \\n 1- Sim 2- N�o");
		periodo = leia.nextInt();
		if (periodo == 1) {
			System.out.println("Caso tenha sido parto normal voc� deve aguardar 90 dias e 180 dias para cesariana e"
					+ "\n caso esteja amamentando deve aguardar 12 meses ap�s o parto para estar apta a realizar a doa��o, voc� se enquadra nestes requisitos?"
					+ "\n  1- Sim 2- N�o");
			parto = leia.nextInt();		
			if (parto == 1) {
				System.out.println("Infelizmente voc� n�o est� apta a realizar a doa��o no momento."
						+ " \n Deseja continuar respondendo? 1 - Sim 2 - N�o");
				continua = leia.nextInt();	
				if (continua == 2) {

					MenuInicial.menu();
				}
			}
		}

		System.out.println("Doou sangue nos �ltimos 3 meses? \n 1- Sim 2- N�o ");
		intervalo = leia.nextInt();
		if (intervalo == 1) {
			System.out.println("Para mulheres o intervalo m�nimo para realizar doa��o de sangue � de 3 meses. Infelizmente voc� n�o est� apta a realizar a doa��o."
					+ "Deseja continuar respondendo o question�rio? \n 1- Sim 2- N�o ");
			continua = leia.nextInt();
			if(continua == 2) {

				MenuInicial.menu();
			}
			questionarioPermanente();
		}
	}


	public void questionarioPermanente() {
		System.out.println("Qual a sua idade? ");
		idade = leia.nextInt();
		if (idade < 16 && idade > 69 ) {
			System.out.println("A faixa de idade apta a realizar a doa��o � de 16 a 69 anos. Infelizmente voc� n�o est� apte a realizar a doa��o.");

			MenuInicial.menu();
		}
		if (idade >= 60 && idade <= 69) {
			System.out.println("Voc� j� doou sangue anteriormente? \n 1 - Sim 2 - N�o");	
			doouAnteriormente = leia.nextInt();
			if(doouAnteriormente == 2) {
				System.out.println("Infelizmente voc� n�o est� apte a realizar a doa��o. ");
				
				MenuInicial.menu();
			}
		}
		System.out.println("Qual o seu peso? ");
		peso = leia.nextDouble();
		if (peso < 50) {
			System.out.println("Para realizar a doa��o precisa ter 50kg ou mais. Infelizmente voc� n�o est� apte a realizar a doa��o.");
			
			MenuInicial.menu();
		}
		System.out.println("Voc� teve hepatite ap�s os 11 anos ou evid�ncia das seguintes doen�as hepatite B e C, AIDS doen�as associadas ao v�rus HTLV I e II e Doen�a de chagas?"
				+ "\n Fez uso de drogas il�citas injet�veis? \n Teve mal�ria? \n Tem piercing em cavidade oral ou regi�o genital?"
				+ "\n Caso afirmativo para qualquer uma das perguntas acima digite 1. ");
		doencasPermanentes = leia.nextInt();		
		if (doencasPermanentes == 1) {
			System.out.println("Infelizmente voc� n�o poder� realizar a doa��o de sangue.");
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
		System.out.println("Você precisou de transfusão de sangue ou foi exposto a situações de risco acrescido para infecções sexualmente transmissíveis ou Você fez tatuagem e/ou piercing nos últimos 12 meses? \n 1 - Sim \n2 - N�o");
		p1=leia.nextInt();
		}
	public void p2() {
		System.out.println("Você teve alguma dessas doenças nos últimos 6 meses: Colecistectomia, histerectomia, nefrectomia, redução de fraturas, politraumatismos sem seqüelas graves, tireoidectomia, colectomia ou Passou por exames ou procedimentos que houve a utilização de endoscópio ? \n 1 - Sim \n2 - N�o");
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
		System.out.println("Nome: "+ usu.getNome + "| Idade: "+idade+"| Gênero: "+genero+"| Peso: "+peso+"kg");
		avisos();
		
	}
	
	public void avisos() {
		if(p1==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde x para poder realizar sua doação");
		}
		if(p2==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde x para poder realizar sua doação");
		}
		if(p3==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde x para poder realizar sua doação");
		}
		if(p4==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde x para poder realizar sua doação");
		}
		if(p5==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde x para poder realizar sua doação");
		}
		if(p7==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde x para poder realizar sua doação");
		}
		if(p1==2 && p2==2 && p3==2 && p4==2 && p5==2 && p7==2) {
			System.out.println("PARABÉNS VOCÊ ESTÁ APTX PARA FAZER A DOAÇÃO DE SANGUE");
			regiao();
		}
	}
	public void Regiao() {
		System.out.println("================================================================");
		System.out.println("=                      PONTOS DE DOAÇÃO                        =");
		System.out.println("================================================================");
		if(regiao==1) {
			System.out.println("O hospital mais próximo de você para doação é o X");
		}
		if(regiao==2) {
			System.out.println("O hospital mais próximo de você para doação é o X");
		}
		if(regiao==3) {
			System.out.println("O hospital mais próximo de você para doação é o X");
		}
		if(regiao==4) {
			System.out.println("O hospital mais próximo de você para doação é o X");
		}
		if(Regiao==5) {
			System.out.println("O hospital mais próximo de você para doação é o X");
		}
		System.out.println("Deseja retornar ao menu?\n 1 - Sim \n2 - Não");
		ret=leia.nextInt();
		if(ret==1) {
			
			MenuInicial.menu();
		}
		else {
			System.out.println("Saindo do programa................");
			break;
		}
		
	}
}
