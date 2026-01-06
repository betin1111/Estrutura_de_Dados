package com.alberto.estruturadados.vetor.teste;

import com.alberto.estruturadados.vetor.Vetor;

public class Aula10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vetor vetor = new Vetor(3);

		vetor.adiciona("A");// 0
		vetor.adiciona("B");// 1
		vetor.adiciona("C");// 2
		vetor.adiciona("D");// 3
		vetor.adiciona("E");// 4
		vetor.adiciona("G");// 5
		
		System.out.println(vetor);
		
		vetor.remove(3);
		
		System.out.println(vetor); 
		


	}

}
