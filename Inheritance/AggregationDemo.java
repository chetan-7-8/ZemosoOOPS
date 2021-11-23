package Inheritance;

import java.util.ArrayList;
import java.util.List;

class College{
     String name;
    private List<Teacher> Teacher;

    public College(String name ,List<Teacher> list){
        this.name=name;
        this.Teacher=list;
    }
    public List<Teacher> getTeacher(){
        return Teacher;
    }
}

class Teacher{
  String name;
  String subject;

  public Teacher(String name, String subject){
      this.name=name;
      this.subject=subject;
  }

  public String toString(){
      return("Teacher: "+name+" "+"Subject "+subject);
  }
}

public class AggregationDemo {
    public static void main(String args[]){
        List<Teacher> list = new ArrayList<>();
       Teacher t1 = new Teacher("chetan","Java");
       Teacher t2 = new Teacher("Zemoso","backend");
       list.add(t1);
       list.add(t2);

       College c1 = new College("MyCollege",list);
    }
}
