package br.com.jvsangue;

import java.util.Scanner;

public class EnderecoProximo{
	public static void main(String[] args) {
		int escolha;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Digite:");
		System.out.println("1- Região Norte");
		System.out.println("2- Região Sul");
		System.out.println("3- Região Leste");
		System.out.println("4- Região Oeste");
		System.out.println("5- Região Central");
		System.out.println("6- Não sei minha região");
		escolha=input.nextInt();
		
		switch(escolha) {
		case 1: //Região Norte
			System.out.println("Importante realizar o agendamento online antes de comparecer no local da doação de sangue. Clique aqui: https://prosangue.hubglobe.com/entrar para agendar sua doação.");
			System.out.println();
			System.out.println("Posto Mandaqui\n"
					+ "R. Voluntários da Pátria, 4227 - Mandaqui - São Paulo\n"
					+ "De segunda a sexta-feira, das 8 às 16h30\n"
					+ "Sábados, FECHADO a partir de 09/07/2022\n"
					+ "- Estacionamento para carros, para os candidatos à doação e doadores, durante o período de permanência no posto de coleta, e mediante disponibilidade de vaga: dentro do complexo do Mandaqui");
			System.out.println();
			System.out.println("Posto Stella Maris\n"
					+ "R. Maria Cândida Pereira, 568 – Itapegica - Guarulhos\n"
					+ "De segunda a sexta-feira, das 8 às 16h00");
			break;
		case 2: //Região Sul
			System.out.println("Importante realizar o agendamento online antes de comparecer no local da doação de sangue. Clique aqui: https://prosangue.hubglobe.com/entrar para agendar sua doação.");
			System.out.println();
			System.out.println("Posto Clínicas – reabertura em 11/07/2022\n"
					+ "Av. Dr. Enéas Carvalho de Aguiar, 155, 1º andar - Cerqueira César - São Paulo\n"
					+ "De segunda a sexta, das 8 às 17h30\n"
					+ "Sábados, das 8 às 16h00\n"
					+ "- Estacionamento para carros, durante o período de permanência no posto de coleta, e mediante disponibilidade de vaga:\n"
					+ "De segunda a sexta-feira: dentro do Complexo do HC, no bolsão de automóveis identificado para o doador de sangue, próximo ao Prédio dos Ambulatórios, mediante disponibilidade de vaga - acesso ao local pela Portaria 1 – InRad ou pela Portaria da Av. Rebouças, 600\n"
					+ "Sábados, feriados e emendas de feriado: dentro do Complexo do HC, em qualquer vaga amarela que estiver livre, exceto as identificadas e destinadas aos veículos de emergência. O acesso ao local é pela Portaria 1 – InRad\n"
					+ "- Estacionamento para motos, durante o período de permanência no posto de coleta, mediante disponibilidade de vaga: 5 vagas gratuitas sujeitas à disponibilidade e sem cobertura de seguro, em bolsão específico com acesso pela Av. Rebouças, 600 (antes da cancela, do lado esquerdo da rua)\n");
			System.out.println();
			System.out.println("Posto Dante Pazzanese\n"
					+ "Av. Dr. Dante Pazzanese, 500 - Ibirapuera - São Paulo\n"
					+ "Segunda a sexta, das 8 às 16h30\n"
					+ "Sábados, das 8 às 16h00 (após 16/07 – sem atendimento aos sábados)\n"
					+ "- Estacionamento para carros, para os candidatos à doação e doadores, durante o período de permanência no posto de coleta, e mediante disponibilidade de vaga: Av. Dr. Dante Pazzanese, 244, próximo à entrada do hospital");
			break;
		case 3: //Região Leste
			System.out.println("Importante realizar o agendamento online antes de comparecer no local da doação de sangue. Clique aqui: https://prosangue.hubglobe.com/entrar para agendar sua doação.");
			System.out.println();
			System.out.println("Posto Dante Pazzanese\n"
					+ "Av. Dr. Dante Pazzanese, 500 - Ibirapuera - São Paulo\n"
					+ "Segunda a sexta, das 8 às 16h30\n"
					+ "Sábados, das 8 às 16h00 (após 16/07 – sem atendimento aos sábados)\n"
					+ "- Estacionamento para carros, para os candidatos à doação e doadores, durante o período de permanência no posto de coleta, e mediante disponibilidade de vaga: Av. Dr. Dante Pazzanese, 244, próximo à entrada do hospital (clique aqui para ver localização e detalhes)");
			System.out.println();
			System.out.println("Posto Clínicas – reabertura em 11/07/2022\n"
					+ "Av. Dr. Enéas Carvalho de Aguiar, 155, 1º andar - Cerqueira César - São Paulo\n"
					+ "De segunda a sexta, das 8 às 17h30\n"
					+ "Sábados, das 8 às 16h00\n"
					+ "- Estacionamento para carros, durante o período de permanência no posto de coleta, e mediante disponibilidade de vaga:\n"
					+ "De segunda a sexta-feira: dentro do Complexo do HC, no bolsão de automóveis identificado para o doador de sangue, próximo ao Prédio dos Ambulatórios, mediante disponibilidade de vaga - acesso ao local pela Portaria 1 – InRad ou pela Portaria da Av. Rebouças, 600 (clique aqui para ver localização e detalhes)\n"
					+ "Sábados, feriados e emendas de feriado: dentro do Complexo do HC, em qualquer vaga amarela que estiver livre, exceto as identificadas e destinadas aos veículos de emergência. O acesso ao local é pela Portaria 1 – InRad\n"
					+ "- Estacionamento para motos, durante o período de permanência no posto de coleta, mediante disponibilidade de vaga: 5 vagas gratuitas sujeitas à disponibilidade e sem cobertura de seguro, em bolsão específico com acesso pela Av. Rebouças, 600 (antes da cancela, do lado esquerdo da rua)");
			System.out.println();
			System.out.println("Posto Stella Maris\n"
					+ "R. Maria Cândida Pereira, 568 – Itapegica - Guarulhos\n"
					+ "De segunda a sexta-feira, das 8 às 16h00");
			break;
		case 4: //Região Oeste
			System.out.println("Importante realizar o agendamento online antes de comparecer no local da doação de sangue. Clique aqui: https://prosangue.hubglobe.com/entrar para agendar sua doação.");
			System.out.println();
			System.out.println("Posto Clínicas – reabertura em 11/07/2022\n"
					+ "Av. Dr. Enéas Carvalho de Aguiar, 155, 1º andar - Cerqueira César - São Paulo\n"
					+ "De segunda a sexta, das 8 às 17h30\n"
					+ "Sábados, das 8 às 16h00\n"
					+ "- Estacionamento para carros, durante o período de permanência no posto de coleta, e mediante disponibilidade de vaga:\n"
					+ "De segunda a sexta-feira: dentro do Complexo do HC, no bolsão de automóveis identificado para o doador de sangue, próximo ao Prédio dos Ambulatórios, mediante disponibilidade de vaga - acesso ao local pela Portaria 1 – InRad ou pela Portaria da Av. Rebouças, 600\n"
					+ "Sábados, feriados e emendas de feriado: dentro do Complexo do HC, em qualquer vaga amarela que estiver livre, exceto as identificadas e destinadas aos veículos de emergência. O acesso ao local é pela Portaria 1 – InRad\n"
					+ "- Estacionamento para motos, durante o período de permanência no posto de coleta, mediante disponibilidade de vaga: 5 vagas gratuitas sujeitas à disponibilidade e sem cobertura de seguro, em bolsão específico com acesso pela Av. Rebouças, 600 (antes da cancela, do lado esquerdo da rua)");
			System.out.println();
			System.out.println("Posto Regional de Osasco\n"
					+ "R. Ari Barroso, 355 - Presidente Altino - Osasco\n"
					+ "De segunda a sexta-feira, das 8 às 16h30\n"
					+ "Sábados, das 8 às 16h00\n"
					+ "Fechado aos domingos e feriados");
			System.out.println();
			System.out.println("Posto Barueri\n"
					+ "R. Angela Mirella, 354 Térreo - Jd. Barueri - Barueri\n"
					+ "* próximo à Av. Sebastião Davino dos Reis\n"
					+ "De segunda a sexta-feira, das 8 às 16h00\n"
					+ "- Estacionamento para carros, para os candidatos à doação e doadores, durante o período de permanência no posto de coleta, e mediante disponibilidade de vagas: dentro do Hospital de Barueri.");
			break;
		case 5: //Região Central
			System.out.println("Importante realizar o agendamento online antes de comparecer no local da doação de sangue. Clique aqui: https://prosangue.hubglobe.com/entrar para agendar sua doação.");
			System.out.println();
			System.out.println("Posto Clínicas – reabertura em 11/07/2022\n"
					+ "Av. Dr. Enéas Carvalho de Aguiar, 155, 1º andar - Cerqueira César - São Paulo\n"
					+ "De segunda a sexta, das 8 às 17h30\n"
					+ "Sábados, das 8 às 16h00\n"
					+ "- Estacionamento para carros, durante o período de permanência no posto de coleta, e mediante disponibilidade de vaga:\n"
					+ "De segunda a sexta-feira: dentro do Complexo do HC, no bolsão de automóveis identificado para o doador de sangue, próximo ao Prédio dos Ambulatórios, mediante disponibilidade de vaga - acesso ao local pela Portaria 1 – InRad ou pela Portaria da Av. Rebouças, 600\n"
					+ "Sábados, feriados e emendas de feriado: dentro do Complexo do HC, em qualquer vaga amarela que estiver livre, exceto as identificadas e destinadas aos veículos de emergência. O acesso ao local é pela Portaria 1 – InRad\n"
					+ "- Estacionamento para motos, durante o período de permanência no posto de coleta, mediante disponibilidade de vaga: 5 vagas gratuitas sujeitas à disponibilidade e sem cobertura de seguro, em bolsão específico com acesso pela Av. Rebouças, 600 (antes da cancela, do lado esquerdo da rua)");
			break;
		case 6: //Não sei minha região
			System.out.println("Importante realizar o agendamento online antes de comparecer no local da doação de sangue. Clique aqui: https://prosangue.hubglobe.com/entrar para agendar sua doação.");
			System.out.println();
			System.out.println("Posto Clínicas – reabertura em 11/07/2022\n"
					+ "Av. Dr. Enéas Carvalho de Aguiar, 155, 1º andar - Cerqueira César - São Paulo\n"
					+ "De segunda a sexta, das 8 às 17h30\n"
					+ "Sábados, das 8 às 16h00\n"
					+ "- Estacionamento para carros, durante o período de permanência no posto de coleta, e mediante disponibilidade de vaga:\n"
					+ "De segunda a sexta-feira: dentro do Complexo do HC, no bolsão de automóveis identificado para o doador de sangue, próximo ao Prédio dos Ambulatórios, mediante disponibilidade de vaga - acesso ao local pela Portaria 1 – InRad ou pela Portaria da Av. Rebouças, 600 (clique aqui para ver localização e detalhes)\n"
					+ "Sábados, feriados e emendas de feriado: dentro do Complexo do HC, em qualquer vaga amarela que estiver livre, exceto as identificadas e destinadas aos veículos de emergência. O acesso ao local é pela Portaria 1 – InRad\n"
					+ "- Estacionamento para motos, durante o período de permanência no posto de coleta, mediante disponibilidade de vaga: 5 vagas gratuitas sujeitas à disponibilidade e sem cobertura de seguro, em bolsão específico com acesso pela Av. Rebouças, 600 (antes da cancela, do lado esquerdo da rua)");
			System.out.println();
			System.out.println("Posto Dante Pazzanese\n"
					+ "Av. Dr. Dante Pazzanese, 500 - Ibirapuera - São Paulo\n"
					+ "Segunda a sexta, das 8 às 16h30\n"
					+ "Sábados, das 8 às 16h00 (após 16/07 – sem atendimento aos sábados)\n"
					+ "- Estacionamento para carros, para os candidatos à doação e doadores, durante o período de permanência no posto de coleta, e mediante disponibilidade de vaga: Av. Dr. Dante Pazzanese, 244, próximo à entrada do hospital (clique aqui para ver localização e detalhes)\n"
					+ "Posto Mandaqui\n"
					+ "R. Voluntários da Pátria, 4227 - Mandaqui - São Paulo\n"
					+ "De segunda a sexta-feira, das 8 às 16h30\n"
					+ "Sábados, FECHADO a partir de 09/07/2022\n"
					+ "- Estacionamento para carros, para os candidatos à doação e doadores, durante o período de permanência no posto de coleta, e mediante disponibilidade de vaga: dentro do complexo do Mandaqui (clique aqui para ver localização e detalhes)");
			System.out.println();
			System.out.println("Posto Regional de Osasco\n"
					+ "R. Ari Barroso, 355 - Presidente Altino - Osasco\n"
					+ "De segunda a sexta-feira, das 8 às 16h30\n"
					+ "Sábados, das 8 às 16h00\n"
					+ "Fechado aos domingos e feriados");
			System.out.println();
			System.out.println("Posto Barueri\n"
					+ "R. Angela Mirella, 354 Térreo - Jd. Barueri - Barueri\n"
					+ "* próximo à Av. Sebastião Davino dos Reis\n"
					+ "De segunda a sexta-feira, das 8 às 16h00\n"
					+ "- Estacionamento para carros, para os candidatos à doação e doadores, durante o período de permanência no posto de coleta, e mediante disponibilidade de vagas: dentro do Hospital de Barueri.");
			System.out.println();
			System.out.println("Posto Stella Maris\n"
					+ "R. Maria Cândida Pereira, 568 – Itapegica - Guarulhos\n"
					+ "De segunda a sexta-feira, das 8 às 16h00");
			break;
		default:
			System.out.println("Opção Inválida!");
		}
		
		
input.close();
	}
	
	

	}
	
	
	
	
	
	

