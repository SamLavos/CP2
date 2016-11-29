import java.io.Serializable;
import java.util.Calendar;


public abstract class Pessoa implements Serializable {

    private int nif;
    private String nome;
    private Calendar dataNascimento;

    public Pessoa(int nif, String nome, Calendar dataNascimento) {
        this.nif = nif;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public int calcularIdade() {
        int anos;
        Calendar dataAtual = Calendar.getInstance();
        anos = dataAtual.get(Calendar.YEAR) - dataNascimento.
                get(Calendar.YEAR);
        if (dataAtual.get(Calendar.DAY_OF_YEAR) <
                dataNascimento.get(Calendar.DAY_OF_YEAR))
            anos--;

        return anos;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\n\tNIF: ").append(nif);
        str.append("\n\tNome: ").append(nome);
        str.append("\n\tData Nascimento: ").
                append(dataNascimento.get(Calendar.DATE)).
                append("-").append((dataNascimento.get(Calendar.MONTH) + 1)).
                append("-").append(dataNascimento.get(Calendar.YEAR));

        return str.toString();
    }
}