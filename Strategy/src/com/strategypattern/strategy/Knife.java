package com.strategypattern.strategy;

import com.strategypattern.InterfaceForStrategy.Weapon;

public class Knife implements Weapon {
    public void  use(){
        System.out.println("I am using Knife!");
    }
}