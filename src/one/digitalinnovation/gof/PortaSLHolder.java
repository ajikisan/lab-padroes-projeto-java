package one.digitalinnovation.gof;

/**
 * Singleton Lazy Holder
 * Vai encapsular a classe pública "PortaSLHolder" na classe estática privada InstanceHolder.
 * Deste modo tem-se a otimização do uso de memória.
 *
 * Classe: PortaSLHolder
 * Métodos/Função: Abrir e fechar
 *
 */

public class PortaSLHolder {

    private static class InstanceHolder {
        public static PortaSLHolder instancia = new PortaSLHolder();
    }

    private PortaSLHolder() {
        super();
    }

    public static PortaSLHolder getInstancia() {
        return InstanceHolder.instancia;
    }

    //Métodos públicos que podem ser visualizados no sistema.
    public static void Abrir() {
        System.out.println("Porta aberta");
    }

    public static void Fechar() {
        System.out.println("Porta Fechada");

    }
}