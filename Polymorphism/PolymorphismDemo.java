package Polymorphism;

class Addition{
    public void sum(int a , int b){
        System.out.println("SUm is :"+ (a+b));
    }

    public void sum(int a , int b , int c){
        System.out.println("The sum is :"+(a+b+c));
    }
}

public class PolymorphismDemo {
    public static void main(String args[]){
     Addition add = new Addition();
     add.sum(2,3,5);
    }
}
