/*1- Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.*/

package estrutura_sequencial;

import javax.swing.JOptionPane;

public class AreaQuadrado {
	public static void main (String [] args) {
		
		double lado, area;
		
	lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado do quadrado: "));
	
	area = lado * lado;
	
	JOptionPane.showMessageDialog(null, "A area do quadrado é: " + area);
		
	}
}
