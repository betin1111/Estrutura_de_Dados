package com.alberto.estruturadados.vetor;

import com.alberto.estruturadados.vetor.teste.Contato;

public class Lista<T> {

	private T[] elementos;
	public int tamanho;

	@SuppressWarnings("unchecked")
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
	}

	/*
	 * public Lista(int capacidade, Class<T> tipoClasse) { this.elementos = (T[])
	 * Array.newInstance(tipoClasse, capacidade); this.tamanho = 0; }
	 */

	@SuppressWarnings("unchecked")
	public void adicionaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] maisCapacidade = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.tamanho; i++) {
				maisCapacidade[i] = this.elementos[i];
			}
			this.elementos = maisCapacidade;
		}
	}

	public T busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Invalida");
		}
		return this.elementos[posicao];
	}

	/*
	 * Como trata-se de comparação de elemento e não tem /posição de entrada, nao há
	 * necessidade de verificar range posições
	 */

	public int busca(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	/*public Contato get(int posicao) {
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IndexOutOfBoundsException(" Indice " + posicao + ", Tamanho " + tamanho);
		}
		return (Contato) this.elementos[posicao];

	}*/
	
	public T get(int elemento) {
		return this.busca(elemento);
	}

	public boolean contem(T elemento) {
		return this.busca(elemento) > -1;
	}

	@SuppressWarnings("unchecked")
	public boolean adiciona(int posicao, Contato elemento) {
		if (!(posicao >= 0 && posicao <= tamanho)) {
			throw new IllegalArgumentException("Posicao Invalida");
		}

		adicionaCapacidade();

		// mover elementos
		for (int i = this.tamanho; i > posicao; i--) {
			this.elementos[i] = this.elementos[i - 1];

		}
		this.elementos[posicao] = (T) elemento;
		tamanho++;
		return false;
	}

	public boolean adiciona(T elemento) {

		adicionaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[tamanho] = (T) elemento;
			tamanho++;
			return true;
		}

		return false;
	}

	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Invalida");

		}
		reposicionar(posicao);
		/*
		 * for (int i = posicao; i < this.tamanho - 1; i++) { if (i == tamanho - 1) { //
		 * adicionaCapacidade(); } this.elementos[i] = this.elementos[i + 1]; }
		 */

	}

	public void remove(T elemento) {
		int pos = this.busca(elemento);
		if (pos > -1) {
			this.remove(pos);
		}
	}
	/*
	 * public void removeT(Contato elemento) { for (int i = 0; i < tamanho; i++) {
	 * if (elementos[i].equals(elemento)) { reposicionar(i); break; } } }
	 */

	public void reposicionar(int posicao) {
		for (int i = posicao; i < tamanho - 1; i++) {
			this.elementos[i] = elementos[i + 1];
		}
		tamanho--;
		this.elementos[tamanho] = null;
	}

	@SuppressWarnings("unchecked")
	public void limpar() {
		//opção 1
		for (int i = 0; i < tamanho; i++) {
			this.elementos[i] = null;

		}
		//tamanho = 0;
		
		//opção 2
		//this.tamanho = 0;
		
		//opção3
		this.elementos = (T[]) new  Object[this.elementos.length];
		
	}

	public int tamanho() {
		return this.tamanho;
	}

	public int ultimaPosicao() {
		return elementos.length - 1;
	}

	public int ultimoIndice(T elemento) {
		for (int i = tamanho - 1; i > 0; i--) {
			if (elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	/*
	 * @Override public String toString() {
	 * 
	 * StringBuilder s = new StringBuilder();
	 * 
	 * s.append("[");
	 * 
	 * for (int i = 0; i < this.tamanho - 1; i++) {
	 * 	s.append(this.elementos[i]);
	 * 	s.append(", "); }
	 * 
	 * // Code para nao ficar um monte de null if (this.elementos[tamanho - 1] !=
	 * null) { s.append(elementos[tamanho - 1]); } s.append("]");
	 * 
	 * return s.toString(); }
	 */
	@Override
	// public String toString() {
	// return Arrays.toString(Arrays.copyOf(elementos, tamanho));
	// }
	public String toString() {
		//Para o Remove
		if (tamanho == 0) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();
		sb.append('[');
		sb.append(elementos[0]); // Elemento 0 adicionando 

		for (int i = 1; i < tamanho; i++) { // por isso o "i" começa com 1
			sb.append(", ");
			sb.append(elementos[i]);
		}

		sb.append(']');
		return sb.toString();
	}

}
