package com.alberto.estruturadados.vetor.teste;

import com.alberto.estruturadados.vetor.Lista;

public class Aula11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista<String> vetor = new Lista<String>(1);

		vetor.adiciona("Elemento 01");
		vetor.adiciona("1"); 

		Lista<Contato> contato = new Lista<Contato>(3);
		
		Contato c1 = new Contato("Contato01 ", "1234-5678", "contato@email:" );

		
		vetor.adiciona("1");
	}
}
