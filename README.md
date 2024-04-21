# Design Patterns em Java

Este repositório contém exemplos práticos de implementações dos padrões de design em Java. Os padrões de design são soluções reutilizáveis para problemas comuns que surgem durante o desenvolvimento de software. Neste projeto, concentramo-nos em três padrões essenciais: Singleton, Strategy e Facade.

## Padrões Utilizados

### Singleton
O Singleton é um padrão de design creacional que garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global para essa instância. Aqui estão as implementações disponíveis neste projeto:

- `SingletonEager.java`: Implementação de inicialização precoce (Eager Initialization) do Singleton.
- `SingletonLazy.java`: Implementação de inicialização tardia (Lazy Initialization) do Singleton.
- `SingletonLazyHolder.java`: Implementação do Singleton utilizando a abordagem do Holder.

### Strategy
O Strategy é um padrão de design comportamental que permite definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis. Aqui está a implementação disponível neste projeto:

- `Ataque.java`, `Comportamento.java` e `Defesa.java`: Interfaces e classes relacionadas ao padrão Strategy para um sistema de comportamento de robô.

### Facade
O Facade é um padrão de design estrutural que fornece uma interface unificada para um conjunto de interfaces em um subsistema. Aqui está a implementação disponível neste projeto:

- `IntegracaoSistemas.java`, `SistemaCEP.java` e `SistemaCRM.java`: Classes que representam diferentes subsistemas que são integrados através do Design Patterns Facade.

## Estrutura do Projeto
```
Design-Patterns-Java/
│
├── src/
│   ├── facade/
│   │   ├── IntegracaoSistemas.java
│   │   ├── SistemaCEP.java
│   │   └── SistemaCRM.java
│   │
│   ├── singleton/
│   │   ├── SingletonEager.java
│   │   ├── SingletonLazy.java
│   │   └── SingletonLazyHolder.java
│   │
│   ├── strategy/
│   │   ├── Ataque.java
│   │   ├── Comportamento.java
│   │   ├── Defesa.java
│   │   └── Robo.java
│   │
│   └── test/
│       ├── FacadeTest.java
│       ├── SingletonTest.java
│       └── StrategyTest.java
│
└── README.md
```

## Testes
Os testes estão localizados dentro do diretório `src/` para garantir uma estrutura organizada do projeto.
