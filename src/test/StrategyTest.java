package test;

import strategy.Ataque;
import strategy.Defesa;
import strategy.Robo;

public class StrategyTest {
    public static void main(String[] args) {
        Robo robo = new Robo();

        robo.setComportamento(new Defesa());
        robo.executarComportamento();

        robo.setComportamento(new Ataque());
        robo.executarComportamento();
    }
}
