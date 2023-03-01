/*
RESUMO      : "Menu" dos exercicios para facilitar a execução
PROGRAMADORA: Luiza Felix
DATA        : 29/02/2023
 */

package view;

import controller.*;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

		EX_01 umme = new EX_01();
		EX_02 dois = new EX_02();
		EX_03 tres = new EX_03();
		EX_04 qatro = new EX_04();
		int opcao;

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite o exerxício para exibição:\n\n 1) Crie uma função recursiva que exiba o resultado do fatorial de um número.\r\n(Pela limitação da recursividade, o número de entrada deverá ser baixo para não dar estouro (limite de entrada = 12))\n 2) Crie uma função recursiva que exiba o total de elementos negativos de um vetor de inteiros, de N posições, passado como parâmetro.\n 3) Crie uma função recursiva que exiba a quantidade de dígitos de um número inteiro passado como parâmetro.\n 4) Crie uma função recursiva que exiba o resultado da inversão de uma cadeia de caracteres entrada = teste ; saída = etset)\n\n Para SAIR prssione 0."));
			switch (opcao) {
			case 1:
				umme.base();
				break;
			case 2:
				dois.base();
				break;
			case 3:
				tres.base();
				break;
			case 4:
				qatro.base();
				break;
			case 0:
				System.out.println("Programa finalizado com sucesso! ");
				break;
			default:
				System.out.println("!!! ERRO: DIGITE UMA OPÇÃO VÁLIDA!!!");
			}
		} while (opcao != 0);
	}

}