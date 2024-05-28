package part2_OOP

object Object extends App
{
  object Person
  {
    val name = "Shubhang"
    def love(lan : String): String = s"$name loves coding in $lan"
  }
  val person1 = Person
  val person2 = Person
  println(person1 == person2)   // objects are the only instace in itself.
  // We can directly call the content inside an object without creating any insatance of the object
  println(Person.love("Scala"))
  println(Person love "Scala!")

//  Scala Companions
  class Person
  {
    val name = "Shubhang"
    def fullName(surName:String): String = s"$name " + surName
  }
  val mary = new Person
  val tom = new Person
  println(mary fullName "Dutta")
  println(mary == tom)   // classes can ahve multiple instaces.
}
