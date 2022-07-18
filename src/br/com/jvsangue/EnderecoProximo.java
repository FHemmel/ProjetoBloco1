package br.com.jvsangue;

import java.util.Scanner;

public class EnderecoProximo {
	
	static void mostraEndereco() {
		int escolha;
		Scanner input=new Scanner(System.in);
		
		System.out.println();
		System.out.println("================================================================");
		System.out.println("=                    POSTOS MAIS PR�XIMOS                      =");
		System.out.println("================================================================");
		
		System.out.println("Digite:");
		System.out.println("1- Regi�o Norte");
		System.out.println("2- Regi�o Sul");
		System.out.println("3- Regi�o Leste");
		System.out.println("4- Regi�o Oeste");
		System.out.println("5- Regi�o Central");
		System.out.println("6- N�o sei minha regi�o");
		
		
		escolha=input.nextInt();
		
		switch(escolha) {
		case 1: //Regi�o Norte
			System.out.println("Importante realizar o agendamento online antes de comparecer no local da doa��o de sangue."
					+ "\nClique aqui: https://prosangue.hubglobe.com/entrar para agendar sua doa��o.");
			System.out.println();
			System.out.println("Posto Mandaqui\n"
					+ "R. Volunt�rios da P�tria, 4227 - Mandaqui - S�o Paulo\n"
					+ "De segunda a sexta-feira, das 8 �s 16h30\n"
					+ "S�bados, FECHADO a partir de 09/07/2022\n"
					+ "- Estacionamento para carros, para os candidatos �doa��o e doadores, durante o per�odo de "
					+ "\nperman�ncia no posto de coleta, e mediante disponibilidade de vaga: dentro do complexo do Mandaqui");
			System.out.println();
			System.out.println("Posto Stella Maris\n"
					+ "R. Maria C�ndida Pereira, 568 - Itapegica - Guarulhos\n"
					+ "De segunda a sexta-feira, das 8 �s 16h00");
			break;
		case 2: //Regi�o Sul
			System.out.println("Importante realizar o agendamento online antes de comparecer no local da doa��o de sangue."
					+ "\nClique aqui: https://prosangue.hubglobe.com/entrar para agendar sua doa��o.");
			System.out.println();
			System.out.println("Posto Cl�nicas - reabertura em 11/07/2022\n"
					+ "Av. Dr. En�as Carvalho de Aguiar, 155, 1� andar - Cerqueira C�sar - S�o Paulo\n"
					+ "De segunda a sexta, das 8 �s 17h30\n"
					+ "S�bados, das 8 �s 16h00\n"
					+ "- Estacionamento para carros, durante o per�odo de perman�ncia no posto de coleta, e mediante "
					+ "\ndisponibilidade de vaga:\n"
					+ "De segunda a sexta-feira: dentro do Complexo do HC, no bols�o de autom�veis identificado para o "
					+ "\ndoador de sangue, pr�ximo ao Pr�dio dos Ambulat�rios, mediante disponibilidade de vaga - "
					+ "\nacesso ao local pela Portaria 1 - InRad ou pela Portaria da Av. Rebou�as, 600\n"
					+ "S�bados, feriados e emendas de feriado: dentro do Complexo do HC, em qualquer vaga amarela que "
					+ "\nestiver livre, exceto as identificadas e destinadas aos ve�culos de emerg�ncia. O acesso ao "
					+ "\nlocal � pela Portaria 1 - InRad\n"
					+ "- Estacionamento para motos, durante o per�odo de perman�ncia no posto de coleta, mediante "
					+ "\ndisponibilidade de vaga: 5 vagas gratuitas sujeitas � disponibilidade e sem cobertura de seguro,"
					+ "\n em bols�o espec�fico com acesso pela Av. Rebou�as, 600 (antes da cancela, do lado esquerdo da "
					+ "\nrua)\n");
			System.out.println();
			System.out.println("Posto Dante Pazzanese\n"
					+ "Av. Dr. Dante Pazzanese, 500 - Ibirapuera - S�o Paulo\n"
					+ "Segunda a sexta, das 8 �s 16h30\n"
					+ "S�bados, das 8 �s 16h00 (ap�s 16/07 - sem atendimento aos s�bados)\n"
					+ "- Estacionamento para carros, para os candidatos � doa��o e doadores, durante o per�odo de "
					+ "\nperman�ncia no posto de coleta, e mediante disponibilidade de vaga: Av. Dr. Dante Pazzanese, 244,"
					+ "\n pr�ximo � entrada do hospital.");
			break;
		case 3: //Regi�o Leste
			System.out.println("Importante realizar o agendamento online antes de comparecer no local da doa��o de sangue."
					+ "\n Clique aqui: https://prosangue.hubglobe.com/entrar para agendar sua doa��o.");
			System.out.println();
			System.out.println("Posto Dante Pazzanese\n"
					+ "Av. Dr. Dante Pazzanese, 500 - Ibirapuera - S�o Paulo\n"
					+ "Segunda a sexta, das 8 �s 16h30\n"
					+ "S�bados, das 8 �s 16h00 (ap�s 16/07 - sem atendimento aos s�bados)\n"
					+ "- Estacionamento para carros, para os candidatos � doa��o e doadores, durante o per�odo de "
					+ "\nperman�ncia no posto de coleta, e mediante disponibilidade de vaga: Av. Dr. Dante Pazzanese, 244,"
					+ "\n pr�ximo � entrada do hospital.");
			System.out.println();
			System.out.println("Posto Cl�nicas - reabertura em 11/07/2022\n"
					+ "Av. Dr. En�as Carvalho de Aguiar, 155, 1� andar - Cerqueira C�sar - S�o Paulo\n"
					+ "De segunda a sexta, das 8 �s 17h30\n"
					+ "S�bados, das 8 �s 16h00\n"
					+ "- Estacionamento para carros, durante o per�odo de perman�ncia no posto de coleta, e mediante "
					+ "\ndisponibilidade de vaga:\n"
					+ "De segunda a sexta-feira: dentro do Complexo do HC, no bols�o de autom�veis identificado para o "
					+ "\ndoador de sangue, pr�ximo ao Pr�dio dos Ambulat�rios, mediante disponibilidade de vaga - acesso "
					+ "\nao local pela Portaria 1 - InRad ou pela Portaria da Av. Rebou�as, 600\n"
					+ "S�bados, feriados e emendas de feriado: dentro do Complexo do HC, em qualquer vaga amarela que "
					+ "\nestiver livre, exceto as identificadas e destinadas aos ve�culos de emerg�ncia. O acesso ao local � "
					+ "\npela Portaria 1 - InRad\n"
					+ "- Estacionamento para motos, durante o per�odo de perman�ncia no posto de coleta, mediante "
					+ "\ndisponibilidade de vaga: 5 vagas gratuitas sujeitas � disponibilidade e sem cobertura de seguro, "
					+ "\nem bols�o espec�fico com acesso pela Av. Rebou�as, 600 (antes da cancela, do lado esquerdo da rua)\n");
			System.out.println();
			System.out.println("Posto Stella Maris\n"
					+ "R. Maria C�ndida Pereira, 568 - Itapegica - Guarulhos\n"
					+ "De segunda a sexta-feira, das 8 �s 16h00");
			break;
		case 4: //Regi�o Oeste
			System.out.println("Importante realizar o agendamento online antes de comparecer no local da doa��o de sangue."
					+ "\n Clique aqui: https://prosangue.hubglobe.com/entrar para agendar sua doa��o.");
			System.out.println();
			System.out.println("Posto Cl�nicas - reabertura em 11/07/2022\n"
					+ "Av. Dr. En�as Carvalho de Aguiar, 155, 1� andar - Cerqueira C�sar - S�o Paulo\n"
					+ "De segunda a sexta, das 8 �s 17h30\n"
					+ "S�bados, das 8 �s 16h00\n"
					+ "- Estacionamento para carros, durante o per�odo de perman�ncia no posto de coleta, e mediante "
					+ "\ndisponibilidade de vaga:\n"
					+ "De segunda a sexta-feira: dentro do Complexo do HC, no bols�o de autom�veis identificado para o doador"
					+ "\n de sangue, pr�ximo ao Pr�dio dos Ambulat�rios, mediante disponibilidade de vaga - acesso ao local "
					+ "\npela Portaria 1 - InRad ou pela Portaria da Av. Rebou�as, 600\n"
					+ "S�bados, feriados e emendas de feriado: dentro do Complexo do HC, em qualquer vaga amarela que estiver "
					+ "\nlivre, exceto as identificadas e destinadas aos ve�culos de emerg�ncia. O acesso ao local � pela "
					+ "\nPortaria 1 - InRad\n"
					+ "- Estacionamento para motos, durante o per�odo de perman�ncia no posto de coleta, mediante "
					+ "\ndisponibilidade de vaga: 5 vagas gratuitas sujeitas � disponibilidade e sem cobertura de seguro, "
					+ "\nem bols�o espec�fico com acesso pela Av. Rebou�as, 600 (antes da cancela, do lado esquerdo da rua)\n");
			System.out.println();
			System.out.println("Posto Regional de Osasco\n"
					+ "R. Ari Barroso, 355 - Presidente Altino - Osasco\n"
					+ "De segunda a sexta-feira, das 8 �s 16h30\n"
					+ "S�bados, das 8 �s 16h00\n"
					+ "Fechado aos domingos e feriados");
			System.out.println();
			System.out.println("Posto Barueri\n"
					+ "R. Angela Mirella, 354 T�rreo - Jd. Barueri - Barueri\n"
					+ "* pr�ximo � Av. Sebasti�o Davino dos Reis\n"
					+ "De segunda a sexta-feira, das 8 às 16h00\n"
					+ "- Estacionamento para carros, para os candidatos � doa��o e doadores, durante o per�odo de "
					+ "\nperman�ncia no posto de coleta, e mediante disponibilidade de vagas: dentro do Hospital de Barueri.");
			break;
		case 5: //Regi�o Central
			System.out.println("Importante realizar o agendamento online antes de comparecer no local da doa��o de sangue."
					+ "\n Clique aqui: https://prosangue.hubglobe.com/entrar para agendar sua doa��o.");
			System.out.println();
			System.out.println("Posto Cl�nicas - reabertura em 11/07/2022\n"
					+ "Av. Dr. En�as Carvalho de Aguiar, 155, 1� andar - Cerqueira C�sar - S�o Paulo\n"
					+ "De segunda a sexta, das 8 �s 17h30\n"
					+ "S�bados, das 8 �s 16h00\n"
					+ "- Estacionamento para carros, durante o per�odo de perman�ncia no posto de coleta, e mediante "
					+ "\ndisponibilidade de vaga:\n"
					+ "De segunda a sexta-feira: dentro do Complexo do HC, no bols�o de autom�veis identificado para o doador "
					+ "\nde sangue, pr�ximo ao Pr�dio dos Ambulat�rios, mediante disponibilidade de vaga - acesso ao local "
					+ "\npela Portaria 1 - InRad ou pela Portaria da Av. Rebou�as, 600\n"
					+ "S�bados, feriados e emendas de feriado: dentro do Complexo do HC, em qualquer vaga amarela que estiver "
					+ "\nlivre, exceto as identificadas e destinadas aos ve�culos de emerg�ncia. O acesso ao local � pela "
					+ "\nPortaria 1 - InRad\n"
					+ "- Estacionamento para motos, durante o per�odo de perman�ncia no posto de coleta, mediante "
					+ "\ndisponibilidade de vaga: 5 vagas gratuitas sujeitas � disponibilidade e sem cobertura de seguro, em "
					+ "\nbols�o espec�fico com acesso pela Av. Rebou�as, 600 (antes da cancela, do lado esquerdo da rua)\n");
			break;
		case 6: //N�o sei minha regi�o
			System.out.println("Importante realizar o agendamento online antes de comparecer no local da doa��o de sangue."
					+ "\n Clique aqui: https://prosangue.hubglobe.com/entrar para agendar sua doa��oo.");
			System.out.println();
			System.out.println("Posto Cl�nicas - reabertura em 11/07/2022\n"
					+ "Av. Dr. En�as Carvalho de Aguiar, 155, 1� andar - Cerqueira C�sar - S�o Paulo\n"
					+ "De segunda a sexta, das 8 �s 17h30\n"
					+ "S�bados, das 8 �s 16h00\n"
					+ "- Estacionamento para carros, durante o per�odo de perman�ncia no posto de coleta, e mediante "
					+ "\ndisponibilidade de vaga:\n"
					+ "De segunda a sexta-feira: dentro do Complexo do HC, no bols�o de autom�veis identificado para o "
					+ "\ndoador de sangue, pr�ximo ao Pr�dio dos Ambulat�rios, mediante disponibilidade de vaga - acesso ao "
					+ "\nlocal pela Portaria 1 - InRad ou pela Portaria da Av. Rebou�as, 600\n"
					+ "S�bados, feriados e emendas de feriado: dentro do Complexo do HC, em qualquer vaga amarela que "
					+ "\nestiver livre, exceto as identificadas e destinadas aos ve�culos de emerg�ncia. O acesso ao local "
					+ "\n� pela Portaria 1 - InRad\n"
					+ "- Estacionamento para motos, durante o per�odo de perman�ncia no posto de coleta, mediante "
					+ "\ndisponibilidade de vaga: 5 vagas gratuitas sujeitas � disponibilidade e sem cobertura de seguro,"
					+ "\n em bols�o espec�fico com acesso pela Av. Rebou�as, 600 (antes da cancela, do lado esquerdo da rua)\n");
			System.out.println();
			System.out.println("Posto Dante Pazzanese\n"
					+ "Av. Dr. Dante Pazzanese, 500 - Ibirapuera - S�o Paulo\n"
					+ "Segunda a sexta, das 8 �s 16h30\n"
					+ "S�bados, das 8 �s 16h00 (ap�s 16/07 - sem atendimento aos s�bados)\n"
					+ "- Estacionamento para carros, para os candidatos � doa��o e doadores, durante o per�odo de "
					+ "\nperman�ncia no posto de coleta, e mediante disponibilidade de vaga: Av. Dr. Dante Pazzanese, 244,"
					+ "\n pr�ximo � entrada do hospital (clique aqui para ver localiza��o e detalhes)\n"
					+ "Posto Mandaqui\n"
					+ "R. Volunt�rios da P�tria, 4227 - Mandaqui - S�o Paulo\n"
					+ "De segunda a sexta-feira, das 8 �s 16h30\n"
					+ "S�bados, FECHADO a partir de 09/07/2022\n"
					+ "- Estacionamento para carros, para os candidatos � doa��o e doadores, durante o per�odo de"
					+ "\n perman�ncia no posto de coleta, e mediante disponibilidade de vaga: dentro do complexo do"
					+ "\n Mandaqui (clique aqui para ver localiza��o e detalhes)");
			System.out.println();
			System.out.println("Posto Regional de Osasco\n"
					+ "R. Ari Barroso, 355 - Presidente Altino - Osasco\n"
					+ "De segunda a sexta-feira, das 8 �s 16h30\n"
					+ "S�bados, das 8 �s 16h00\n"
					+ "Fechado aos domingos e feriados");
			System.out.println();
			System.out.println("Posto Barueri\n"
					+ "R. Angela Mirella, 354 T�rreo - Jd. Barueri - Barueri\n"
					+ "* pr�ximo � Av. Sebasti�o Davino dos Reis\n"
					+ "De segunda a sexta-feira, das 8 �s 16h00\n"
					+ "- Estacionamento para carros, para os candidatos � doa��o e doadores, durante o per�odo de "
					+ "\nperman�ncia no posto de coleta, e mediante disponibilidade de vagas: dentro do Hospital de Barueri.");
			System.out.println();
			System.out.println("Posto Stella Maris\n"
					+ "R. Maria C�ndida Pereira, 568 - Itapegica - Guarulhos\n"
					+ "De segunda a sexta-feira, das 8 �s 16h00");
			break;
		default:
			System.out.println("Op��o Inv�lida!");
		}
		
		System.out.println();
		System.out.println("Deseja retornar ao menu principal?");
		System.out.println("1) Sim");
		System.out.println("2) N�o");
		char opcao2 = input.next().charAt(0);
		
		switch (opcao2) {
		case '1':
			MenuInicial.menu();
			break;
		case '2':
			System.out.println("Voc� saiu do programa.");
			System.exit(0);
			break;
		}
		
		
input.close();
	}
}
	

	
	
	
	
	
	

