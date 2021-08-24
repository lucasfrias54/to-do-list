import java.io.PrintStream;
import java.util.List;

public class Compromisso {
    String nomeCompromisso;
    String descricao;
    int duraçao;
    String data;
    String nomeUser;
    String local;

    public void returnMenu(PrintStream telaConsole) {

        telaConsole.println("|-----------TO DO LIST-----------|\n" + "|Selecione o que deseja fazer:   |\n"
                + "|                                |\n" + "|1 - Agendar novo compromisso    |\n"
                + "|2 - Listar compromissos         |\n" + "|3 - Editar compromisso          |\n"
                + "|4 - Excluir compromisso         |\n" + "|5 - Fechar Programa             |\n"
                + "|--------------------------------|\n");

        return;
    }

    public void insertCompromisso(PrintStream telaConsole, List<Compromisso> compromissos) {
        var correto = true;
        var newComp = new Compromisso();

        while (correto) { 
            try {
                telaConsole.println("Digite um nome para esse compromisso:");
                newComp.nomeCompromisso = System.console().readLine();
                telaConsole.println("Digite uma descrição para esse compromisso:");
                newComp.descricao = System.console().readLine();
                telaConsole.println("Digite um nome para esse compromisso:");
                newComp.duraçao = Integer.parseInt(System.console().readLine());

            } catch (Exception ex) {
                telaConsole.println("Digite um valor válido! ");
            }
        }

    }

    public void listCompromisso(PrintStream telaConsole, List<Compromisso> compromissos) {

    }

    public void editCompromisso(PrintStream telaConsole, List<Compromisso> compromissos) {

    }

    public void deleteCompromisso(PrintStream telaConsole, List<Compromisso> compromissos) {

    }

}