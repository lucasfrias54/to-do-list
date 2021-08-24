import java.io.PrintStream;
import java.util.List;

public class Compromisso {
    String nomeCompromisso;
    String descricao;
    double duraçao;
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
                telaConsole.println("Digite uma duração para esse compromisso em minutos:");
                newComp.duraçao = Double.parseDouble(System.console().readLine());
                telaConsole.println("Digite uma data para esse compromisso, ex. DD/MM:");
                newComp.data = System.console().readLine();
                telaConsole.println("Digite o seu nome:");
                newComp.nomeUser= System.console().readLine();
                telaConsole.println("Digite o local:");
                newComp.local= System.console().readLine();

                compromissos.add(newComp);
                telaConsole.println("Compromisso Cadastrado com Sucesso! ");
                correto = false;
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