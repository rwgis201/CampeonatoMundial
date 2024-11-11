package CampeonatoMundial;

import java.util.ArrayList;
import java.util.Random;

public class Partida {
    private Time time1;
    private Time time2;
    private Estadio estadio;
    private Arbitro arbitro;
    private int placarTime1;
    private int placarTime2;



    public Partida(Time time1, Time time2, Estadio estadio, Arbitro arbitro) {
        this.time1 = time1;
        this.time2 = time2;
        this.estadio = estadio;
        this.arbitro = arbitro;
        this.placarTime1 = 0;
        this.placarTime2 = 0;

    }

    public Partida(CampeonatoMundial.Time time1, CampeonatoMundial.Time time2, CampeonatoMundial.Estadio estadio, CampeonatoMundial.Arbitro arbitro) {
    }

    public void simular() {
        Random random = new Random();
        this.placarTime1 = random.nextInt(5);
        this.placarTime2 = random.nextInt(5);

        // Simular gols e cartões
    }

    public void mostrarDetalhes() {
        System.out.println("Partida: " + time1.getNome() + " x " + time2.getNome());
        System.out.println("Estádio: " + estadio.getNome());
        System.out.println("Torcida: " + estadio.getTorcida().getNome());
        System.out.println("Público: " + estadio.getTorcida().getTamanho());
        System.out.println("Placar: " + placarTime1 + " x " + placarTime2);
        System.out.println("Árbitro: " + arbitro.getNome());


    }

    // Getters e Setters
}
