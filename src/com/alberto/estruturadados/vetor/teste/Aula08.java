package com.alberto.estruturadados.vetor.teste;


import com.alberto.estruturadados.vetor.Vetor;

public class Aula08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vetor vetor = new Vetor(3);

		vetor.adiciona("A");// 0
		vetor.adiciona("B");// 1
		vetor.adiciona("C");// 2
	    boolean reti =vetor.adiciona("D");// 3
		boolean logic = vetor.adiciona("F");// 4
		
		System.out.println(vetor);
		System.out.println(reti);
		System.out.println(logic);
		
		
	}

}
