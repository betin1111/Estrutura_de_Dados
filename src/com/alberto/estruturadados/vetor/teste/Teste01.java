package com.alberto.estruturadados.vetor.teste;

import com.alberto.estruturadados.vetor.VetorObjetos;

public class Teste01 {

	public static void main(String[] args) {
		
	
		VetorObjetos vetor = new VetorObjetos(3);

		
			vetor.adiciona(3);
			vetor.adiciona("a");
			vetor.adiciona('z');
			System.out.println(vetor.tamanho);
			System.out.println(vetor);
			
			
		
	}


}
