import java.io.Serializable;

public class TipoBiomedico implements Serializable{

    private int numero;
    private String designacao;
    private String descricao;

    public TipoBiomedico(String designacao, String descricao) {
        numero++;
        this.designacao = designacao;
        this.descricao = descricao;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "TipoBiomedico{" +
                "numero=" + numero +
                ", designacao='" + designacao + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
