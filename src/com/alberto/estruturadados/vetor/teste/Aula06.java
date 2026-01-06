package com.alberto.estruturadados.vetor.teste;

import com.alberto.estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);

		vetor.adiciona("Elemento 01");
		vetor.adiciona("Elemento 02");
		vetor.adiciona("Elemento 03");
		vetor.adiciona("Elemento 04");
		
		System.out.println(vetor.busca("elemento 04"));
		System.out.println(vetor.toString());
	}

}
