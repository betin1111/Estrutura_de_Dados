package com.alberto.estruturadados.vetor;


public class Vetor {

	private String[] elementos;
	public int tamanho;

	public Vetor(int capacidade) {
		elementos = new String[capacidade];
	}

	public void adicionaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			String[] maisCapacidade = new String[this.elementos.length * 2];
			for (int i = 0; i < this.tamanho; i++) {
				maisCapacidade[i] = this.elementos[i];
			}
			this.elementos = maisCapacidade;
		}
	}

	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Invalida");
		}
		return this.elementos[posicao];
	}

	/*
	 * Como trata-se de comparação de elemento e não tem /posição de entrada, nao há
	 * necessidade de verificar range posições
	 */
	public int busca(String elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equalsIgnoreCase(elemento)) {
				return i;
			}
		}
		return -1;
	}

	public boolean adiciona(int posicao, String elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao Invalida");
		}
		adicionaCapacidade();

		// mover elementos
		for (int i = this.tamanho; i > posicao; i--) {
			this.elementos[i] = this.elementos[i - 1];

		}
		this.elementos[posicao] = elemento;
		tamanho++;
		return false;
	}

	public boolean adiciona(String elemento) {
		adicionaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[tamanho] = elemento;
			tamanho++;
			return true;
		}

		return false;
	}

	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Invalida");
		}

		for (int i = posicao; i < this.tamanho - 1; i++) {
			// if (i == tamanho - 1) {
			// adicionaCapacidade();
			// }
			this.elementos[i] = this.elementos[i + 1];
		}

		tamanho--;
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();

		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		// Code para nao ficar um monte de null
		if (this.elementos[tamanho - 1] != null) {
			s.append(elementos[tamanho - 1]);
		}
		s.append("]");

		return s.toString();
	}
}
