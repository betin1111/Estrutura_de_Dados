package com.alberto.estruturadados.vetor.teste;

import com.alberto.estruturadados.vetor.Lista;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista<String> list = new Lista<>(10);
		
		list.adiciona("A");
		list.adiciona("B");
		list.adiciona("C");
		list.adiciona("D");
		list.adiciona("F");
		list.adiciona("G");
		
		list.remove("A");
		System.out.println(list);
		
		list.remove("B");
		System.out.println(list);
		
		list.remove("C");
		System.out.println(list);
	}

}
