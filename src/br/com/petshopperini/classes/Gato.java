package br.com.petshopperini.classes;

public class Gato extends Pet {
	public Gato(int patas, String raca, String nome) {
		super("gato", patas, raca, nome);
	}

	public void miar(){
		System.out.println("Miau");
	}	
}
	