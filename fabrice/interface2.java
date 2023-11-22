class Demo {
   public static void main(String args[])
 {
      Animal a = new Animal();
      a.eat();
      a.travel();
   }
}
interface AnimalEat 
{
   void eat();
}
interface AnimalTravel 
{
   void travel();
}
class Animal implements AnimalEat, AnimalTravel
 {
   public void eat()
 {
      System.out.println("Animal feeds");
   }
   public void travel()
 {
      System.out.println("Animal excreates. i.e: they moves");
   }
}
