import java.io.PrintStream;
import java.util.List;

public class Compromisso {
    String nomeCompromisso;
    String descricao;
    double duraçao;
    String data;
    String nomeUser;
    String local;
    int id;

    public void returnMenu(PrintStream telaConsole) {

        telaConsole.println("|-----------TO DO LIST-----------|\n" + "|Selecione o que deseja fazer:   |\n"
                + "|                                |\n" + "|1 - Agendar novo compromisso    |\n"
                + "|2 - Listar compromissos         |\n" + "|3 - Editar compromisso          |\n"
                + "|4 - Excluir compromisso         |\n" + "|5 - Fechar Programa             |\n"
                + "|--------------------------------|\n");

        return;
    }

    public void insertCompromisso(PrintStream telaConsole, List<Compromisso> compromissos, int count) {
        var correto = true;
        var newComp = new Compromisso();

        while (correto) {
            try {
                telaConsole.println("Digite um nome para esse compromisso:");
                newComp.nomeCompromisso = System.console().readLine();
                telaConsole.println("Digite uma descrição para esse compromisso:");
                newComp.descricao = System.console().readLine();
                telaConsole.println("Digite uma duração para esse compromisso em minutos:");
                newComp.duraçao = Double.parseDouble(System.console().readLine());
                telaConsole.println("Digite uma data para esse compromisso, ex. DD/MM:");
                newComp.data = System.console().readLine();
                telaConsole.println("Digite o seu nome:");
                newComp.nomeUser = System.console().readLine();
                telaConsole.println("Digite o local:");
                newComp.local = System.console().readLine();
                newComp.id = count;

                compromissos.add(newComp);
                telaConsole.println("Compromisso Cadastrado com Sucesso! ");
                correto = false;
            } catch (Exception ex) {
                telaConsole.println("Digite um valor válido! ");
            }
        }

    }

    public void listCompromisso(PrintStream telaConsole, List<Compromisso> compromissos) {
        for (Compromisso compromisso : compromissos) {
            telaConsole.println("\nID: " + compromisso.id + "\n" + compromisso.data + " " + compromisso.nomeCompromisso
                    + "\nLocal: " + compromisso.local + "\nDuração: " + compromisso.duraçao + " minutos");
            telaConsole.println("Usuário: " + compromisso.nomeUser + "\nDescrição: " + compromisso.descricao + "\n");
        }
        System.console().readLine();
    }

    public String menuEdit() {
        return "|---------------------------------------------------|\n"
                + "|Selecione o que deseja editar:                     |\n"
                + "|Para Terminar a edição aperte qualquer outra tecla |\n"
                + "|                                                   |\n"
                + "|1 - Descrição                                      |\n"
                + "|2 - Duração                                        |\n"
                + "|3 - Data                                           |\n"
                + "|4 - Local                                          |\n"
                + "|5 - Nome do Compromisso                            |\n"
                + "|                                                   |\n"
                + "|---------------------------------------------------|\n";
    }

    public void editCompromisso(PrintStream telaConsole, List<Compromisso> compromissos) {
        int idEditar;
        var opcEdit = "";
        var editando = true;
        telaConsole.println("Digite o ID do compromisso que deseja editar: ");
        idEditar = Integer.parseInt(System.console().readLine());
        for (Compromisso compromisso : compromissos) {
            if (idEditar == compromisso.id) {
                while (editando) {
                    menuEdit();
                    opcEdit = System.console().readLine();
                    switch (opcEdit) {
                        case "1":
                            telaConsole.println("Digite o novo valor da descrição : ");
                            compromisso.descricao = System.console().readLine();
                            break;
                        case "2":
                            try {
                                telaConsole.println("Digite o novo valor da duração: ");
                                compromisso.duraçao = Double.parseDouble(System.console().readLine());
                            } catch (Exception e) {
                                telaConsole.println("Digite um valor válido!!");
                            }
                            break;
                        case "3":
                            telaConsole.println("Digite o novo valor da data: ");
                            compromisso.data = System.console().readLine();
                            break;
                        case "4":
                            telaConsole.println("Digite o novo valor do local: ");
                            compromisso.local = System.console().readLine();
                            break;
                        case "5":
                            telaConsole.println("Digite o novo valor do nome do compromisso: ");
                            compromisso.nomeCompromisso = System.console().readLine();
                            break;

                        default:
                            editando = false;
                            return;
                    }
                }
                return;
            }
        }
    }

    public void deleteCompromisso(PrintStream telaConsole, List<Compromisso> compromissos) {
        int idDelete;
        telaConsole.println("Digite o ID do compromisso que deseja remover: ");
        idDelete = Integer.parseInt(System.console().readLine());
        for (Compromisso compromisso : compromissos) {
            if (idDelete == compromisso.id) {
                compromissos.remove(compromisso);
                break;
            }
        }

    }

}