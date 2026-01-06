package com.alberto.estruturadados.vetor.teste;

import com.alberto.estruturadados.vetor.Lista;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista<String> list = new Lista<>(10);
		
		list.adiciona("A");
		list.adiciona("B");
		list.adiciona("C");
		list.adiciona("D");
		
		System.out.println(list.get(0));
	}

}
