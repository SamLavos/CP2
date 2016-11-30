import java.io.*;
import java.util.ArrayList;


public class GestaoClinica {

    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Utente> utentes = new ArrayList<>();
    private ArrayList<TipoBiomedico> tipoBiomedicos = new ArrayList<>();
    private ArrayList<TipoExame> tipoExames = new ArrayList<>();
    private ArrayList<DadoBiomedico> dadosBiomedicos = new ArrayList<>();
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void inserirFuncionario(Funcionario funcionario){

        funcionarios.add(funcionario);
        pessoas.add(funcionario);
    }

    public int pesquisarFuncionario(int nif){
        for (int i = 0; i < funcionarios.size(); i++) {
            if (nif==funcionarios.get(i).getNif()) {
                return i;
            }
        }
        return -1;
    }

    public String mostrarFuncionario() {
        StringBuilder str = new StringBuilder();
        if (funcionarios.isEmpty()) {
            str.append("Não há funcionarios inseridos!");
        } else {
            for (int i = 0; i < funcionarios.size(); i++) {
                str.append(funcionarios.get(i)).append("\n");
            }
        }
        return str.toString();
    }

    public  void removerFuncionario(int pos){
        funcionarios.remove(pos);
    }

    public int pesquisarUtente(int numero){
        for (int i = 0; i < utentes.size(); i++) {
            if (numero==utentes.get(i).getNumeroUtente()) {
                return i;
            }
        }
        return -1;
    }

    public int pesquisarUtente(String nomeResponsavel){
        for (int i = 0; i < utentes.size(); i++) {
            if (nomeResponsavel.equalsIgnoreCase(utentes.get(i).getNomeResponsavel())) {
                return i;
            }
        }
        return -1;
    }

    public void inserirUtente(Utente utente){

        utentes.add(utente);
        pessoas.add(utente);
    }

    public String mostrarUtentes() {
        StringBuilder str = new StringBuilder();
        if (utentes.isEmpty()) {
            str.append("Não há utentes inseridos!");
        } else {
            for (int i = 0; i < utentes.size(); i++) {
                str.append(utentes.get(i)).append("\n");
            }
        }
        return str.toString();
    }


    public int pesquisarTipoBiomedico(String designacao){
        for (int i = 0; i < tipoBiomedicos.size(); i++) {
            if (designacao.equalsIgnoreCase(tipoBiomedicos.get(i).getDesignacao())) {
                return i;
            }
        }
        return -1;
    }

    public void inserirDadoBiomedico(DadoBiomedico dadoBiomedico){

        dadosBiomedicos.add(dadoBiomedico);
    }



    public void inserirTipoDadoBiomedico(TipoBiomedico tipoBiomedico){
        tipoBiomedicos.add(tipoBiomedico);
    }

    public int pesquisarUtentePorNumero(int numeroUtente){
        for (int i = 0; i < utentes.size(); i++) {
            if (numeroUtente==utentes.get(i).getNumeroUtente()) {
                return i;
            }
        }
        return -1;
    }
    public int pesquisarUtentePorNif(int nif){
        for (int i = 0; i < utentes.size(); i++) {
            if (nif==utentes.get(i).getNif()) {
                return i;
            }
        }
        return -1;
    }

    public int getTotalFuncionarios() {
        return funcionarios.size();

    }

    public int getTotalTipoBiomedico() {
        return tipoBiomedicos.size();

    }

    public String mostrarTipoBiomedico() {
        StringBuilder str = new StringBuilder();
        if (tipoBiomedicos.isEmpty()) {
            str.append("Não há tipos biomedicos inseridos!");
        } else {
            for (int i = 0; i < tipoBiomedicos.size(); i++) {
                str.append(tipoBiomedicos.get(i)).append("\n");
            }
        }
        return str.toString();
    }





    public int getTotalUtentes() {
        return utentes.size();

    }

    public Funcionario obterFuncionario(int pos) {
        return funcionarios.get(pos);

    }

    public TipoBiomedico  obterTipoBiomedico(int pos) {
        return tipoBiomedicos.get(pos);
    }

    public Utente obterUtente(int pos) {
        return utentes.get(pos);

    }



    public int pesquisarTipoExame(String designacao) {
        for (int i = 0; i < tipoExames.size(); i++) {
            if (designacao.equalsIgnoreCase(tipoExames.get(i).getDesignacao())) {
                return i;
            }
        }
        return -1;
    }

    public void inserirTipoExame(TipoExame tipoExame) {
        tipoExames.add(tipoExame);
    }
    public int getTotalTipoExame() {
        return tipoExames.size();
    }
    public TipoExame obterTipoExame(int pos) {
        return tipoExames.get(pos);
    }


    public void alterarPreco(double novoPreco,int posicao){
        tipoExames.get(posicao).setPreco(novoPreco);
    }


    public String mostrarDadosBiomedicos(int numeroUtente) {
        StringBuilder str = new StringBuilder();
        if (dadosBiomedicos.isEmpty()) {
            str.append("Este utente não tem dados biomedicos inseridos!");
        } else {
            for (int i = 0; i < dadosBiomedicos.size(); i++) {
                if(dadosBiomedicos.get(i).getUtente().getNumeroUtente()==(numeroUtente))
                    str.append(dadosBiomedicos.get(i)).append("\n");
            }
        }
        return str.toString();
    }

    //public abstract void marcarConsulta();
    //public abstract void marcarExame();
    // public abstract void registarConsulta();
    //public abstract void registarExame();
    //public abstract void consultarServicoPorNumeroUtente();
    //public abstract void consultarServicoPorData();

    //public abstract void medicoRealizaMaisServicos();
    //public abstract void numeroTotalExames();//por tipo de exame
    //public abstract void TotaisAnuaisFaturados();

    public void gravarFicheiro() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("CPII.dat"));
            out.writeObject(pessoas);
            out.writeObject(funcionarios);
            out.writeObject(utentes);
            out.writeObject(tipoExames);
            out.writeObject(tipoBiomedicos);
            out.writeObject(dadosBiomedicos);
            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void lerFicheiro() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("CPII.dat"));
            pessoas = (ArrayList<Pessoa>) in.readObject();
            funcionarios = (ArrayList<Funcionario>) in.readObject();
            utentes = (ArrayList<Utente>) in.readObject();
            tipoExames = (ArrayList<TipoExame>) in.readObject();
            tipoBiomedicos = (ArrayList<TipoBiomedico>) in.readObject();
            dadosBiomedicos = (ArrayList<DadoBiomedico>) in.readObject();

            Utente.numUtentes= utentes.size();
            TipoBiomedico.numTiposBiomedicos= tipoBiomedicos.size();


            in.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }



}
