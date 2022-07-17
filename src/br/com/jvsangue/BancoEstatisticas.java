package br.com.jvsangue;

public class BancoEstatisticas {
	

	public static void mostraEstGerais() {
		System.out.println();
		
		System.out.println("VocÃª sabia que uma doaÃ§Ã£o de sangue pode salvar atÃ© 4 vidas? "
				+ "\nAlÃ©m de ajudar pessoas que precisam de sangue para procedimentos e intervenÃ§Ãµes mÃ©dicas, "
				+ "\nvocÃª tambÃ©m ajuda pessoas com doenÃ§as crÃ´nicas graves que precisam de transfusÃµes recorrentes.");
		
		System.out.println();
		System.out.println("AlÃ©m disso, uma pessoa adulta tem em mÃ©dia 5 litros de sangue e em cada doaÃ§Ã£o o "
				+ "\nmÃ¡ximo de sangue retirado Ã© de 450ml.");
		
		System.out.println();
		System.out.println("Mas infelizmente... menos de 2% dos brasileiros doam sangue.");
		
		System.out.println();
		System.out.println("Segundo uma pesquisa mundial feita pela farmacÃªutica Abbott,"
				+ "\n o motivo das pessoas nÃ£o doarem Ã© nÃ£o saberem como doar e terem medo do procedimento.");
		
		System.out.println();
		System.out.println("Como vocÃª chegou atÃ© aqui, significa que quer doar e com certeza tem amigos e "
				+ "\nfamiliares aptos a doarem tambÃ©m, entÃ£o espalhe esse programa para o mÃ¡ximo de pessoas que puder!");
	}
	
	public static void mostraAPositivo() {
		System.out.println("VocÃª pode doar para pessoas com sangue AB+ e A+, e pode receber sangue de pessoas A+, A-, O+ e O-. "
				+ "\nDe acordo com o hemocentro PrÃ³-Sangue de SÃ£o Paulo, o estoque de sangue A+ estÃ¡ ESTÃ�VEL no momento, ufa! "
				+ "\nMas nÃ£o significa que ficarÃ¡ assim para sempre, entÃ£o responda nosso questionÃ¡rio para saber se vocÃª pode ser doador.");
	}
	
	
	public static void mostraANegativo() {
		System.out.println("VocÃª pode doar para pessoas com sangue A+, A-, AB+ e AB-, e pode receber sangue "
                + "\nde pessoas A- e O-. De acordo com o hemocentro PrÃ³-Sangue de SÃ£o Paulo, o estoque de sangue "
                + "\nA- estÃ¡ EM ALERTA, entÃ£o que tal responder o questionÃ¡rio para saber se vocÃª pode doar?");
	}
	
	public static void mostraBPositivo() {
		System.out.println("VocÃª pode doar para pessoas com sangue B+ e AB+, e pode receber sangue de pessoas "
                + "\nB+, B-, O+ e O-. De acordo com o hemocentro PrÃ³-Sangue de SÃ£o Paulo, o estoque de sangue B+ "
                + "\nestÃ¡ ESTÃ�VEL no momento, ufa! Mas nÃ£o significa que ficarÃ¡ assim para sempre, entÃ£o responda "
                + "\nnosso questionÃ¡rio para saber se vocÃª pode ser doador.");
	}
	
	public static void mostraBNegativo() {
		System.out.println("VocÃª pode doar para pessoas com sangue B+, B-, AB+ e AB-, e pode receber de pessoas "
                + "\nB- e O-. De acordo com o hemocentro PrÃ³-Sangue de SÃ£o Paulo, o estoque de sangue B- estÃ¡ "
                + "\nEM ESTADO CRÃ�TICO, portanto vamos agilizar seu questionÃ¡rio para que vocÃª possa saber se pode doar!");
	}
	
	public static void mostraABPositivo() {
		System.out.println("VocÃª sÃ³ pode doar para pessoas com sangue AB+, mas pode receber de todos os outros "
                + "\ntipos sanguÃ­neos, por isso Ã© conhecido como receptor universal. De acordo com o hemocentro "
                + "\nPrÃ³-Sangue de SÃ£o Paulo, o estoque de sangue AB+ estÃ¡ ESTÃ�VEL no momento, ufa! Mas nÃ£o significa "
                + "\nque ficarÃ¡ assim para sempre, entÃ£o responda nosso questionÃ¡rio para saber se vocÃª pode ser doador.");
	}
	
	public static void mostraABNegativo() {
		System.out.println("VocÃª pode doar para pessoas com sangue AB+ e AB-, e pode receber de pessoas "
                + "\nA-, B-, O- e AB-. De acordo com o hemocentro PrÃ³-Sangue de SÃ£o Paulo, o estoque de sangue AB- estÃ¡ "
                + "\nESTÃ�VEL no momento, ufa! Mas nÃ£o significa que ficarÃ¡ assim para sempre, entÃ£o responda nosso "
                + "\nquestionÃ¡rio para saber se vocÃª pode ser doador.");
	}
	
	public static void mostraOPositivo() {
		System.out.println("VocÃª pode doar para pessoas com sangue A+, B+, O+ e AB+, e pode receber de pessoas O+ e O-. "
                + "\nDe acordo com o hemocentro PrÃ³-Sangue de SÃ£o Paulo, o estoque de sangue O+ estÃ¡ EM ESTADO CRÃ�TICO, "
                + "\nportanto vamos agilizar seu questionÃ¡rio para que vocÃª possa saber se pode doar!");
	}
	
	public static void mostraONegativo() {
		System.out.println("VocÃª pode doar para pessoas com todos os tipos sanguÃ­neos e Ã© conhecido como doador universal,"
                + "\nmas sÃ³ pode receber de pessoas com sangue O-. De acordo com o hemocentro PrÃ³-Sangue de SÃ£o Paulo, o "
                + "\nestoque de sangue O- estÃ¡ EM ESTADO CRÃ�TICO, portanto vamos agilizar seu questionÃ¡rio para que vocÃª "
                + "\npossa saber se pode doar!");
	}
	

}
