package decisao;

import javax.swing.JOptionPane;

/*
 * 		 * Exercicio 3:
		 * Receba o valor do sal?rio bruto, o nome de um colaborador e 
		 * a qtde de faltas.
		 * Se n?o houver faltas o salario bruto receber? um aumento de 2%.
		 * Calcule o valor do INSS sobre o sal?rio bruto.
		 * Exiba no final o sal?rio bruto, e o sal?rio liquido (retirando
		 * o INSS e 8% do FGTS)
 */



public class Exercicio3 {
public static void main(String[] args) {
	
	String nome = JOptionPane.showInputDialog("Nome do colaborador: ").toUpperCase();
	float salb = Float.parseFloat(JOptionPane.showInputDialog("Digite o sal?rio Bruto: "));
	byte faltas = Byte.parseByte(JOptionPane.showInputDialog("Digite o n?mero de Faltas: "));
	if (faltas==0) {
		salb = salb* (float)1.02;		
	}
	float inss=0; //criou uma variavel
	if (salb<=1100){
		inss = salb * (float) 0.07;
	}	else if (salb>1100 && salb<=2203.48) {
		inss = salb * (float) 0.09;	
		}else if  (salb>2203.48 && salb<=3305.22) {
			inss = salb * (float) 0.12;	
		}else inss = salb * (float) 0.14;	
	
		System.out.println("Sal?rio Bruto:  "+ salb);
		System.out.println("Sal?rio L?quido: " +(salb - inss - salb*0.08));
		
	}
		
		
		
		
		
	
	

}
