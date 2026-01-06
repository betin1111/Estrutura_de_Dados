package com.alberto.estruturadados.vetor.teste;

import com.alberto.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vetor vetor = new Vetor(4);

		vetor.adiciona("Elemento 01");
		vetor.adiciona("Elemento 02");
		vetor.adiciona("Elemento 03");
		vetor.adiciona("Elemento 04");
		vetor.adiciona("Elemento x");
		
	    int pos = vetor.busca("Elemento 01");
		
		System.out.println(vetor.busca(4));
		System.out.println(pos);
		
	}

}
