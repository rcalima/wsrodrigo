package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {
public static void main(String[] args) {
	
	/*
	 * Miss�o 1
	 * O jogador 1 digita um n�mero inteiro
	 * a partir dai o Jogador 2 deve advinhar o n�mero
	 * somente quando ele acertar dever� aparecer a mensagem 
	 * "Parab�ns, voc� acertou"
	 * 
	 * Miss�o 2
	 * Acrescente dicas para o Jogador2, informando se o n�mero que ele tem que advinhar
	 * � maior ou menor que ele est� digitando
	 * 
	 */
	int jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:  "));
	int jogador2 = 0;
	int contador=0;
	do {
		jogador2 = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o n�mero:  "));
		contador=contador+1;
		if  (jogador2>jogador1) {
			System.out.println("Digite um n�mero menor!!!");
		} else if (jogador2<jogador1) {
			System.out.println("Digite um n�mero maior!!!");
		}

	}while (jogador1!=jogador2);
	JOptionPane.showMessageDialog(null,"Parab�ns voc� acertou com "+ contador + "tentativa(s)");






}
}
