package controle.somanome.Model;

public class Nomes {
    String nome1;
    String nome2;
    String resultado;

    public Nomes() {
    }

    public Nomes(String nome1, String nome2, String resultado) {
        this.nome1 = nome1;
        this.nome2 = nome2;
        this.resultado = resultado;
    }

    public String getNome1() {
        return nome1;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String calcula() {
        return nome1 + " " + nome2;

    }
}
