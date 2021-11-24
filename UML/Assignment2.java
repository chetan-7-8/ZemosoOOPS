package UML;

import java.util.ArrayList;
import java.util.Scanner;

class Company{
   private static ArrayList<Person> list = new ArrayList<>();

   public boolean checkEmp(String name , int id ){
       for(Person p : list){
           if(p.Name.equals(name) && p.id==id){
               return true;
           }
       }
   return false;}

    public void AddEmp(Person p){
       list.add(p);
    }

    public void RemoveEmp(String name , int id){
      for(Person p : list){

      }
    }
}


class Person{
   private String Name;
   private int id;

    public Person(String Name , int id){
        this.Name=Name;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }
}

public class Assignment2 {
    public static void main(String args[]){

        Company Zemoso = new Company();

        Zemoso.AddEmp(new Person("Chetan", 1));
        Zemoso.AddEmp(new Person("Saumitra", 2));

        Zemoso.RemoveEmp("Chetan", 1);

        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to ZeMoSo. Please Enter your Name");
        String name = s.nextLine();
        System.out.println("Enter your Employee ID");
        int id =s.nextInt();
        System.out.println("This will take a while.....");

        if(Zemoso.checkEmp(name,id)){
            System.out.println("Welcome "+name+" : "+id);
        }
        else{
            System.out.println("Access Denied");
        }




    }
}
