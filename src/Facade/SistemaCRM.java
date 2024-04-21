package Facade;

public class SistemaCRM {
    public void gravarCliente(String nome, String cidade, String estado) {
        System.out.println("Cliente '" + nome + "' gravado no CRM com endereço em " + cidade + ", " + estado);
    }
}
