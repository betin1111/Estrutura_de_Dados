package com.alberto.estruturadados.vetor.teste;

import java.util.Scanner;

import com.alberto.estruturadados.vetor.Lista;

public class Ex06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Lista<Contato> lista = new Lista<>(10);

		criarContato(lista, 10);

		int opcao = 1;

		while (opcao != 0) {

			opcao = obterOpcaoMenu(scan);

			switch (opcao) {
			case 1: {
				adicionarContatoFinal(scan, lista);
				break;
			}
			case 2: {
				adicionarContatoPosicao(scan, lista);
				break;
			}
			case 3: {
				obtemContatoPosicao(scan, lista);
				break;
			}
			case 4: {
				obtemContato(scan, lista);
				break;
			}
			case 5: {
				pesquisarUltimoIndice(scan, lista);
				break;
			}
			case 6: {
				pesquisarContatoExiste(scan, lista);
				break;
			}
			case 7: {
				excluirPorPosicao(scan, lista);
				break;
			}
			case 8: {
				excluirContato(scan, lista);
				break;
			}
			case 9: {
				imprimeTamanhoVetor(lista);
				break;
			}
			case 10: {
				limparVetor(lista);
				break;
			}
			case 11: {
				imprimirVetor(lista);
				break;
			}
			default: {
				break;
			}

			}

		}
		
		System.out.println("\nO usuário digitou 0, programa terminado\n\n");

	}

	private static void imprimirVetor(Lista<Contato> lista) {

		System.out.println(lista);

	}

	private static void limparVetor(Lista<Contato> lista) {

		lista.limpar();

		System.out.println("Todos os contatos foram Excluídos");
	}

	private static void imprimeTamanhoVetor(Lista<Contato> lista) {

		System.out.println("Tamanho do vetor é de: " + lista.tamanho);
	}

	private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {

		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInformacao("Entre com o nome: ", scan);
		String telefone = leInformacao("Entro com o telefone: ", scan);
		String email = leInformacao("Entre com o emial: ", scan);

		Contato contato = new Contato(nome, telefone, email);
		lista.adiciona(contato);

		System.out.println("\nContato adicionado com sucesso!");
		System.out.println(contato);
	}

	private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = lista.busca(pos);

			System.out.println("\nContato existe, seguem dados: \n");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("\nPosição Invalida!\n");
		}
	}

	private static void obtemContato(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = lista.busca(pos);

			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado: ");
			pos = lista.busca(contato);

			System.out.println("\nContato encontrado na posição " + pos + "\n");

		} catch (Exception e) {
			System.out.println("Posição Invalida!");
		}
	}

	private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = lista.busca(pos);

			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do ultimo índice do contato encontrado: ");
			pos = lista.ultimoIndice(contato);

			System.out.println("\nContato encontrado na posição " + pos + "\n");

		} catch (Exception e) {
			System.out.println("Posição Invalida!");
		}
	}

	private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = lista.busca(pos);

			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

			boolean existe = lista.contem(contato);

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

	private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {

			lista.remove(pos);

			System.out.println("Contato exluído! ");

		} catch (Exception e) {
			System.out.println("Posição Invalida!");
		}
	}

	private static void excluirContato(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = lista.busca(pos);
			System.out.println(contato);

			lista.remove(contato);

			System.out.println("Contato exluído! ");

		} catch (Exception e) {
			System.out.println("Posição Invalida!");
		}
	}

	private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {

		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInformacao("Entre com o Nome:", scan);
		String telefone = leInformacao("Entro com o telefone: ", scan);
		String email = leInformacao("Entre com o email: ", scan);

		Contato contato = new Contato(nome, telefone, email);

		int pos = leInformacaoInt("Entre com a posicão a adicionar o contato: ", scan);
		lista.adiciona(pos, contato);

		System.out.println("\nContato adicionado com sucesso!");
		System.out.println(contato);
	}

	private static String leInformacao(String msg, Scanner scan) {
		//
		System.out.print(msg);
		String entrada = scan.nextLine();

		return entrada;
	}

	private static int leInformacaoInt(String msg, Scanner scan) {
		//
		boolean entradaValida = false;
		int num = 0;

		while (!entradaValida) {

			try {
				System.out.print(msg);
				String entrada = scan.nextLine(); //

				num = Integer.parseInt(entrada);

				entradaValida = true;

			} catch (Exception e) {
				System.out.println("Entrada Invalida, digite novamente!");
			}

		}
		return num;

	}

	private static int obterOpcaoMenu(Scanner scan) {

		boolean opcaoValida = false;
		String escolha;
		int opcao = 0;

		while (!opcaoValida) {

			System.out.println("Digite a opção desejada:");
			System.out.println("1: Adiciona contato no final do vetor");
			System.out.println("2: Adiciona contato em uma posição especifica");
			System.out.println("3: Obtém contato de uma posição específicas");
			System.out.println("4: Consulta Contato");
			System.out.println("5: Consulta última índice do contato");
			System.out.println("6: Verifica contato");
			System.out.println("7: Excluir por posição");
			System.out.println("8: Excluir contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Exluir todos os contatos do vetor");
			System.out.println("11: Imprime vetor");
			System.out.println("0 Sair");

			try {
				escolha = scan.nextLine();
				opcao = Integer.parseInt(escolha);

				if (!(opcao > -1 && opcao < 12)) {
					throw new Exception();
				}
				opcaoValida = true;
			}

			catch (Exception e) {
				System.out.println("\nOpção Invalida! Digite novamente!\n ");
			}

		}
		return opcao;
	}

	private static void criarContato(Lista<Contato> lista, int quantidade) {

		Contato contato;
		;
		for (int i = 0; i < quantidade; i++) {

			contato= new Contato();
			contato.setNome("Contado" + i);
			contato.setTelefone("123" + i + "123" + i);
			contato.setEmail("Contato" + i + "@email.com");

			lista.adiciona(contato);

		}
	}
}
