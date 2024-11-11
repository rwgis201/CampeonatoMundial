package CampeonatoMundial;

public class Estadio {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Torcida getTorcida() {
        return torcida;44
    }

    public void setTorcida(Torcida torcida) {
        this.torcida = torcida;
    }

    private String nome;
    private Torcida torcida;

    public Estadio(String nome, Torcida torcida) {
        this.nome = nome;
        this.torcida = torcida;
    }

    // Getters e Setters
}