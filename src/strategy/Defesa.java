package strategy;

public class Defesa  implements Comportamento{

    @Override
    public void executar() {
        System.out.println("Defesa executada");
    }
}
