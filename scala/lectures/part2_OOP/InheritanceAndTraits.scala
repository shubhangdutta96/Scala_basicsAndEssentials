package part2_OOP

object InheritanceAndTraits extends App
{
  class Animal
  {
    val creaturetype = "wild"
    def eat = println("nomnom")
  }

//  INHERITANCE
  class cat extends Animal
  {
    def crunch =
      {
        eat
        println("crunch crunch")
      }
  }
  val cat = new cat
  cat.crunch

  class Dog(override val creaturetype: String) extends Animal
  {   // overRIDING -> override val creaturetype = "herbivores"
    override def eat = println("K9")
  }
  val dog = new Dog("herbivores")
  dog.eat
  println(dog.creaturetype)

//  CONSTRUCTORS
class Person(name:String, age: Int)
{ // Auxiliary Constructor ->
  def this(name:String) = this(name, 0)
}
class adult(name:String, age: Int, idCard:Int) extends Person(name)
  val adult = new adult("Shubhang", 20, 55)
 println(adult)
}
