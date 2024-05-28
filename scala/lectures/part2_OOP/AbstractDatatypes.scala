package part2_OOP

object AbstractDatatypes extends App
{
  abstract class Animal
  {
    val creatureType: String
    def eat:Unit = ""
  }
//  val animal= new Animal
//   ABSTRACT CLASSES CAN NOT BE INSTANTIATED as IT IS USED to EXTENDS FURTHER


  class Dog extends Animal
  {
    override val creatureType = "canine"
    override def eat = println("crunch crunch")
  }

//  TRAITS
  trait carnivore
  {
    def eat(animal: Animal):Unit
  }
  class crocodile extends Animal with carnivore
  {
    val creatureType: String = "croc"
    def eat(animal:Animal):Unit = println(s"I am $creatureType, I am eating ${animal.creatureType}")
  }
  val croc = new crocodile
  val dog  = new Dog
  croc eat dog
}
