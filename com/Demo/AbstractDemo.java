package com.Demo;

import java.sql.Struct;
import java.util.ArrayList;

public abstract class AbstractDemo {
     // We cannot create an object of abstract class.

     public abstract void method();
}

interface Mobile {
  public void calling(String num);
  public void sendMessage(String mes);
}
class Apple implements Mobile{

   private ArrayList<String> contacts = new ArrayList<>();

   public void addContact(String Num){
        contacts.add(Num);
   }

     @Override
     public void calling(String num) {
           System.out.println("Calling...."+num);
     }

     @Override
     public void sendMessage(String mes) {
       System.out.println("Sending Message....."+mes);
     }
}

class AbstractDemoChild extends AbstractDemo{

     @Override
     public void method() {
          System.out.println("Hey am Abstracted");
     }
}
abstract class Mobilee{
   ArrayList<String> contacts = new ArrayList<>();

    abstract void calling (String num);

   abstract void sendMsg(String msg);

   public void addContact(String num){
       contacts.add(num);
   }
}
class Samsung extends Mobilee{

    @Override
    void calling(String num) {
        System.out.println("Calling from samsung.."+num);
    }

    @Override
    void sendMsg(String msg) {
       System.out.println("Sending message from samsung...."+msg);
    }
}