package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {

	public static void main(String[] args) {
		
		/*
		 * Capture o nome de uma pessoa e a idade.
		 * De acordo com as leis eleitorais apresente uma das mensagens abaixo:
		 * - "Seu voto � obrigat�rio"
		 * - "Seu voto � facultativo"
		 * - "Voc� n�o pode votar"
		 * 
		 */
		
		String nome = JOptionPane.showInputDialog("Informe o seu nome:  ").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Informe a sua idade:  "));
		
		System.out.println("Nome:  "+nome);
		System.out.println("Idade: "+idade);
		
		if (idade<16) {
			System.out.println("Voc� n�o pode votar!");
		}
		
		if (idade==16 || idade==17 || idade >=70) {
			System.out.println("Seu voto � facultativo");
		}
		if (idade>=18 && idade<70) {
		System.out.println("Seu voto � obrigat�rio");
		}
	

	
	}
}
