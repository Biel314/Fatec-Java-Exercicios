
/*
   Nome do programa: DiferencaDouble
   Objetivo: Receba 2 números reais. Calcule e mostre a diferença desses valores.
   Nome do Programador: Gabriel Ordonho
   Data de desenvolvimento: 16/02/2025
   Exercicio 10
*/

package estrutura_sequencial;

import javax.swing.JOptionPane;

public class DiferencaDouble {

	public static void main(String[] args) {
		double n1, n2, dif;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		dif = (n1 - n2);
		
		JOptionPane.showMessageDialog(null, String.format("A diferença entre os dois números reais é: %.2f", dif));
		
	}

}
