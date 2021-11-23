package Inheritance;

//Single Inheritance
//Parent
class A{

}
//SubClass
class B extends A{

}


//MultiLevel Inheritance

class C extends B{

}

//Multiple Inheritance : More than one parent
interface AA{
  default void method(){
    System.out.println("FROM AA...");
    }
}
interface AAA{
    default void method(){
        System.out.println("FROM AAA...");
    }
}

class BB implements AA,AAA{
    @Override
    public void method() {
        AAA.super.method();
    }
}

//hierachical inheritance single parent more than one children

//hybrid inheritance : multiple inheritance + multilevel inheritance;

public class InheritanceDemo {

    public static void main(String args[]){
        BB b = new BB();
        b.method();
    }

}

