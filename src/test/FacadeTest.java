package test;

import Facade.IntegracaoSistemas;

public class FacadeTest {
    public static void main(String[] args) {
        IntegracaoSistemas integracao = new IntegracaoSistemas();

        // Gravando um cliente com base no CEP
        integracao.gravarClienteComEndereco("João", "01234-567");

        // Gravando outro cliente com base no CEP
        integracao.gravarClienteComEndereco("Maria", "98765-432");
    }
}
