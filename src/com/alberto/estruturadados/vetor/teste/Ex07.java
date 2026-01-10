package com.alberto.estruturadados.vetor.teste;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex07 extends Ex06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Contato> ArrayList = new ArrayList<>(10);

		criarContato(ArrayList, 10);

		int opcao = 1;

		while (opcao != 0) {

			opcao = obterOpcaoMenu(scan);

			switch (opcao) {
			case 1: {
				adicionarContatoFinal(scan, ArrayList);
				break;
			}
			case 2: {
				adicionarContatoPosicao(scan, ArrayList);
				break;
			}
			case 3: {
				obtemContatoPosicao(scan, ArrayList);
				break;
			}
			case 4: {
				obtemContato(scan, ArrayList);
				break;
			}
			case 5: {
				pesquisarUltimoIndice(scan, ArrayList);
				break;
			}
			case 6: {
				pesquisarContatoExiste(scan, ArrayList);
				break;
			}
			case 7: {
				excluirPorPosicao(scan, ArrayList);
				break;
			}
			case 8: {
				excluirContato(scan, ArrayList);
				break;
			}
			case 9: {
				imprimeTamanhoVetor(ArrayList);
				break;
			}
			case 10: {
				limparVetor(ArrayList);
				break;
			}
			case 11: {
				imprimirVetor(ArrayList);
				break;
			}
			default: {
				break;
			}

			}

		}

		System.out.println("\nO usuário digitou 0, programa terminado\n\n");

	}

	private static void imprimirVetor(ArrayList<Contato> ArrayList) {

		System.out.println(ArrayList);

	}

	private static void limparVetor(ArrayList<Contato> list) {

		list.clear();

		System.out.println("Todos os contatos foram Excluídos");
	}

	private static void imprimeTamanhoVetor(ArrayList<Contato> liist) {

		System.out.println("Tamanho do vetor é de: " + liist.size());
	}

	private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> list) {

		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInformacao("Entre com o nome: ", scan);
		String telefone = leInformacao("Entro com o telefone: ", scan);
		String email = leInformacao("Entre com o emial: ", scan);

		Contato contato = new Contato(nome, telefone, email);
		list.add(contato);

		System.out.println("\nContato adicionado com sucesso!");
		System.out.println(contato);
	}

	private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> ArrayList) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = ArrayList.get(pos);

			System.out.println("\nContato existe, seguem dados: \n");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("\nPosição Invalida!\n");
		}
	}

	private static void obtemContato(Scanner scan, ArrayList<Contato> list) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = list.get(pos);

			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado: ");
			pos = list.indexOf(contato);

			System.out.println("\nContato encontrado na posição " + pos + "\n");

		} catch (Exception e) {
			System.out.println("Posição Invalida!");
		}
	}

	private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> list) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = list.get(pos);

			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do ultimo índice do contato encontrado: ");
			pos = list.lastIndexOf(contato);

			System.out.println("\nContato encontrado na posição " + pos + "\n");

		} catch (Exception e) {
			System.out.println("Posição Invalida!");
		}
	}

	private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> list) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = list.get(pos);

			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

			boolean existe = list.contains(contato);

			if (existe) {

				System.out.println("Contato existe, seguem dados: ");
				System.out.println(contato);

			} else {

				System.out.println("Contato no encontrado");
			}

		} catch (Exception e) {
			System.out.println("Posição Invalida!");
		}
	}

	private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> ArrayList) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {

			ArrayList.remove(pos);

			System.out.println("Contato exluído! ");

		} catch (Exception e) {
			System.out.println("Posição Invalida!");
		}
	}

	private static void excluirContato(Scanner scan, ArrayList<Contato> list) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = list.get(pos);
			System.out.println(contato);

			list.remove(contato);

			System.out.println("Contato exluído! ");

		} catch (Exception e) {
			System.out.println("Posição Invalida!");
		}
	}

	private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> list) {

		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInformacao("Entre com o Nome:", scan);
		String telefone = leInformacao("Entro com o telefone: ", scan);
		String email = leInformacao("Entre com o email: ", scan);

		Contato contato = new Contato(nome, telefone, email);

		int pos = leInformacaoInt("Entre com a posicão a adicionar o contato: ", scan);
		list.add(pos, contato);

		System.out.println("\nContato adicionado com sucesso!");
		System.out.println(contato);
	}

	private static void criarContato(ArrayList<Contato> list, int quantidade) {

		Contato contato;

		for (int i = 0; i < quantidade; i++) {

			contato = new Contato();
			contato.setNome("Contado" + i);
			contato.setTelefone("123" + i + "123" + i);
			contato.setEmail("Contato" + i + "@email.com");

			list.add(contato);

		}
	}

}
