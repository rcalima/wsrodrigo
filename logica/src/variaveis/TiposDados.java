package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {
	//main () ? o start point de uma aplica??o JAVA
	// chave de igni??o do carro
public static void main(String[] args) {
//Sintaxe: <Tipo de dado> <nome da viar?vel> = <dado>;
	String nome =JOptionPane.showInputDialog("Digite o seu nome");
	int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));
	double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura:"));
	double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso:"));
	double imc = peso / (altura * altura);
	
	System.out.println("Nome:"+nome);
	System.out.println("Idade:"+idade);
	System.out.println("Altura:"+altura);
	System.out.println("IMC....:" + imc);
	
	
	/* 
	 * Alfanum?rico: ? um texto, parte de um texto ou um n?mero
	 * que n?o ser? utilizado em opera??e matem?ticas
	 * Em Javan?s = String
	 * 
	 * Num?rico: representa um dado que PODE ser utilizado em 
	 * express?es matem?ticas
	 * CEP (Aplica??o dos correios)
	 * CPF (Aplica??o da Receita Federal)
	 * Funcional (entre colaboradores do Ita?)
	 * RM (entre alunos da faculdade)
	 * Em Javan?s = 
	 * - int - n?meros inteiros
	 * - double - n?meros reais (com casas decimais)
	 */
	
	
	
	
	/* Deixar as chaves embaixo
	 * 
	 */
}
}
