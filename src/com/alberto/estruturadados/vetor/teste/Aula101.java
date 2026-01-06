package com.alberto.estruturadados.vetor.teste;

import com.alberto.estruturadados.vetor.VetorObjetos;

public class Aula101 {

	public static void main(String[] args) {

		VetorObjetos vetor = new VetorObjetos(3); 

		Contato c1 = new Contato("Contato1", "1234-5678", "contato1@gmail.com");
		Contato c2 = new Contato("Contato2", "contato2@gmail.com");
		Contato c3 = new Contato("Contato3");
		Contato c4 = new Contato();

		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		vetor.adiciona(c4);
		

		int pos = vetor.busca(c1);
		if (pos > -1) {
			System.out.println("elemento existe na memoria");
		} else {
			System.out.println("Elemento nao existe na memoria");
		}
		System.out.println("Tamanho = " + vetor.tamanho);
		System.out.println(vetor);
		
		System.out.println(c1.equals(c4));
	}

}
