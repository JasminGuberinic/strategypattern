package com.strategypattern.InterfaceForStrategy;

public interface Weapon {
    default void use() {
        System.out.println("using Weapon");
    }
}
