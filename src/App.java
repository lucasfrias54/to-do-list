import java.lang.invoke.VarHandle;

public class App {        
    
    String nomeCompromisso;
    String descricao;
    int duraçao;
    String data;
    String nomeUser;
    String local;

    public static void main(String[] args) throws Exception {
        int opcao = 0;

        var Compromisso = new App();
        
        System.out.println("|-----------TO DO LIST-----------|");
        System.out.println("|Selecione o que deseja fazer:   |");
        System.out.println("|                                |");
        System.out.println("|1 - Agendar novo compromisso    |");
        System.out.println("|2 - Listar compromissos         |");
        System.out.println("|3 - Editar compromisso          |");
        System.out.println("|4 - Excluir compromisso         |");
        System.out.println("|--------------------------------|");

        do{
            try{
                opcao = Integer.parseInt(System.console().readLine());
                if(opcao < 1 || opcao > 4){
                    System.out.println("Digite um valor válido! ");
                }
            }
            catch(Exception e){
                System.out.println("Digite um valor válido! ");
            }
        }while(opcao < 1 || opcao > 4);
                
        switch(opcao){
            case 1:
            {
                System.out.println("Digite um nome para esse compromisso:");
                Compromisso.nomeCompromisso = System.console().readLine();
                System.out.println("Digite uma descrição para esse compromisso:");
                Compromisso.descricao = System.console().readLine();
                System.out.println("Digite um nome para esse compromisso:");
                var saiu = false;
                do{
                    
                    try{
                        Compromisso.duraçao = Integer.parseInt(System.console().readLine());
                        saiu = true;
                    }
                    catch(Exception e){
                        System.out.println("Digite um valor válido! ");
                    }
                }while(saiu = false);

            }
            case 2:
            {
                
            }
            case 3:
            {
                
            }
            case 4:
            {

            }
            default:{            }
        }
        
    }
}
