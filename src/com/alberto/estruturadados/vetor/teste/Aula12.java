package com.alberto.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("A"); 
		arrayList.add("C");

		System.out.println(arrayList);

		arrayList.add(1, "B");
		System.out.println(arrayList);

		System.out.println("===========================================");

		for (String item : arrayList) {
			System.out.print(item);
			System.out.println();
		}
		System.out.println("============================================");
		
		boolean contem = arrayList.contains("A");

		System.out.println(contem);

		int pos = arrayList.indexOf("B");

		if (pos > -1) {
			System.out.println("Elementos existe na Array " + pos);

		} else {
			System.out.println("Elemento Existe no Array " + pos);
		}

		System.out.println(arrayList.get(2));

		System.out.println();
		System.out.println(arrayList.remove(1));

		arrayList.forEach(item -> System.out.println(item));

	}
}
