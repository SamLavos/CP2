import java.util.ArrayList;
import java.util.List;


public class Consulta extends Servico{

    private String descricao;
    private DadoBiomedico dadoBiomedicos;


    public Consulta(String descricao, DadoBiomedico dadoBiomedicos) {
        this.descricao = descricao;
        this.dadoBiomedicos = dadoBiomedicos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "descricao='" + descricao + '\'' +
                ", dadoBiomedicos=" + dadoBiomedicos +
                '}';
    }
}
