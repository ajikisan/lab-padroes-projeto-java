package one.digitalinnovation.gof;

/**
 * Singleton Lazy "Preguiçoso"
 * Precisa de validação para se criar uma nova instancia.
 * Classe: Porta
 * Métodos/Função: Abrir e fechar
 */

public class Porta {
   //variável privada
   //O campo criado serve para guardar a instância singleton e deve ser declarado como estático.
    private static Porta instancia;

    //variável pública
    public static final String SingleTon = "Bem vindo";
    public static final String SingleTon2= "Volte Sempre";


    //Criação de construtor para chamar a classe pai
    private Porta(){
        super();
    }

    //O método público estático que irá controlar de forma única a instância.
    public static Porta getInstancia() {
        if (instancia == null)
        {
            instancia = new Porta();
        }
        return instancia;
    }

    //Métodos públicos que podem ser visualizados no sistema.
    public static void Abrir() {
         System.out.println("Porta aberta");
     }

    public static void Fechar() {
       System.out.println("Porta Fechada");
    }
}
