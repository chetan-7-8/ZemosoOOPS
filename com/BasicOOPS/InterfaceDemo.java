package com.BasicOOPS;

public interface InterfaceDemo {

    static String a="Static constant";
    public void m1();

    public void m2();

    static void m3(){}

    default int m4(){return 0;}

}

class Test implements InterfaceDemo{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }
}
