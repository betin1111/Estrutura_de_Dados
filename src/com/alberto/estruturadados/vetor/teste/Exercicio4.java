package com.alberto.estruturadados.vetor.teste;

import com.alberto.estruturadados.vetor.Lista;

public class Exercicio4 {

	public static void main(String[] args) {

		Lista<String> list = new Lista<>(10);
		
		list.adiciona("A");
		list.adiciona("B");
		list.adiciona("C");
		list.adiciona("D");
		
		System.out.println("o elementos retornado: "+list.get(1));
	}

}
