package com.alberto.estruturadados.vetor.teste;

import com.alberto.estruturadados.vetor.Lista;

public class Exercicio05 {

	public static  void main(String[] args) {
		
		Lista<String> list = new Lista<String>(10);
		
		list.adiciona("A");
		list.adiciona("B");
		list.adiciona("C");
		list.adiciona("D");
		list.adiciona("E");
		
		System.out.println(list);
		
		list.limpar();
		
		System.out.println(list);
		
		list.adiciona("A");
		list.adiciona("B");
		list.adiciona("C");
		list.adiciona("D");
		list.adiciona("E");
		
		System.out.println(list);
 	}

}
