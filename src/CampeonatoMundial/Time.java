package CampeonatoMundial;

import java.util.ArrayList;
import java.util.List;

public class Time implements Competitivel{
	private String nome;
	private String continente;
	private List<Object> jogadores;

	public Time(String nome, String continente) {
		this.nome = nome;
		this.continente = continente;
		this.jogadores = new ArrayList<>().reversed();
	}

	public void adicionarJogador(Object jogador) {
		this.jogadores.add(jogador);
	}

	@Override
	public void jogar() {
		// Lógica para simular a jogada do time
	}

	// Getters e Setters
}