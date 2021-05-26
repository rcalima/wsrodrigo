package decisao;

import javax.swing.JOptionPane;

/*
 * 		 * Exercicio 1:
		 * Solicite dois valores e um operador matemático 
		 * (+, -, / ou *)
		 * Dependendendo do operador que foi digitado realize o calculo
		 * e exiba o resultado
		 * Dica.: Se utilizar String a comparação de String deve ser:
		 * if (variavel.equals("valorasercomparado")){
 */

public class Exercicio1 {
public static void main(String[] args) {
	
	Double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Valor 1: "));
	Double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Valor 2: "));
	char oper = JOptionPane.showInputDialog("Operador: ").charAt(0);
	if (oper=='*') {
		System.out.println("Resultado: " + (valor1*valor2));
	} else if (oper=='+') {
		System.out.println("Resultado: " + (valor1+valor2));
	} else if (oper=='-') {
		System.out.println("Resultado: " + (valor1-valor2));
	} else if (oper=='/') {
		System.out.println("Resultado: " + (valor1/valor2));
	} else
		System.out.println("Operador Invalido");

		
		
} 

}
