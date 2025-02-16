/*3- Receba a base e a altura de um triângulo. Calcule e mostre a sua área. */

package estrutura_sequencial;

import javax.swing.JOptionPane;

public class AreaTriangulo {

	public static void main (String [] args) {
		
		double area, b, h;
		
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triangulo: "));
		
		h = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triangulo: "));
		
		area = ((b*h)/2);
		
		JOptionPane.showMessageDialog(null, "A Área do triangulo é: " + area);
	}
}
