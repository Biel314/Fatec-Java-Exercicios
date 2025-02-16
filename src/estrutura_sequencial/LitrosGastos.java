/*17 - Calcule a quantidade de litros gastos em uma viagem, sabendo que o
automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média. */

/* revisão necessaria!!! */

package estrutura_sequencial;

import javax.swing.JOptionPane;

public class LitrosGastos {

	public static void main(String[] args) {
		double tPercurso, velocMedia, qtdLitros, d;
		
		tPercurso = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo do percurso: "));
		velocMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média: "));
		
		d = (tPercurso * velocMedia);
		 
		qtdLitros = (d / 12);
		
		JOptionPane.showMessageDialog(null, "A quantidade de litros gastos em uma viagem é de: " + qtdLitros);
	}

}
