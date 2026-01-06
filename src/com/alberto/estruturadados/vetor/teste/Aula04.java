package com.alberto.estruturadados.vetor.teste;

import java.util.Scanner;

import com.alberto.estruturadados.vetor.Vetor;

public class Aula04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vetor vetor = new Vetor(5);

		vetor.adiciona("Elemento 01");
		vetor.adiciona("Elemento 02");
		vetor.adiciona("Elemento 03");
		vetor.adiciona("Elemento 04");

		boolean logic = vetor.adiciona("elemento x");

		System.out.println(vetor.tamanho());
		System.out.println(logic + "\n");
		System.out.println("====================================\n\n");
		System.out.println(vetor.toString());

		sc.close();

	}

}
