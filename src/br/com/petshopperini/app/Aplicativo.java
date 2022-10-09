package br.com.petshopperini.app;

import br.com.petshopperini.classes.Cachorro;
import br.com.petshopperini.classes.Coelho;
import br.com.petshopperini.classes.Gato;
import br.com.petshopperini.classes.Pet;
import java.util.ArrayList;

import java.util.Scanner;


public class Aplicativo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Pet> listaPet = new ArrayList<Pet>();
		boolean desligar = false;
				
		do {
			System.out.println("Menu:\n 1 - Mostrar animais hospedados\n 2 - Retirar um animal\n 3 - Hospedar mais um animal \n 4 - Encerrar o programa");
			String opcao = scan.nextLine();
			
			switch (opcao) {
				case "1":
					mostrarListaPets(listaPet);
					break;
				case "2":
					System.out.println("Qual Pet você deseja retirar?");
					int numeroPet = Integer.parseInt(scan.nextLine());
					
					listaPet = removerPet(listaPet, numeroPet - 1);
					break;
				case "3":
					System.out.println("Qual a espécie do animal?");
					String especie = scan.nextLine();
		
					System.out.println("Qual a raça do seu animal?");
					String raca = scan.nextLine();
		
					System.out.println("Qual o nome do animal?");
					String nome = scan.nextLine();
		
					System.out.println("Qual a quantidade de patas do animal?");
					int patas = Integer.parseInt(scan.nextLine());
					
					listaPet = adicionarPet(listaPet, especie, patas, raca, nome);
					break;
				case "4" :
					 desligar = true;
					  break;
				default:
					System.out.println("Não é uma opção valida, por favor escolha outra opção no menu.");
					break;
				}
		} while (!desligar);
		
		scan.close();
	}
	
	private static void mostrarListaPets(ArrayList<Pet> lista) {
		if (lista.size() > 0) {
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(i + 1 + " - " + lista.get(i).getNome());
			}
		} else {
			System.out.println("Não há pets.");
		}
	}
	
	private static ArrayList<Pet> removerPet(ArrayList<Pet> lista, int numPet) {
		if (0 <= numPet && numPet < lista.size()) {
			lista.remove(numPet);
			System.out.println("Saída do pet confirmada");
		} else {
			System.out.println("Número do pet invalido, informar um numero válido.");
		}
		
		return lista;
	}
	
	private static ArrayList<Pet> adicionarPet(ArrayList<Pet> lista, String especie, int patas, String raca,
			String nome) {
		switch (especie.toLowerCase()) {
				case "gato":
					lista.add(new Gato(patas, raca, nome));
					System.out.println("Gato adicionado com sucesso.");
					break;
				case "cachorro":
					lista.add(new Cachorro(patas, raca, nome));
					System.out.println("Cachorro adiconado com sucesso.");
					break;
				case "coelho":
					lista.add(new Coelho(patas, raca, nome));
					System.out.println("Coelho adicionado com sucesso.");
				default:
					 System.out.println("Por favor adicione um pet válido.");
					 break;
		}
		
		return lista;
	}

}

