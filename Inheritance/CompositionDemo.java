package Inheritance;

class House{
    private Kitchen kitchen;

    public House(){
        kitchen = new Kitchen();
        kitchen.setFood("Pizza");
    }

    public String getFood(){
        return kitchen.getfood();
    }
}


class Kitchen{
    private String food;

    public String getfood(){
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}

public class CompositionDemo {
    public static void main(String args[]){
      House h1 = new House();
      System.out.println(h1.getFood());
    }
}
