package com.strategypattern;
import java.util.Scanner;

import com.strategypattern.Context.HitMan;
import com.strategypattern.InterfaceForStrategy.Weapon;
import com.strategypattern.strategy.Gun;
import com.strategypattern.strategy.Knife;
import com.strategypattern.strategy.Rifel;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
      Weapon weapon = null;
      Scanner scan = new Scanner(System.in);

	  while(true){
	      System.out.println("Choose a weapon 1. 2. 3.");
          String input = scan.nextLine();

          switch(input) {
              case "1":
                  weapon = new Gun();
                  break;
              case "2":
                  weapon = new Knife();
                  break;
              case "3":
                  weapon = new Rifel();
                  break;
          }

          HitMan hitman = new HitMan();
          hitman.setWeapon(weapon);
          hitman.Attack();
      }
    }
}
