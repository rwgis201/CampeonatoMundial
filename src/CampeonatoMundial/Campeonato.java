package CampeonatoMundial;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private String nome;
    private List<CampeonatoMundial.Time> times;
    private List<CampeonatoMundial.Partida> partidas;

    public Campeonato(String nome) {
        this.nome = nome;
        this.times = new ArrayList<>();
        this.partidas = new ArrayList<>();
    }

    public void adicionarTime(CampeonatoMundial.Time time) {
        this.times.add(time);
    }

    public void criarPartida(CampeonatoMundial.Time time1, CampeonatoMundial.Time time2, CampeonatoMundial.Estadio estadio, CampeonatoMundial.Arbitro arbitro) {
        CampeonatoMundial.Partida partida = new CampeonatoMundial.Partida(time1, time2, estadio, arbitro);
        this.partidas.add(partida);
    }

    public void simularPartidas() {
        for (CampeonatoMundial.Partida partida : this.partidas) {
            partida.simular();
            partida.mostrarDetalhes();
        }
    }

    // Getters e Setters
}