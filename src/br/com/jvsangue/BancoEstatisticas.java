package br.com.jvsangue;

public class BancoEstatisticas {
	

	public static void mostraEstGerais() {
		System.out.println("========================================================");
		System.out.println("==ESTATÍSTICAS GERAIS SOBRE DOAÇÃO DE SANGUE NO BRASIL==");
		System.out.println("========================================================");
		System.out.println();
		
		System.out.println("Você sabia que uma doação de sangue pode salvar até 4 vidas?"
						+ "\nAlém de ajudar pessoas que precisam de sangue para procedimentos"
						+ "\ne intervenções médicas, você também ajuda pessoas com doenças" 
						+ "\ncrônicas graves que precisam de transfusões recorrentes.");
		
		System.out.println();
		System.out.println("Além disso, uma pessoa adulta tem em média 5 litros de sangue"
						+ "\ne em cada doação o máximo de sangue retirado é de 450ml.");
		
		System.out.println();
		System.out.println("Mas infelizmente… menos de 2% dos brasileiros doam sangue.");
		
		System.out.println();
		System.out.println("Segundo uma pesquisa mundial feita pela farmacêutica Abbott," 
						+ "\no motivo das pessoas não doarem é não saberem como doar e "
						+ "\nterem medo do procedimento.");
		
		System.out.println();
		System.out.println("Como você chegou até aqui, significa que quer doar e com" 
						+ "\ncerteza tem amigos e familiares aptos a doarem também, "
						+ "\nentão compartilhe este programa para o máximo de pessoas que puder!");
	}
	
	public static void mostraAPositivo() {
		System.out.println("Você pode doar para pessoas com sangue AB+ e A+, e pode receber sangue "
				+ "\nde pessoas A+, A-, O+ e O-. De acordo com o hemocentro Pró-Sangue de São Paulo, "
				+ "\no estoque de sangue A+ está ESTÁVEL no momento, ufa! Mas não significa que ficará "
				+ "\nassim para sempre, então responda nosso questionário para saber se você pode ser doador.");
	}
	
	
	public static void mostraANegativo() {
		System.out.println("Você pode doar para pessoas com sangue A+, A-, AB+ e AB-, e pode receber sangue "
				+ "\nde pessoas A- e O-. De acordo com o hemocentro Pró-Sangue de São Paulo, o estoque de sangue "
				+ "\nA- está EM ALERTA, então que tal responder o questionário para saber se você pode doar?");
	}
	
	public static void mostraBPositivo() {
		System.out.println("Você pode doar para pessoas com sangue B+ e AB+, e pode receber sangue de pessoas "
				+ "\nB+, B-, O+ e O-. De acordo com o hemocentro Pró-Sangue de São Paulo, o estoque de sangue B+ "
				+ "\nestá ESTÁVEL no momento, ufa! Mas não significa que ficará assim para sempre, então responda "
				+ "\nnosso questionário para saber se você pode ser doador.");
	}
	
	public static void mostraBNegativo() {
		System.out.println("Você pode doar para pessoas com sangue B+, B-, AB+ e AB-, e pode receber de pessoas "
				+ "\nB- e O-. De acordo com o hemocentro Pró-Sangue de São Paulo, o estoque de sangue B- está "
				+ "\nEM ESTADO CRÍTICO, portanto vamos agilizar seu questionário para que você possa saber se pode doar!");
	}
	
	public static void mostraABPositivo() {
		System.out.println("Você só pode doar para pessoas com sangue AB+, mas pode receber de todos os outros "
				+ "\ntipos sanguíneos, por isso é conhecido como receptor universal. De acordo com o hemocentro "
				+ "\nPró-Sangue de São Paulo, o estoque de sangue AB+ está ESTÁVEL no momento, ufa! Mas não significa "
				+ "\nque ficará assim para sempre, então responda nosso questionário para saber se você pode ser doador.");
	}
	
	public static void mostraABNegativo() {
		System.out.println("Você pode doar para pessoas com sangue AB+ e AB-, e pode receber de pessoas "
				+ "\nA-, B-, O- e AB-. De acordo com o hemocentro Pró-Sangue de São Paulo, o estoque de sangue AB- está "
				+ "\nESTÁVEL no momento, ufa! Mas não significa que ficará assim para sempre, então responda nosso "
				+ "\nquestionário para saber se você pode ser doador.");
	}
	
	public static void mostraOPositivo() {
		System.out.println("Você pode doar para pessoas com sangue A+, B+, O+ e AB+, e pode receber de pessoas O+ e O-. "
				+ "\nDe acordo com o hemocentro Pró-Sangue de São Paulo, o estoque de sangue O+ está EM ESTADO CRÍTICO, "
				+ "\nportanto vamos agilizar seu questionário para que você possa saber se pode doar!");
	}
	
	public static void mostraONegativo() {
		System.out.println("Você pode doar para pessoas com todos os tipos sanguíneos e é conhecido como doador universal,"
				+ "\nmas só pode receber de pessoas com sangue O-. De acordo com o hemocentro Pró-Sangue de São Paulo, o "
				+ "\nestoque de sangue O- está EM ESTADO CRÍTICO, portanto vamos agilizar seu questionário para que você "
				+ "\npossa saber se pode doar!");
	}
	

}
