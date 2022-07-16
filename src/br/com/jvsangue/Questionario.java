package br.com.jvsangue;

import java.util.Scanner;

public class Questionario extends Cadastro{

	private int genero, drogas, intervalo, continua, gravidez, periodo, parto, idade, doouAnteriormente, doencasPermanentes;
	
	private double peso;

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
			System.out.println("Para homens o intervalo mínimo para realizar doação de sangue é de 2 meses.\n Infelizmente você não está apto a realizar a doação."
					+ "\nDeseja continuar respondendo o questionário? \n 1- Sim 2- Não ");
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
			System.out.println("Você não está apta a realizar a doação devido estar em período gestacional."
					+ "\n Deseja continuar respondendo o questionário ?  \n 1- Sim 2- Não");
			continua = leia.nextInt();
			if (continua == 2) {

				MenuInicial.menu();
			}
		}
		System.out.println("Você esteve em período gestacional nos últimos 12 meses? \n 1- Sim 2- Não");
		periodo = leia.nextInt();
		if (periodo == 1) {
			System.out.println("Caso você tenha tido parto normal deve aguardar 90 dias \n"
					+ "caso voê tenha tido parto cesariana deve aguardar 180 dias"
					+ "\n caso esteja amamentando deve aguardar 12 meses após o parto para estar apta a realizar a doação. "
					+ "\n você se enquadra nestes requisitos?"
					+ "\n  1- Sim 2- Não");
			parto = leia.nextInt();		
			if (parto == 1) {
				System.out.println("Infelizmente você não está apta a realizar a doação no momento."
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
			System.out.println("Para mulheres o intervalo mínimo para realizar doação de sangue são de 3 meses. "
					+ "\nInfelizmente você não está apta a realizar a doação."
					+ "\nDeseja continuar respondendo o questionário? \n 1- Sim 2- Não ");
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
		if (idade < 16 || idade > 69 ){
			System.out.println("A faixa de idade apta a realizar a doaÃ§Ã£o Ã© de 16 a 69 anos. \nInfelizmente você não está apte a realizar a doação.");
			MenuInicial.menu();
		}
		else if (idade>=60 && idade<=69) {
			System.out.println("Você já doou sangue anteriormente? \n 1 - Sim 2 - Não");	
			doouAnteriormente = leia.nextInt();
			if(doouAnteriormente == 2) {
				System.out.println("Infelizmente você não está apte a realizar a doação. ");
				MenuInicial.menu();
			}
		}
		System.out.println("Qual o seu peso? ");
		peso = leia.nextDouble();
		if (peso < 50.0) {
			System.out.println("Para realizar a doação precisa ter 50kg ou mais. "
					+ "\nInfelizmente você não está apte a realizar a doação.");

			MenuInicial.menu();
		}
		System.out.println("Você teve alguma dessas doenças listadas abaixo:"
				+ "\n Hepatite após os 11 anos "
				+ "\n Evidência de hepatite B e C"
				+ "\n AIDS  ou doenças associadas ao vírus HTLV I e II "
				+ "\n Doença de chagas"
				+  "\n Malária"
				+ "\n Caso afirmativo para qualquer uma das perguntas acima digite 1, caso não digite 2. ");
		doencasPermanentes = leia.nextInt();		
		if (doencasPermanentes == 1) {
			System.out.println("Infelizmente vocÃª nÃ£o poderÃ¡ realizar a doação de sangue.");
			MenuInicial.menu();
		}
		System.out.println(" Você já fez uso de drogas ilícitas injetáveis? ou"
				+ " \n Tem piercing em cavidade oral ou região genital?"
				+ "\n Caso afirmativo para qualquer uma das perguntas acima digite 1, caso não digite 2.");
		drogas = leia.nextInt();
		if (drogas == 1) {
			System.out.println("Infelizmente você não poderá realizar a doação de sangue.");
			MenuInicial.menu();
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
		System.out.println("VocÃª precisou de transfusÃ£o de sangue ou foi exposto a situaÃ§Ãµes de risco acrescido para infecÃ§Ãµes sexualmente transmissÃ­veis ou VocÃª fez tatuagem e/ou piercing nos Ãºltimos 12 meses? \n 1 - Sim \n2 - NÃ£o");
		p1=leia.nextInt();
		}
	public void p2() {
		System.out.println("VocÃª teve alguma dessas doenÃ§as nos Ãºltimos 6 meses: Colecistectomia, histerectomia, nefrectomia, reduÃ§Ã£o de fraturas, politraumatismos sem seqÃ¼elas graves, tireoidectomia, colectomia ou Passou por exames ou procedimentos que houve a utilizaÃ§Ã£o de endoscÃ³pio ? \n 1 - Sim \n2 - NÃ£o");
		p2=leia.nextInt();
		
	}
	public void p3() {
		System.out.println("VocÃª teve alguma dessas doenÃ§as nos Ãºltimos 3 meses:  apendicite, hÃ©rnia, amigdalectomia, varizes? \n 1 - Sim \n2 - NÃ£o ");
		p3=leia.nextInt();
		
	}
	public void p4() {
		System.out.println("Teve Gripe, resfriado e febre nos Ãºltimos 7 dias?\n 1 - Sim \n2 - NÃ£o");
		p4=leia.nextInt();
	}
	public void p5() {
		System.out.println("VocÃª fez ExtraÃ§Ã£o dentÃ¡ria nas Ãºltimas 72 horas? \n 1 - Sim \n2 - NÃ£o");
		p5=leia.nextInt();
	}
	public void p7() {
		System.out.println("Tomou vacina nos Ãºltimos 7 dias? \n 1 - Sim \n2 - NÃ£o");
		p7=leia.nextInt();
	}
	public void resultado() {
		System.out.println("================================================================");
		System.out.println("=                          RESULTADOS                          =");
		System.out.println("================================================================");
		System.out.println("Nome: "+ usu.getNome() + "| Idade: "+idade+"| GÃªnero: "+genero+"| Peso: "+peso+"kg");
		avisos();
		
	}
	
	public void avisos() {
		if(p1==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde x para poder realizar sua doaÃ§Ã£o");
		}
		if(p2==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde x para poder realizar sua doaÃ§Ã£o");
		}
		if(p3==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde x para poder realizar sua doaÃ§Ã£o");
		}
		if(p4==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde x para poder realizar sua doaÃ§Ã£o");
		}
		if(p5==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde x para poder realizar sua doaÃ§Ã£o");
		}
		if(p7==1) {
			System.out.println("AVISO!!!!!!! \n Aguarde x para poder realizar sua doaÃ§Ã£o");
		}
		if(p1==2 && p2==2 && p3==2 && p4==2 && p5==2 && p7==2) {
			System.out.println("PARABÃ‰NS VOCÃŠ ESTÃ� APTX PARA FAZER A DOAÃ‡ÃƒO DE SANGUE");
			Regiao();
		}
	}
	public void Regiao() {
		System.out.println("================================================================");
		System.out.println("=                      PONTOS DE DOAÃ‡ÃƒO                        =");
		System.out.println("================================================================");
		if(usu.getRegiao() ==1) {
			System.out.println("O hospital mais prÃ³ximo de vocÃª para doaÃ§Ã£o Ã© o X");
		}
		if(usu.getRegiao()==2) {
			System.out.println("O hospital mais prÃ³ximo de vocÃª para doaÃ§Ã£o Ã© o X");
		}
		if(usu.getRegiao()==3) {
			System.out.println("O hospital mais prÃ³ximo de vocÃª para doaÃ§Ã£o Ã© o X");
		}
		if(usu.getRegiao()==4) {
			System.out.println("O hospital mais prÃ³ximo de vocÃª para doaÃ§Ã£o Ã© o X");
		}
		if(usu.getRegiao()==5) {
			System.out.println("O hospital mais prÃ³ximo de vocÃª para doaÃ§Ã£o Ã© o X");
		}
		System.out.println("Deseja retornar ao menu?\n 1 - Sim \n2 - NÃ£o");
		ret=leia.nextInt();
		if(ret==1) {
			
			MenuInicial.menu();
		}
		else {
			System.out.println("Saindo do programa................");
		}
		
	}
}
