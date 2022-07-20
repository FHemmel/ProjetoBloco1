package br.com.jvsangue;

import java.util.Scanner;

public class Questionario extends Cadastro{

	private int genero, drogas, intervalo, continua, gravidez, periodo, parto, idade, doouAnteriormente, doencasPermanentes;
	private double peso;
	private int p1,p2,p3,p4,p5,p7,ret;

	Scanner leia =  new Scanner(System.in);

	// Início
	public void realizarQuestionario() {
		System.out.println("Qual o seu gênero? \n 1) Feminino, 2) Masculino, 3) Prefiro não informar. ");
		genero = leia.nextInt();
		if (genero == 1 || genero == 3) {

			questionarioFem();
		}
		else {
			questionarioMasc();
		}
	}
	
	// Questionário para gênero masculino
	public void questionarioMasc() {
		System.out.println("Doou sangue nos últimos 2 meses? \n 1) Sim 2) Não ");
		intervalo = leia.nextInt();
		if (intervalo == 2) {
			questionarioPermanente();
		}
		else {
			System.out.println("Para homens o intervalo mínimo para realizar doação de sangue é de 2 meses.\n "
					+ "Infelizmente você não está apto a realizar a doação."
					+ "\nDeseja continuar respondendo o questionário? \n 1) Sim 2) Não ");
			continua = leia.nextInt();
			if (continua == 2) {

				MenuInicial menu = new MenuInicial();
				menu.menu();
			}
			questionarioPermanente();
		}
	}

	// Questionário para gênero feminino
	public void questionarioFem() {

		System.out.println("Você está em período gestacional?  \n 1) Sim 2) Não");
		gravidez = leia.nextInt();
		if (gravidez == 1) { 
			System.out.println("Você não está apta a realizar a doação devido estar em período gestacional."
					+ "\n Deseja continuar respondendo o questionário ?  \n 1) Sim 2) Não");
			continua = leia.nextInt();
			if (continua == 2) {
				
				MenuInicial menu = new MenuInicial();
				menu.menu();
			}
		}
		System.out.println("Você esteve em período gestacional nos últimos 12 meses? \n 1) Sim 2) Não");
		periodo = leia.nextInt();
		if (periodo == 1) {
			System.out.println("Caso você tenha tido parto normal deve aguardar 90 dias, \n"
					+ "caso você tenha tido parto cesariana deve aguardar 180 dias para doar."
					+ "\nCaso esteja amamentando deve aguardar 12 meses após o parto para estar apta a realizar a doação. "
					+ "\nVocê se enquadra nestes requisitos?"
					+ "\n 1) Sim 2) Não");
			parto = leia.nextInt();		
			if (parto == 1) {
				System.out.println("Infelizmente você não está apta a realizar a doação no momento."
						+ " \nDeseja continuar respondendo? 1) Sim 2) Não");
				continua = leia.nextInt();	
				if (continua == 2) {
					
					MenuInicial menu = new MenuInicial();
					menu.menu();
				}
			}
		}

		System.out.println("Doou sangue nos últimos 3 meses? \n 1) Sim 2) Não ");
		intervalo = leia.nextInt();
		if (intervalo == 1) {
			System.out.println("Para mulheres o intervalo mínimo para realizar doação de sangue são de 3 meses. "
					+ "\nInfelizmente você não está apta a realizar a doação."
					+ "\nDeseja continuar respondendo o questionário? \n 1) Sim 2) Não ");
			continua = leia.nextInt();
			if(continua == 2) {
				
				MenuInicial menu = new MenuInicial();
				menu.menu();

			}
		}
		
		questionarioPermanente();
	}

	// Questionário com impedimentos permanentes
	public void questionarioPermanente() {
		System.out.println("Qual a sua idade? ");
		idade = leia.nextInt();
		if (idade < 16 || idade > 69 ){
			System.out.println("A faixa de idade apta a realizar a doação é de 16 a 69 anos. "
					+ "\nInfelizmente você não está apte a realizar a doação.");
			MenuInicial menu = new MenuInicial();
			menu.menu();
		}
		else if (idade>=60 && idade<=69) {
			System.out.println("Você já doou sangue anteriormente? \n 1) Sim 2) Não");	
			doouAnteriormente = leia.nextInt();
			if(doouAnteriormente == 2) {
				System.out.println("Infelizmente você não está apte a realizar a doação. ");
				MenuInicial menu = new MenuInicial();
				menu.menu();
			}
		}
		System.out.println("Qual o seu peso? ");
		peso = leia.nextDouble();
		if (peso < 50.0) {
			System.out.println("Para realizar a doação precisa ter 50kg ou mais. "
					+ "\nInfelizmente você não está apte a realizar a doação.");
			MenuInicial menu = new MenuInicial();
			menu.menu();
		}
		System.out.println("Você teve alguma dessas doenças listadas abaixo:"
				+ "\nHepatite após os 11 anos "
				+ "\nEvidência de hepatite B e C"
				+ "\nAIDS ou doenças associadas ao vírus HTLV I e II "
				+ "\nDoença de chagas"
				+  "\nMalária"
				+ "\nCaso afirmativo para qualquer uma das perguntas acima digite 1, caso não digite 2. ");
		doencasPermanentes = leia.nextInt();		
		if (doencasPermanentes == 1) {
			System.out.println("Infelizmente você não poderá realizar a doação de sangue.");
			MenuInicial menu = new MenuInicial();
			menu.menu();
		}
		System.out.println("Você já fez uso de drogas ilícitas injetáveis? ou "
				+ " \nTem piercing em cavidade oral ou região genital? "
				+ "\nCaso afirmativo para qualquer uma das perguntas acima digite 1, caso não digite 2.");
		drogas = leia.nextInt();
		if (drogas == 1) {
			System.out.println("Infelizmente você não poderá realizar a doação de sangue.");
			MenuInicial menu = new MenuInicial();
			menu.menu();
		}
		questionarioTemporario();
	}

	// Questionário de impedimentos temporários
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
		System.out.println("Você precisou de transfusão de sangue ou foi exposto a situações de risco "
				+ "acrescido para infecções \nsexualmente transmissíveis ou você fez tatuagem e/ou piercing nos últimos 12 meses? "
				+ "\n 1) Sim 2) Não");
		p1=leia.nextInt();
	}
	public void p2() {
		System.out.println("Você teve alguma dessas doenças nos últimos 6 meses: Colecistectomia, histerectomia, "
				+ "\nnefrectomia, redução de fraturas, politraumatismos sem sequelas graves, tireoidectomia, "
				+ "\ncolectomia ou passou por exames ou procedimentos que houve a utilização de endoscópio? "
				+ "\n 1) Sim 2) Não");
		p2=leia.nextInt();

	}
	public void p3() {
		System.out.println("Você teve alguma dessas doenças nos últimos 3 meses:  apendicite, hérnia, amigdalectomia, "
				+ "varizes? \n 1) Sim 2) Não");
		p3=leia.nextInt();

	}
	public void p4() {
		System.out.println("Teve gripe, resfriado e febre nos últimos 7 dias? \n 1) Sim 2) Não");
		p4=leia.nextInt();
	}
	public void p5() {
		System.out.println("Você fez extração dentária nas últimas 72 horas? \n 1) Sim 2) Não");
		p5=leia.nextInt();
	}
	public void p7() {
		System.out.println("Tomou vacina nos últimos 7 dias? \n 1) Sim 2) Não");
		p7=leia.nextInt();
	}
	public void resultado() {
		System.out.println("================================================================");
		System.out.println("=                          RESULTADOS                          =");
		System.out.println("================================================================");
		System.out.println("Nome: Amanda" + "| Idade: "+idade+"| Gênero: "+genero+"| Peso: "+peso+"kg");
		avisos();
	}


	public void avisos() {
		if(p1==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde o período de 12 meses se completar para poder realizar sua doação");
		}
		if(p2==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde o período de 6 meses se completar para poder realizar sua doação");
		}
		if(p3==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde o período de 3 meses se completar para para poder realizar sua doação");
		}
		if(p4==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde o período de 7 dias se completar para para poder realizar sua doação");
		}
		if(p5==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde o período de 72 horas se completar para para poder realizar sua doação");
		}
		if(p7==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde o período de 7 dias se completar para para poder realizar sua doação");
		}
		if(p1==2 && p2==2 && p3==2 && p4==2 && p5==2 && p7==2) {
			System.out.println("PARABÉNS VOCÊ ESTÁ APTE PARA FAZER A DOAÇÃO DE SANGUE!");
		}
		EnderecoProximo endPro = new EnderecoProximo();
		endPro.mostraEndereco();
	}
}

