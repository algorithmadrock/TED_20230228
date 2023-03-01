/*
RESUMO      : Exercício 01, Função recursiva de calculo fatorial
PROGRAMADORA: Luiza Felix
DATA        : 29/02/2023
 */

package controller;

import javax.swing.JOptionPane;

public class EX_01 {

	public void base() {
		int valor;

		do {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para o calculo de fatorial."));
		} while (valor > 12);
		JOptionPane.showMessageDialog(null, valor + "! =" + recursiva(valor));
	}

	private int recursiva(int n) {
		if (n == 0) {
			return 1;
//			 0! é igual a 1, valor em comum entre todos os fatoriais. quando n for igual a 0 não terá nenhum outro fatorial para ser calculado.
		}

		else {
			return n * recursiva(n - 1);
//			o return mantém todos os n's das chamadas da função, quando ele chega em 0, retorna o 1 e e vai substituindo as chamadas da função por números, começando sempre do "1 * recursiva(0)", uma espécie de 1*1.
		}
	}

}
