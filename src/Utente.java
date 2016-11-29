import java.io.Serializable;
import java.util.Calendar;

public class Utente extends Pessoa implements Serializable {

    private int numeroProcesso;
    private int numeroUtente;
    private char sexo;
    private String sistemaSaude;
    private String nomeResponsavel;
    private String parentescoResponsavel;
    private String emailResponsavel;
    private int telefoneResponsavel;
    private String medicoFamilia;
    private String login;
    private String password;


    public Utente(int nif, String nome, Calendar dataNascimento, int numeroUtente, char sexo, String sistemaSaude, String nomeResponsavel, String parentescoResponsavel, String emailResponsavel, int telefoneResponsavel, String medicoFamilia, String login, String password) {
        super(nif, nome, dataNascimento);
        numeroProcesso++;
        this.numeroUtente = numeroUtente;
        this.sexo = sexo;
        this.sistemaSaude = sistemaSaude;
        this.nomeResponsavel = nomeResponsavel;
        this.parentescoResponsavel = parentescoResponsavel;
        this.emailResponsavel = emailResponsavel;
        this.telefoneResponsavel = telefoneResponsavel;
        this.medicoFamilia = medicoFamilia;
        this.login = login;
        this.password = password;
    }

    public int getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(int numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public int getNumeroUtente() {
        return numeroUtente;
    }

    public void setNumeroUtente(int numeroUtente) {
        this.numeroUtente = numeroUtente;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getSistemaSaude() {
        return sistemaSaude;
    }

    public void setSistemaSaude(String sistemaSaude) {
        this.sistemaSaude = sistemaSaude;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getParentescoResponsavel() {
        return parentescoResponsavel;
    }

    public void setParentescoResponsavel(String parentescoResponsavel) {
        this.parentescoResponsavel = parentescoResponsavel;
    }

    public String getEmailResponsavel() {
        return emailResponsavel;
    }

    public void setEmailResponsavel(String emailResponsavel) {
        this.emailResponsavel = emailResponsavel;
    }

    public int getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

    public void setTelefoneResponsavel(int telefoneResponsavel) {
        this.telefoneResponsavel = telefoneResponsavel;
    }

    public String getMedicoFamilia() {
        return medicoFamilia;
    }

    public void setMedicoFamilia(String medicoFamilia) {
        this.medicoFamilia = medicoFamilia;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public boolean validarIdade() {
        if (calcularIdade() <= 18)
            return false;
        return true;
    }






    @Override
    public String toString() {
        StringBuilder str =new StringBuilder();
        str.append("Utente :");
        str.append("\n\tNúmero do Processo: ").append(numeroProcesso);
        str.append("\n\tNumero Utente: ").append(numeroUtente);
        str.append(super.toString());
        str.append("\n\tSexo: ").append(sexo);
        str.append("\n\tSistema de Saúde: ").append(sistemaSaude);
        str.append("\n\tNome do Responsavel: ").append(nomeResponsavel);
        str.append("\n\tParentesco do Responsavel: ").append(parentescoResponsavel);
        str.append("\n\tEmail do Responsavel: ").append(emailResponsavel);
        str.append("\n\tTelefone do Responsavel: ").append(telefoneResponsavel);
        str.append("\n\tMedico de Familia: ").append(medicoFamilia);
        str.append("\n\tLogin: ").append(login);
        str.append("\n\tPassword: ").append(password);

        return str.toString();
    }

}
