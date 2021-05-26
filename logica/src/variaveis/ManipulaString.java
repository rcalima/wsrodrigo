package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
	
		/*
		 * Identificadores (nomes dos elementos que criamos: vari�veis, classes,pacotes, etcs.
		 * - Regras:
		 * 1� N�o come�ar�s com n�mero. Exemplo: 1berto(erro) Humberto(correto)
		 * 2� N�o utilizar�s palavras reservadas. Exemplo: int, void, if, const, double
		 * 3� N�o far�s uso de caracteres especiais. Exemplo: acento, arroba, espa�o
		 * 
		 * - Padr�es:
		 * 1� CamelCase: da segunda palavra em diante (em uma composi��o) deve come�ar com letra maiuscula
		 * 				certo - dataNascimento  | errado - datanascimento  
		 * 				certo - data_nascimento | errado - data_Nascimento
		 * 2� UML: � respons�vel por padronizar elementos da Orienta��o a Objetos
		 * 			- Toda classe deve come�ar com letra mai�scula
		 * 			- Toda vari�vel/pacote deve come�ar com letra min�scula
		 * 			- Todo m�todo deve come�ar com letra minuscula e deve ser seguido de parent�ses.
		 * xpto => � uma vari�vel
		 * Xpto => � uma classe
		 * xpto() => � uma fun��o
		 * Xpto.xpto() => � um m�todo
		 */
	
	String email = "rcal06@TERRA.com.br";
	System.out.println("Original:  "+email);
	System.out.println("Minuscula:  "+email.toLowerCase());
	System.out.println("Maiuscula:  "+email.toUpperCase());
	System.out.println("Tem arroba? "+email.contains("@"));
	System.out.println("Posi��o do @"+email.indexOf("@"));
	System.out.println("Quantidade Caracteres: "+email.length());
	System.out.println("Do 2 ao ate o quinto caracter: "+email.substring(1,5));
	System.out.println("Primeira metade: "+email.substring(0,email.length()/2));
	System.out.println("Usu�rio:"+email.substring(0,email.indexOf("@")));
	System.out.println("Servidor: "+email.substring(email.indexOf("@")+1, email.length()).toLowerCase());
	System.out.println("Primeiro caracter: "+ email.toUpperCase().charAt(0));
}
}
