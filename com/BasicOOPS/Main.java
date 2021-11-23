package com.BasicOOPS;

public class Main {
    public static void main (String args[]){
        Fan f1 = new Fan(true);
        f1.turnOn();
        f1.turnOff();
        Fan.stat = 2;
        System.out.println(Fan.stat);
        Addition add = new Addition();

        System.out.println(add.FindSum(3, 5));
        System.out.println(add.get());
    }
}


class Fan{
    //instance variable
    private boolean isOn;
    public static int stat;

    //constructor
    public Fan(boolean a){
        this.isOn=a;
    }

    //Methods
    public void turnOn(){
        isOn=true;
        System.out.println("Fan is Spinning");
    }
    public void turnOff(){
        isOn=false;
        System.out.println("Fan is not Spinning");
    }
}

class Addition{
    private static String Chetan ="Zemoso";
    public int FindSum(int a , int b){
        return a+b;
    }

    public String get(){
        return Chetan;
    }
}