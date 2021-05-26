package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
	
		/*
		 * Identificadores (nomes dos elementos que criamos: variáveis, classes,pacotes, etcs.
		 * - Regras:
		 * 1º Não começarás com número. Exemplo: 1berto(erro) Humberto(correto)
		 * 2º Não utilizarás palavras reservadas. Exemplo: int, void, if, const, double
		 * 3º Não farás uso de caracteres especiais. Exemplo: acento, arroba, espaço
		 * 
		 * - Padrões:
		 * 1º CamelCase: da segunda palavra em diante (em uma composição) deve começar com letra maiuscula
		 * 				certo - dataNascimento  | errado - datanascimento  
		 * 				certo - data_nascimento | errado - data_Nascimento
		 * 2º UML: é responsável por padronizar elementos da Orientação a Objetos
		 * 			- Toda classe deve começar com letra maiúscula
		 * 			- Toda variável/pacote deve começar com letra minúscula
		 * 			- Todo método deve começar com letra minuscula e deve ser seguido de parentêses.
		 * xpto => é uma variável
		 * Xpto => é uma classe
		 * xpto() => é uma função
		 * Xpto.xpto() => é um método
		 */
	
	String email = "rcal06@TERRA.com.br";
	System.out.println("Original:  "+email);
	System.out.println("Minuscula:  "+email.toLowerCase());
	System.out.println("Maiuscula:  "+email.toUpperCase());
	System.out.println("Tem arroba? "+email.contains("@"));
	System.out.println("Posição do @"+email.indexOf("@"));
	System.out.println("Quantidade Caracteres: "+email.length());
	System.out.println("Do 2 ao ate o quinto caracter: "+email.substring(1,5));
	System.out.println("Primeira metade: "+email.substring(0,email.length()/2));
	System.out.println("Usuário:"+email.substring(0,email.indexOf("@")));
	System.out.println("Servidor: "+email.substring(email.indexOf("@")+1, email.length()).toLowerCase());
	System.out.println("Primeiro caracter: "+ email.toUpperCase().charAt(0));
}
}
