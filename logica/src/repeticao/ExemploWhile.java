package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {
		public static void main(String[] args) {
	
			String email = JOptionPane.showInputDialog("Digite o email").toLowerCase();
			if (email.contains("@")==false) {
				email=JOptionPane.showInputDialog("Digite o email novamente").toLowerCase();
			}
			System.out.println("Usu�rio:  "+email.substring(0,email.indexOf("@")));
			
	
	
	
	
	
	
	
	
	
	
	
	
}
}
