package variaveis;

import javax.swing.JOptionPane;

public class CaluculoProduto {
public static void main(String[] args) {
	
	String produto = JOptionPane.showInputDialog("Produto");
	int qtde = Integer.parseInt(JOptionPane.showInputDialog("Qtde"));
	float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
	float total = valor*qtde;
	float imposto = total* (float) 0.17; // cast => casting (ajuste de tamanho)
	System.out.println("Total...: " + total);
	System.out.println("Imposto.: " + (total*0.17));
	
	
}
}
