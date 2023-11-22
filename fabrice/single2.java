class Main 
{
  public static void main(String[] args) 
{

    Dog labrador = new Dog();

    labrador.name = "SIMBA";
    labrador.display();
    labrador.eat();

  }
}
class petAnimal
{

  String name;
  public void eat() 
{
    System.out.println("simba can eat");
  }
}

class Dog extends petAnimal 
{

  public void display() 
{
    System.out.println("My name is " + name);
  }
}
