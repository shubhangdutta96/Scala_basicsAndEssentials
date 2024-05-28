package lectures.part2_OOP

object Generics extends App 
{
  class MyList[A]
  {
    def eat = println("eats")
  }
  val listofIntegers = new MyList[Int]

  // Generic methods
  object MyList {
    def name[A]: MyList[A] = ???
  }
  MyList.name[Int]


  // variance problems
  class Animal
  class Dog extends Animal
  class cat extends Animal

  // 1. yes List[cat] extends List[Animal] = COVARIANCE
  class coVariance[+A]
  val animal:Animal = new cat
  val animalList:coVariance[Animal] = new coVariance[cat]

  // 2. no = INVARIANCE
  class inVariance[B]
  val inVariance:inVariance[Animal] = new inVariance[Animal]

  // 3. CONTRAVARIANCE = opposite Relation to CoVariance
  class contraVariance[-A]
  val contraVariantList:contraVariance[cat] = new contraVariance[Animal]

  // bounded types
  class cage[A <: Animal](animal : A)

  // class cage infers only that parameters, which are the subtypes of class Animal
  class car
//  val car = new cage(new car) = not possible
  val cage = new cage(new cat)  // = possible because cat is subtype of class Animal


// Anonymous Class
  class person
  {
    def name = "Shubhang"
  }
  val person = new person{
    override def name = "Dutta"
  }
  // Override the feilds of methods on the spot, whether the class is abstract or not
  println(person.name)
}