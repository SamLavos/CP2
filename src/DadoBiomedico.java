import java.io.Serializable;
import java.util.Calendar;

public class DadoBiomedico implements Serializable{
    public static int numero;
    private Calendar data;
    private double valor;

    private TipoBiomedico tipoBiomedico ;
    private Utente utente ;
    private Funcionario funcionario ;

    public DadoBiomedico(Calendar data, double valor, TipoBiomedico tipoBiomedico, Utente utente, Funcionario funcionario) {
        numero++;
        this.data = data;
        this.valor = valor;
        this.tipoBiomedico = tipoBiomedico;
        this.utente = utente;
        this.funcionario = funcionario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoBiomedico getTipoBiomedico() {
        return tipoBiomedico;
    }

    public void setTipoBiomedico(TipoBiomedico tipoBiomedico) {
        this.tipoBiomedico = tipoBiomedico;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "DadoBiomedico{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                ", tipoBiomedico=" + tipoBiomedico +
                ", utente=" + utente +
                ", funcionario=" + funcionario +
                '}';
    }
}

