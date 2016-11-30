import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

public class Funcionario extends Pessoa implements Serializable {


    private String morada;
    private int telefone;
    private String email;
    private String habilitacoes;
    private String funcao;



    public Funcionario(int nif, String nome, Calendar dataNascimento, String morada, int telefone, String email, String habilitacoes, String funcao) {
        super(nif, nome, dataNascimento);
        this.morada = morada;
        this.telefone = telefone;
        this.email = email;
        this.habilitacoes = habilitacoes;
        this.funcao = funcao;

    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHabilitacoes() {
        return habilitacoes;
    }

    public void setHabilitacoes(String habilitacoes) {
        this.habilitacoes = habilitacoes;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    @Override
    public String toString() {
        StringBuilder str =new StringBuilder();
        str.append("Funcionario :");
        str.append(super.toString());
        str.append("\n\tMorada: ").append(morada);
        str.append("\n\tTelefone: ").append(telefone);
        str.append("\n\tEmail: ").append(email);
        str.append("\n\tHabilitacoes: ").append(habilitacoes);
        str.append("\n\tFuncao: ").append(funcao);

        return str.toString();
    }

}
