package strategy;

public class Ataque  implements Comportamento{

    @Override
    public void executar() {
        System.out.println("Ataque executado");
    }
}
