package decisao;

import javax.swing.JOptionPane;

/*
 * 		 * Exercicio 2:
		 * Considere receber a quantidade de di?rias de um hotel e o valor
		 * da di?ria. Sobre a di?ria haver? uma taxa que depende da quantidade
		 * de di?rias.
		 * Se a quantidade de di?rias for maior que 10 a taxa ser? de 5%
		 * Se a quantidade estiver entre 5 e 10 a taxa ser? de 8%
		 * Se a quantidade de diarias for menor que 5 a taxa ser? de 10%
		 * Exiba o valor final.
 */
public class Exercicio2 {
public static void main(String[] args) {
	short diarias = Short.parseShort(JOptionPane.showInputDialog("Digite Quantidade de Di?rias"));
	double vldia = Double.parseDouble(JOptionPane.showInputDialog("Digite valor das di?rias"));
	if (diarias>10) {
		System.out.println("Valor Total = " + ((diarias*vldia)*1.05));
	} else if (diarias >=5 && diarias<=10) {
		System.out.println("Valor Total = " + ((diarias*vldia)*1.08));
	} else if (diarias <5) {
		System.out.println("Valor Total = " + ((diarias*vldia)*1.10));
	}	
	
	
	
	
	
	
}



}
