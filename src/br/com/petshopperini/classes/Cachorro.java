package br.com.petshopperini.classes;

public class Cachorro extends Pet {
	public Cachorro(int patas, String raca, String nome) {
		super("cachorro", patas, raca, nome);
	}
	
	public void latir() {
		System.out.println("Au au");
	}
}
