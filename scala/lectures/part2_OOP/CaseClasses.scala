package lectures.part2_OOP

object CaseClasses extends App
{
  // Declaration:
  case class Person(name:String, age:Int)

    // 1. Class parameters are feilds
    val jim = new Person("Jim", 34)
    println(jim.name)

    // 2. sensible String
    // println(instance) = println(instance.toString)
    println(jim)

    // 3. equals and hashcode implemented OOTB
    val jim2 = new Person("Jim", 34)
    println(jim == jim2)

    // 4. CC's have handy copy method
    val jim3 = jim.copy(age = 45)

    // 5. CC's have companion objects
    val thePerson = Person
    val mary = Person("Mary", 21) // Apply method implementation


}
