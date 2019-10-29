package com.strategypattern.Context;

import com.strategypattern.InterfaceForStrategy.Weapon;

public class HitMan {
    private Weapon weapon;

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void Attack(){
        weapon.use();
    }
}
