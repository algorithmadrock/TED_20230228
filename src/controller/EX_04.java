/*
RESUMO      : Exercício 04, Função recursiva de inversão de palavras
PROGRAMADORA: Luiza Felix
DATA        : 29/02/2023
 */

package controller;

import javax.swing.JOptionPane;

public class EX_04 {

	public void base() {
		String texto = JOptionPane.showInputDialog("Digite o texto para ser invertido.");
//		System.out.println(texto.length() + " " + texto.substring(0, 1));
		JOptionPane.showMessageDialog(null, texto + " invertido fica: " + recursiva(texto, (texto.length() - 1)));
	}

	private static String recursiva(String t, int posicao) {
		if (posicao == 0) {
			return t.substring(posicao, posicao + 1);
//			essa é a ultima posição legível de uma string, (igual em vetores), até chegar aqui todas as letras já foram "abertas" na função recursiva
		} else {
			return t.substring(posicao, posicao + 1) + recursiva(t, posicao - 1);
//			assim, a posição 0 (primeira letra) ocupa a última posição, já devolvendo a palavra invertida, se a palvra digitada for "saúde" a "base" da função seria t.substring(1,1) + "e".
		}
	}

}
