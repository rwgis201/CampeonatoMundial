package CampeonatoMundial;


public class Arbitro extends Pessoa {

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String nome;
	public int idade;

	public Arbitro(String nome, int idade) {
		super(nome, idade);
	}




}