/*4- Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit */

package estrutura_sequencial;

import javax.swing.JOptionPane;

public class Fahrenheit {
	public static void main (String [] args) {
		int c;
		double f;
		
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em Celsius: "));
		
		f = ((1.8*c)+32);
		
		JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + f);
		
	}
}
