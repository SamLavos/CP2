import java.io.Serializable;

public class TipoExame implements Serializable{

    private int numero;
    private String designacao;
    private String descricao;

    public TipoExame(String designacao, String descricao, double preco) {
        numero++;
        this.designacao = designacao;
        this.descricao = descricao;
        this.preco = preco;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    private double preco;


    @Override
    public String toString() {
        return "TipoExame{" +
                "numero=" + numero +
                ", designacao='" + designacao + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
