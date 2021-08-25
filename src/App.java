import java.util.List;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        var telaConsole = System.out;
        var opcao = 0;
        var using = true;
        int count =0;
        List<Compromisso> compromissos = new ArrayList<Compromisso>();

        while (using) { 	
            new Compromisso().returnMenu(telaConsole);

            try {
                opcao = Integer.parseInt(System.console().readLine());
                if (opcao < 1 || opcao > 5) {
                    System.out.println("Digite um valor válido! ");
                }
            } catch (Exception e) {
                System.out.println("Digite um valor válido! ");
            }

            switch (opcao) {
                case 1:
                    count++;
                    new Compromisso().insertCompromisso(telaConsole, compromissos, count);
                    break;

                case 2:
                    new Compromisso().listCompromisso(telaConsole, compromissos);
                    break;

                case 3:
                    new Compromisso().editCompromisso(telaConsole, compromissos);
                    break;

                case 4:
                    new Compromisso().deleteCompromisso(telaConsole, compromissos);
                    break;

                case 5:
                    using = false;
                    break;

                default:
                    break;
            }
        }
    }
}