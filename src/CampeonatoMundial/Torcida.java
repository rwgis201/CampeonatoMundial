package CampeonatoMundial;

public class Torcida {
    private String nome;

    public Object StringetNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    private int tamanho;


    public Torcida(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }


}