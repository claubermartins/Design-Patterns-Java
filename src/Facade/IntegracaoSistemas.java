package Facade;

public class IntegracaoSistemas {
    private SistemaCEP sistemaCEP;
    private SistemaCRM sistemaCRM;

    public IntegracaoSistemas() {
        this.sistemaCEP = new SistemaCEP();
        this.sistemaCRM = new SistemaCRM();
    }
    public void gravarClienteComEndereco(String nome, String cep) {
        String endereco = sistemaCEP.buscarCidadeEstado(cep);
        String[] enderecoSeparado = endereco.split(", ");
        String cidade = enderecoSeparado[0];
        String estado = enderecoSeparado[1];

        sistemaCRM.gravarCliente(nome, cidade, estado);
    }
}