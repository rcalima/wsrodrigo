package repeticao;

import javax.swing.JOptionPane;

/*
 * Pe�a para o usu�rio digitar o valor da tabuada que ele deseja visualizar.
 * Monte o la�o para que apresente o resultado da tabuada da seguinte forma:
 * n�mero x O = resultado
 * numero x 1 = resultado
 * ... x 100 = resultado
 */

public class Exercicio1 {
public static void main(String[] args) {
	
	int tabuada=Integer.parseInt(JOptionPane.showInputDialog("Tabuada"));
	int contador=0;
	while(contador<=100) {
	System.out.println(tabuada+"x"+contador+"="+(tabuada*contador));
	contador++;
	}
	
	
	
}
}
