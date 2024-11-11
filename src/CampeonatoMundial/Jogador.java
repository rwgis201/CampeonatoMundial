package CampeonatoMundial;

public class Jogador extends Pessoa {
	private String posicao;
	private int numeroCamisa;

	public Jogador(String nome, int idade, String posicao, int numeroCamisa) {
		super(nome, idade);
		this.posicao = posicao;
		this.numeroCamisa = numeroCamisa;
	}

	// Getters e Setters
}