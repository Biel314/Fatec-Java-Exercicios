/*14- Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo. */

package estrutura_sequencial;

import javax.swing.JOptionPane;

public class AngulosTriangulo {

	public static void main(String[] args) {
		int ang1, ang2, ang3;
		
		ang1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro angulo do triangulo: "));
		ang2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo angulo do triangulo: "));
		
		ang3 = 180 - (ang1 + ang2);
		
		JOptionPane.showMessageDialog(null, "O terceiro angulo do triangulo é: " + ang3);
	}

}
