package br.com.petshopperini.classes;

public abstract class Pet extends Animal implements IPet{
	public int patas;
	private String raca;
	private String nome;
	
	
	public Pet(String especie, int patas, String raca, String nome) {
		super(especie);
		this.patas= patas;
		this.raca = raca;
		this.setNome(nome);
	}

	public String getRaca() {
		return raca;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void andar() {
		System.out.println("Animal anda.");
	}
	
}
