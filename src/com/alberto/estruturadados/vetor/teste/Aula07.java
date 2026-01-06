package com.alberto.estruturadados.vetor.teste;

import com.alberto.estruturadados.vetor.Vetor;

public class Aula07 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);

		vetor.adiciona("A");// 0
		vetor.adiciona("B");// 1
		vetor.adiciona("C");// 2
		vetor.adiciona("D");// 3
		vetor.adiciona("F");// 4
		vetor.adiciona("H");// 5
		vetor.adiciona("I");// 6
		vetor.adiciona("J");// 7

		vetor.adiciona(4, "E");

		System.out.println(vetor);

		vetor.adiciona(6, "G");

		System.out.println(vetor);
	}

}
