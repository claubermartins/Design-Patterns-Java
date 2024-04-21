package Test;

import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;

public class SingletonTest {
    public static void main(String[] args) {
        // Teste SingletonLazy
        SingletonLazy lazyInstance1 = SingletonLazy.getInstance();
        SingletonLazy lazyInstance2 = SingletonLazy.getInstance();
        System.out.println("SingletonLazy: " + (lazyInstance1 == lazyInstance2)); // Deve imprimir true

        // Teste SingletonEager
        SingletonEager eagerInstance1 = SingletonEager.getInstance();
        SingletonEager eagerInstance2 = SingletonEager.getInstance();
        System.out.println("SingletonEager: " + (eagerInstance1 == eagerInstance2)); // Deve imprimir true

        // Teste SingletonLazyHolder
        SingletonLazyHolder lazyHolderInstance1 = SingletonLazyHolder.getInstance();
        SingletonLazyHolder lazyHolderInstance2 = SingletonLazyHolder.getInstance();
        System.out.println("SingletonLazyHolder: " + (lazyHolderInstance1 == lazyHolderInstance2)); // Deve imprimir true
    }
}
