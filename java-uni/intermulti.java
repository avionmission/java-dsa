public class intermulti {
 public static void main(String[] args) {
  Duck duck = new Duck();
  duck.walk();
  duck.swim();
 } 
}

interface Walkable{
  void walk();
}
interface Swimmable{
  void swim();
}

class Duck implements Walkable,Swimmable{
  @Override
  public void walk(){
    System.out.println("Duck is walking.");
  }
  @Override
  public void swim(){
    System.out.println("Duck is swimming.");
  }
}
