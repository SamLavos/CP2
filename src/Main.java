import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
    public static GestaoClinica gc = new GestaoClinica();

    public static void main(String[] args) {
	// write your code here
        int opcaoMenu;
        int opcaoSubMenu;
        int pos,nif,numero;
        String nomeResponsavel,designacao;
        double novoPreco;


        gc.lerFicheiro();
        do {
            opcaoMenu = menu();
            switch (opcaoMenu) {
                case 1:

                    do {
                        opcaoSubMenu = menuFuncionarios();
                        switch (opcaoSubMenu) {
                            case 1:
                                Funcionario funcionario = lerDadosFuncionario();
                                gc.inserirFuncionario(funcionario);
                                System.out.println("Funcionario inserido com sucesso!");
                                break;
                            case 2:
                                if (gc.getTotalFuncionarios() == 0)
                                    System.out.println("Ainda não foram inseridos funcionários!");
                                else {
                                    nif = Consola.lerInt("Indique o NIF do funcionário: ", 1, 999999999);
                                    pos = gc.pesquisarFuncionario(nif);
                                    if (pos == -1) {
                                        System.out.println("Não existe um funcionário com esse NIF!");
                                    } else {
                                        System.out.println(gc.obterFuncionario(pos));
                                    }
                                }

                                break;
                            case 3:
                                if (gc.getTotalFuncionarios() == 0)
                                    System.out.println("Ainda não foram inseridos funcionários!");
                                else {
                                    nif = Consola.lerInt("Indique o NIF do funcionário: ", 1, 9999999);
                                    pos = gc.pesquisarFuncionario(nif);
                                    if (pos == -1) {
                                        System.out.println("Não existe um funcionário com esse NIF!");
                                    } else {
                                        gc.removerFuncionario(pos);
                                        System.out.println("Funcionário removido com sucesso!");
                                    }
                                }


                                break;
                            case 0:

                        }
                        if (opcaoSubMenu != 0) {
                            Consola.sc.nextLine();
                        }
                    } while (opcaoSubMenu != 0);
                    break;
                case 2:

                    do {
                        opcaoSubMenu = menuTiposDeDados();
                        switch (opcaoSubMenu) {
                            case 1:
                                TipoBiomedico tipoBiomedico = lerDadosTipoBiomedico();
                                gc.inserirTipoDadoBiomedico(tipoBiomedico);
                                System.out.println("Tipo de dado biomédico inserido com sucesso!");
                                break;
                            case 2:
                                if (gc.getTotalTipoBiomedico() == 0)
                                    System.out.println("Ainda não foram inseridos tipos de dados biomédicos!");
                                else {
                                    designacao = Consola.lerString("Indique a designação do tipo de dado biomédico: ");
                                    pos = gc.pesquisarTipoBiomedico(designacao);
                                    if (pos == -1) {
                                        System.out.println("Não existe um tipo de dado biomédico com essa designação!");
                                    } else {
                                        System.out.println(gc.obterTipoBiomedico(pos));
                                    }
                                }
                                break;
                            case 3:
                                TipoExame tipoExame = lerDadosTipoExame();
                                gc.inserirTipoExame(tipoExame);
                                System.out.println("Tipo de dado exame inserido com sucesso!");

                                break;
                            case 4:
                                if (gc.getTotalTipoExame() == 0)
                                    System.out.println("Ainda não foram inseridos tipos de exames!");
                                else {
                                    designacao = Consola.lerString("Indique a designação do tipo do tipo de exame ");
                                    pos = gc.pesquisarTipoExame(designacao);
                                    if (pos == -1) {
                                        System.out.println("Não existe um tipo de exame com essa designação!");
                                    } else {
                                        System.out.println(gc.obterTipoExame(pos));
                                    }
                                }

                                break;
                            case 5:
                                if (gc.getTotalTipoExame() == 0)
                                    System.out.println("Ainda não foram inseridos tipos de exames!");
                                else {
                                    designacao = Consola.lerString("Indique a designação do tipo do tipo de exame ");
                                    pos = gc.pesquisarTipoExame(designacao);
                                    if (pos == -1) {
                                        System.out.println("Não existe um tipo de exame com essa designação!");
                                    } else {
                                        novoPreco = Consola.lerDouble("Introduza o novo preço:", 0, 999);
                                        gc.alterarPreco(novoPreco,pos);
                                        System.out.println("O preço do tipo de exame foi alterado com sucesso!");
                                    }
                                }

                                break;

                            case 0:

                        }
                        if (opcaoSubMenu != 0) {
                            Consola.sc.nextLine();
                        }
                    } while (opcaoSubMenu != 0);
                    break;
                case 3:
                    do {
                        opcaoSubMenu = menuUtentes();
                        switch (opcaoSubMenu) {
                            case 1:
                                Utente utente = lerDadosUtente();
                                gc.inserirUtente(utente);
                                System.out.println("Utente inserido com sucesso!");

                                break;
                            case 2:
                                if (gc.getTotalUtentes() == 0)
                                    System.out.println("Ainda não foram inseridos utentes!");
                                else {
                                    numero = Consola.lerInt("Indique o número do utente: ", 1, 999999999);
                                    pos = gc.pesquisarUtente(numero);
                                    if (pos == -1) {
                                        System.out.println("Não existe um utente com esse número!");
                                    } else {
                                        System.out.println(gc.obterUtente(pos));
                                    }
                                }
                                break;
                            case 3:
                                if (gc.getTotalUtentes() == 0)
                                    System.out.println("Ainda não foram inseridos utentes!");
                                else {
                                    nomeResponsavel = Consola.lerString("Indique o nome do responsável");
                                    pos = gc.pesquisarUtente(nomeResponsavel);
                                    if (pos == -1) {
                                        System.out.println("Não existe um responsável com esse nome!");
                                    } else {
                                        System.out.println(gc.obterUtente(pos));
                                    }
                                }

                                break;

                            case 0:

                        }
                        if (opcaoSubMenu != 0) {
                            Consola.sc.nextLine();
                        }
                    } while (opcaoSubMenu != 0);

                    break;
                case 4:
                    do {
                        opcaoSubMenu = menuServiços();
                        switch (opcaoSubMenu) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            case 4:

                                break;
                            case 5:

                                break;
                            case 6:

                                break;

                            case 0:

                        }
                        if (opcaoSubMenu != 0) {
                            Consola.sc.nextLine();
                        }
                    } while (opcaoSubMenu != 0);

                    break;
                case 5:
                    if (Utente.numUtentes != 0)
                        adicionarDadoBiomedico();
                    else {
                        System.err.println("Não há utentes inseridos!");
                    }
                    break;


                    //DadoBiomedico dadoBiomedico = lerDadosDadosBiomedicos();
                   //gc.inserirDadoBiomedico(dadoBiomedico);
                    //System.out.println("Dado biomédico inserido com sucesso!");
                   // break;
                case 6:
                    do {
                        opcaoSubMenu = menuEstatisticas();
                        switch (opcaoSubMenu) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;

                            case 0:

                        }
                        if (opcaoSubMenu != 0) {
                            Consola.sc.nextLine();
                        }
                    } while (opcaoSubMenu != 0);

                    break;
                case 0:
                    System.out.println("Programa terminou...");
            }
            Consola.sc.nextLine();
        } while (opcaoMenu != 0);
        gc.gravarFicheiro();
    }


    private static Funcionario lerDadosFuncionario(){
        int nif, pos,telefone;
        String morada,email,funcao,habilitacoes,nome,dataN;
        Calendar dataNascimento=new GregorianCalendar();

        do {
            nif = Consola.lerInt("Indique o NIF do funcionário: ", 1, 999999999);
            pos = gc.pesquisarFuncionario(nif);
            if (pos != -1) {
                System.out.println("Já existe um funcionário com esse número!");
            }
        } while (pos != -1);
        nome = Consola.lerString("Indique o nome do funcionário: ");
        dataN = Consola.lerString("Indique a data de nascimento do funcionário (\"dd-MM-yyyy\"):");
        try{
        dataNascimento.setTime(formato.parse(dataN));
        } catch (ParseException e) {
            System.err.println("Erro ao introduzir a data!");
        }
        morada = Consola.lerString("Indique a morada do funcionário: ");
        telefone = Consola.lerInt("Indique o telefone do funcionário: ");
        email = Consola.lerString("Indique o email do funcionário: ");
        habilitacoes = Consola.lerString("Indique as habilitações do funcionário: ");
        funcao = Consola.lerString("Indique a funcao do funcionário: ");
        Funcionario f1 = new Funcionario(nif,nome,dataNascimento,morada,telefone,email,habilitacoes,funcao);

        return f1;
    }


    private static Utente lerDadosUtente() {
        int numeroUtente,telefone,nif,pos;
        char sexo;
        String nome, sistemaSaude, nomeResponsavel, parentescoResponsavel, email, medicoFamilia, login, password,dataN;
        Calendar dataNascimento=new GregorianCalendar();

        do {
            numeroUtente = Consola.lerInt("Indique o numero do utente: ", 1, 999999999);
            pos = gc.pesquisarUtentePorNumero(numeroUtente);
            if (pos != -1) {
                System.out.println("Já existe um utente com esse número!");
            }
        } while (pos != -1);
        do {
            nif = Consola.lerInt("Indique o nif do utente: ", 1, 999999999);
            pos = gc.pesquisarUtentePorNif(nif);
            if (pos != -1) {
                System.out.println("Já existe um utente com esse número!");
            }
        } while (pos != -1);
        nome = Consola.lerString("Indique o nome completo do utente: ");
        sexo = Consola.lerChar("Indique o sexo do utente: " ,"m,f");
        dataN = Consola.lerString("Indique a data de nascimento do utente (\"dd-MM-yyyy\"):");
        try{
            dataNascimento.setTime(formato.parse(dataN));
        } catch (ParseException e) {
            System.err.println("Erro ao introduzir a data!");
        }

        sistemaSaude = Consola.lerString("Indique o sistema de saude do utente: ");
        nomeResponsavel = Consola.lerString("Indique o nome do responsavel do utente: ");
        parentescoResponsavel = Consola.lerString("Indique o parentesco do responsavel do utente: ");
        email = Consola.lerString("Indique o email do responsavel do utente: ");
        telefone = Consola.lerInt("Indique o telefone do responsavel pelo utente: ");
        medicoFamilia = Consola.lerString("Indique o nome do medico de familia do utente: ");
        login = Consola.lerString("Indique o login do utente: ");
        password = Consola.lerString("Indique a password do utente: ");

        Utente u1 = new Utente(nif,nome,dataNascimento,numeroUtente,sexo,sistemaSaude,nomeResponsavel,parentescoResponsavel,medicoFamilia,login,password,email,telefone);
        return u1;
    }


    private static TipoBiomedico lerDadosTipoBiomedico(){
         int pos;
         String designacao,descricao;

        do {
            designacao = Consola.lerString("Indique a designação do tipo de dado biomédico: ");
            pos = gc.pesquisarTipoBiomedico(designacao);
            if (pos != -1) {
                System.out.println("Já existe um tipo de dado biomédico com essa designação!");
            }
        } while (pos != -1);
        descricao = Consola.lerString("Indique a descrição do tipo de dado biomédico: ");


        TipoBiomedico tb1 = new TipoBiomedico(designacao,descricao);

        return tb1;
    }


    private static TipoExame lerDadosTipoExame() {
        int pos;
        String designacao,descricao;
        double preco;

        do {
            designacao = Consola.lerString("Indique a designação do tipo de exame: ");
            pos = gc.pesquisarTipoExame(designacao);
            if (pos != -1) {
                System.out.println("Já existe um tipo de exame com essa designação!");
            }
        } while (pos != -1);
        descricao = Consola.lerString("Indique a descrição do tipo de exame: ");
        preco = Consola.lerDouble("Indique o preco do tipo de exame: ", 0, 9999);


        TipoExame te1 = new TipoExame(designacao,descricao,preco);

        return te1;
    }

/*
    private static DadoBiomedico lerDadosDadosBiomedicos() {
        int pos;
        Calendar data =new GregorianCalendar();
        double valor;
        TipoBiomedico tipoBiomedico;
        Utente utente;
        Funcionario funcionario;
        int numeroUtente,nif;
        String designacao,dataD;



        do {
            System.out.println(gc.mostrarUtentes());
            numeroUtente = Consola.lerInt("Indique o número do utente: ", 1, 999999999);
            pos = gc.pesquisarUtente(numeroUtente);
            if (pos == -1)
                System.out.println("Utente não existe!");
        } while (pos == -1);


        do {
            System.out.println(gc.mostrarFuncionario());
            nif = Consola.lerInt("Indique o nif do funcionario: ", 1, 999999999);
            pos = gc.pesquisarFuncionario(nif);
            if (pos == -1)
                System.out.println("Não existe esse funcionário!");
        } while (pos == -1);


        do {
            System.out.println(gc.mostrarTipoBiomedico());
            designacao = Consola.lerString("Indique o tipo de dado biomédico:");
            pos = gc.pesquisarTipoBiomedico(designacao);
            if (pos == -1)
                System.out.println("Não existe esse tipo de dado biomédico!");
        } while (pos == -1);


        valor = Consola.lerDouble("Indique o valor do dado biomédico: ",0 , 999);
        dataD = Consola.lerString("Indique a data (\"dd-MM-yyyy\"):");
        try{
            data.setTime(formato.parse(dataD));
        } catch (ParseException e) {
            System.err.println("Erro ao introduzir a data!");
        }


        utente = gc.obterUtente(pos);
        funcionario = gc.obterFuncionario(pos);
        tipoBiomedico = gc.obterTipoBiomedico(pos);


        DadoBiomedico db1 = new DadoBiomedico(data, valor, tipoBiomedico,  utente,  funcionario);
        return db1;


    }*/

    public static void adicionarDadoBiomedico() {
        int pos;
        Calendar data =new GregorianCalendar();
        double valor;
        TipoBiomedico tipoBiomedico;
        Utente utente;
        Funcionario funcionario;
        int numeroUtente,nif;
        String designacao,dataD;

        try{
            valor = Consola.lerDouble("Indique o valor do dado biomédico: ",0 , 99999);
            dataD = Consola.lerString("Indique a data (\"dd-MM-yyyy\"):");
            data.setTime(formato.parse(dataD));

           do {
                System.out.println(gc.mostrarUtentes());
                numeroUtente = Consola.lerInt("Indique o número do utente: ", 1, 9999999);
                pos = gc.pesquisarUtente(numeroUtente);
                if (pos == -1)
                    System.out.println("Utente não existe!");
            } while (pos == -1);

            do {
                System.out.println(gc.mostrarFuncionario());
                nif = Consola.lerInt("Indique o nif do funcionário: ", 1, 9999999);
                pos = gc.pesquisarFuncionario(nif);
                if (pos == -1)
                    System.out.println("Funcionário não existe!");
            } while (pos == -1);

            do {
                System.out.println(gc.mostrarTipoBiomedico());
                designacao = Consola.lerString("Indique o tipo de dado biomédico:");
                pos = gc.pesquisarTipoBiomedico(designacao);
                if (pos == -1)
                    System.out.println("Não existe esse tipo de dado biomédico!");
            } while (pos == -1);


            utente = gc.obterUtente(pos);
            funcionario = gc.obterFuncionario(pos);
            tipoBiomedico = gc.obterTipoBiomedico(pos);


            DadoBiomedico db1 = new DadoBiomedico(data, valor, tipoBiomedico,  utente,  funcionario);


            gc.inserirDadoBiomedico(db1);
        } catch (ParseException e) {
            System.err.println("Erro ao introduzir a data!");
        }

    }


    private static int menu() {
        int opcao;

        System.out.println();
        System.out.println("1 - Funcionario");
        System.out.println("2 - Tipos de dados");
        System.out.println("3 - Utentes");
        System.out.println("4 - Serviços");
        System.out.println("5 - Inserir dados biomédicos");
        System.out.println("6 - Estatisticas");
        System.out.println("0 - Sair\n");
        opcao = Consola.lerInt("Opcao: ", 0, 11);

        return opcao;
    }
    private static int menuFuncionarios() {
        int opcao;

        System.out.println();
        System.out.println("1 - Inserir Funcionario");
        System.out.println("2 - Consultar Funcionario");
        System.out.println("3 - Eliminar Funcionario");
        System.out.println("0 - Menu anterior\n");
        opcao = Consola.lerInt("Opcao: ", 0, 3);

        return opcao;
    }
    private static int menuTiposDeDados() {
        int opcao;

        System.out.println();
        System.out.println("1 - Inserir tipo de dados biomedicos");
        System.out.println("2 - Consultar tipo de dados biomedicos");
        System.out.println("3 - Inserir tipo de exame");
        System.out.println("4 - Consultar tipo de exame");
        System.out.println("5 - Alterar o preço do tipo de exame");
        System.out.println("0 - Menu anterior\n");
        opcao = Consola.lerInt("Opcao: ", 0, 5);

        return opcao;
    }
    private static int menuUtentes() {
        int opcao;

        System.out.println();
        System.out.println("1 - Inserir Utentes");
        System.out.println("2 - Consultar por numero");
        System.out.println("3 - Consultar por nome responsavel");
        System.out.println("0 - Menu anterior\n");
        opcao = Consola.lerInt("Opcao: ", 0, 3);

        return opcao;
    }
    private static int menuServiços() {
        int opcao;

        System.out.println();
        System.out.println("1 - Marcar consulta ");
        System.out.println("2 - Marcar exame");
        System.out.println("3 - Registar consulta");
        System.out.println("4 - Registar exame");
        System.out.println("5 - Consultar serviços por numero de utente");
        System.out.println("6 - Consultar serviços por data");
        System.out.println("0 - Menu anterior\n");
        opcao = Consola.lerInt("Opcao: ", 0, 6);

        return opcao;
    }
    private static int menuEstatisticas() {
        int opcao;

        System.out.println();
        System.out.println("1 - Medico que realiza mais serviços ");
        System.out.println("2 - Numero total de exames de cada tipo realizado");
        System.out.println("3 - Totais anuais faturados");

        System.out.println("0 - Menu anterior\n");
        opcao = Consola.lerInt("Opcao: ", 0, 3);

        return opcao;
    }
}
