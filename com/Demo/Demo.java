package com.Demo;

import com.BasicOOPS.publicDemo;
// Default class: within Package

// private : inside the class only

// public : everywhere;

// protected : same package adn within the subclass

// an outer class cant be private and protected because they will become useless.

// inner and nested classes can be private and protected;

public class Demo {
  public static void main(String args[]){
    publicDemo p = new publicDemo();
    p.Method();
    AbstractDemoChild c = new AbstractDemoChild();
    c.method();
    Apple myPhone = new Apple();
    myPhone.calling("98995597730");
    myPhone.sendMessage("hey chetan this side");
    myPhone.addContact("9899559773");

    Samsung p2 = new Samsung();
    p2.calling("9899559773");
    p2.sendMsg("hey nice meeting you");
    p2.addContact("4546545616");
  }

}
