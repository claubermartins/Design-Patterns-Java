package strategy;

public class Robo {
    private Comportamento comportamento;

    public Comportamento setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
        return comportamento;
    }

    public void executarComportamento() {
        if (comportamento != null) {
            comportamento.executar();
        } else
            System.out.println("Nenhum comportamento definido");
    }
}
