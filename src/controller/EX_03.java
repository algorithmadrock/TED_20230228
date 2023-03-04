/*
RESUMO      : Exercício 03, Função recursiva de contagem de dígitos
PROGRAMADORA: Luiza Felix
DATA        : 29/02/2023
 */

package controller;

import javax.swing.JOptionPane;

public class EX_03 {
	
	public EX_03() {
		super();
	}

	public void base() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro. "));

		JOptionPane.showMessageDialog(null, "O número tem " + recursiva(numero, 0) + " dígito(s)");
	}

	private static int recursiva(int n, int digito) {
		if ((n / (Math.pow(10, digito))) == 0) {
			return digito;
//			se o número é "divisível" (inteiros entendem decimal como "0") por 10^digito, não há digitos depois dele, todos acabaram sendo "computados" e número inteiro se transforma em decimal	
		} else {
			return recursiva(n / 10, digito + 1);
//			 n é divido por 10 para que o número anterior (unidade) não seja contado novamente, se a entrada fosse (3456, 0) , na próxima chamada da função ela seria (345, 1), já "contando" o 6
		}
	}

}
