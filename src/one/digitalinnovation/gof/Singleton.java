package one.digitalinnovation.gof;

/**
 *  Autora: Mirian Ajiki Molicawa
 *  Design Patterns - Singleton - Java
 *  Professor: Venilton Falvo Junior
 *
 *  A ideia do Singleton é ter uma classe-objeto capaz de ser instanciada uma vez, possibilitando visibilidade e
 *  acessibilidade global dessa instância em um determinado escopo de projeto.
 *
 *  Todos tem o mesmo comportamento, traz o número de memória pertinente as variações do Singleton.
 *
 */


public class Singleton {

    // Teste Singleton Lazy
    public static void main(String[] args) {
        // write your code here
        System.out.println("---Singleton Lazy---");
        Porta porta = Porta.getInstancia();
        System.out.println(Porta.SingleTon);
        Porta.Abrir();
        System.out.println(porta);
        porta = Porta.getInstancia();
        Porta.Fechar();
        System.out.println(Porta.SingleTon2);
        System.out.println(porta);

        System.out.println();
        System.out.println("---Singleton Eager---");
        PortaEager eager = PortaEager.getInstancia();
        PortaEager.Abrir();
        System.out.println(eager);
        eager = PortaEager.getInstancia();
        Porta.Fechar();
        System.out.println(eager);

        System.out.println();
        System.out.println("---Singleton Lazy Holder---");
        PortaSLHolder portaLazyHolder = PortaSLHolder.getInstancia();
        PortaSLHolder.Abrir();
        System.out.println(portaLazyHolder);
        portaLazyHolder = PortaSLHolder.getInstancia();
        Porta.Fechar();
        System.out.println(portaLazyHolder);
    }
}
