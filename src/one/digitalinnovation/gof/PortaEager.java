package one.digitalinnovation.gof;

/**
 * Singleton Eager - "Apressado"
 * Logo em que a variável já foi definida ele já atribui a instância, não precisa de validação.
 * Classe: PortaEager
 * Métodos/Função: Abrir e fechar
 * *
 */

public class PortaEager {

    private static PortaEager instancia = new PortaEager();

    private PortaEager() {
        super();
    }

    public static PortaEager getInstancia() {
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
