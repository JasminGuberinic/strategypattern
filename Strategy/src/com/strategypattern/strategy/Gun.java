package com.strategypattern.strategy;

import com.strategypattern.InterfaceForStrategy.Weapon;

public class Gun implements Weapon {
    public void  use(){
        System.out.println("I am using Gun!");
    }
}
