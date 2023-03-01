/*
RESUMO      : Exercício 02, Função recursiva de busca por números negativos dentro do vetor
PROGRAMADORA: Luiza Felix
DATA        : 29/02/2023
 */

package controller;

import java.util.Random;
import javax.swing.JOptionPane;

public class EX_02 {

	public void base() {

		int tamanho = (Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:")) - 1);
		int[] vetor = new int[tamanho + 1];
//		o tamanho do vetor é -1 menor para que na função recursiva o vetor não acabe estourando assim que inicia, as maiores posições do vetor sempre são -1 que seu tamanho declarado

		Random random = new Random();

		for (int i = 0; i < tamanho; i++) {
			vetor[i] = random.nextInt(-100, 100);
		}

		JOptionPane.showMessageDialog(null,
				"Nesse vetor há " + recursiva(vetor, tamanho) + " numeros negativos gerados aleatoriamente");
	}

	private static int recursiva(int[] vetor, int t) {
		if (t < 0) {
			return 0;
//			não existem posições menores que 0 em um vetor, e sem posição de referência não dá para ter número negativo armazenado (por isso o return 0)
		} else {
			if (vetor[t] < 0) {
				return 1 + recursiva(vetor, t - 1);
			} else {
				return 0 + recursiva(vetor, t - 1);
			}
//			o código soma as casas com números negativos (valem 1) e as que não tem (que valem 0), começando da "casa -1", sempre que se desdobra vale 0, mas o próximo retorno depende do valor contido em vetor[0].
		}
	}
}