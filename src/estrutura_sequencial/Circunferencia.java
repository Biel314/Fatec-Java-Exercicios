/*11- Receba o raio de uma circunferência. Calcule e mostre o comprimento da
circunferência. */

package estrutura_sequencial;

import javax.swing.JOptionPane;

public class Circunferencia {

	public static void main(String[] args) {
		double raio, c;
		
		raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio: "));
		
		c = (2 * 3.14 * raio);
		
		JOptionPane.showMessageDialog(null, "O valor da circunferencia é: " + c);

	}

}
