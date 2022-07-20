package br.com.jvsangue;

public class BancoEstatisticas {
	

	public void mostraEstGerais() {
		System.out.println();
		
		System.out.println("Você sabia que uma doação de sangue pode salvar até 4 vidas? "
				+ "\nAlém de ajudar pessoas que precisam de sangue para procedimentos e intervenções médicas, "
				+ "\nvocê também ajuda pessoas com doenças crônicas graves que precisam de transfusões recorrentes.");
		
		System.out.println();
		System.out.println("Além disso, uma pessoa adulta tem em média 5 litros de sangue e em cada doação o "
				+ "\nmáximo de sangue retirado é de 450ml.");
		
		System.out.println();
		System.out.println("Mas infelizmente... menos de 2% dos brasileiros doam sangue.");
		
		System.out.println();
		System.out.println("Segundo uma pesquisa mundial feita pela farmacêutica Abbott,"
				+ "\no motivo das pessoas não doarem é não saberem como doar e terem medo do procedimento.");
		
		System.out.println();
		System.out.println("Como você chegou até aqui, significa que quer doar e com certeza tem amigos e "
				+ "\nfamiliares aptos a doarem também, então espalhe esse programa para o máximo de pessoas "
				+ "\nque puder!");
	}
	
	public void mostraAPositivo() {
		System.out.println("Você pode doar para pessoas com sangue AB+ e A+, e pode receber sangue de pessoas "
				+ "A+, A-, O+ e O-. De acordo com o hemocentro Pró-Sangue de São Paulo, o estoque de sangue A+ "
				+ "\nestá ESTÁVEL no momento, ufa! Mas não significa que ficará assim para sempre, então responda "
				+ "\nnosso questionário para saber se você pode ser doador.");
	}
	
	
	public void mostraANegativo() {
		System.out.println("Você pode doar para pessoas com sangue A+, A-, AB+ e AB-, e pode receber sangue "
                + "\nde pessoas A- e O-. De acordo com o hemocentro Pró-Sangue de São Paulo, o estoque de sangue "
                + "\nA- está EM ALERTA, então que tal responder o questionário para saber se você pode doar?");
	}
	
	public void mostraBPositivo() {
		System.out.println("Você pode doar para pessoas com sangue B+ e AB+, e pode receber sangue de pessoas "
                + "\nB+, B-, O+ e O-. De acordo com o hemocentro Pró-Sangue de São Paulo, o estoque de sangue B+ "
                + "\nestá ESTÁVEL no momento, ufa! Mas não significa que ficará assim para sempre, então responda "
                + "\nnosso questionário para saber se você pode ser doador.");
	}
	
	public void mostraBNegativo() {
		System.out.println("Você pode doar para pessoas com sangue B+, B-, AB+ e AB-, e pode receber de pessoas "
                + "\nB- e O-. De acordo com o hemocentro Pró-Sangue de São Paulo, o estoque de sangue B- está "
                + "\nEM ESTADO CRÍTICO, portanto vamos agilizar seu questionário para que você possa saber se "
                + "\npode doar!");
	}
	
	public void mostraABPositivo() {
		System.out.println("Você só pode doar para pessoas com sangue AB+, mas pode receber de todos os outros "
                + "\ntipos sanguíneos, por isso é conhecido como receptor universal. De acordo com o hemocentro "
                + "\nPró-Sangue de São Paulo, o estoque de sangue AB+ está ESTÁVEL no momento, ufa! Mas não significa "
                + "\nque ficará assim para sempre, então responda nosso questionário para saber se você pode ser doador.");
	}
	
	public void mostraABNegativo() {
		System.out.println("Você pode doar para pessoas com sangue AB+ e AB-, e pode receber de pessoas "
                + "\nA-, B-, O- e AB-. De acordo com o hemocentro Pró-Sangue de São Paulo, o estoque de sangue "
                + "\nAB- está ESTÁVEL no momento, ufa! Mas não significa que ficará assim para sempre, "
                + "\nentão responda nosso questionário para saber se você pode ser doador.");
	}
	
	public void mostraOPositivo() {
		System.out.println("Você pode doar para pessoas com sangue A+, B+, O+ e AB+, e pode receber de pessoas O+ e O-. "
                + "\nDe acordo com o hemocentro Pró-Sangue de São Paulo, o estoque de sangue O+ está "
                + "\nEM ESTADO CRÍTICO, portanto vamos agilizar seu questionário para que você possa saber se pode doar!");
	}
	
	public void mostraONegativo() {
		System.out.println("Você pode doar para pessoas com todos os tipos sanguíneos e é conhecido como doador universal,"
                + "\nmas só pode receber de pessoas com sangue O-. De acordo com o hemocentro Pró-Sangue de São Paulo, o "
                + "\nestoque de sangue O- está EM ESTADO CRÍTICO, portanto vamos agilizar seu questionário para que você "
                + "\npossa saber se pode doar!");
	}
	

}
