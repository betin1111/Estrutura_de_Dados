package com.alberto.estruturadados.vetor.teste;

import com.alberto.estruturadados.vetor.Lista;

public class Exercicio {

	public static void main(String[] args) {

		Lista<String> list = new Lista<String>(3);

		
		list.adiciona("A");
		list.adiciona("B");
		list.adiciona("A");
		
		System.out.println(list.ultimoIndice("A"));
	
		
	}

}
