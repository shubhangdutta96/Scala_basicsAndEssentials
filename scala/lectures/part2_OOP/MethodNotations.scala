package part2_OOP
import scala.language.postfixOps

object MethodNotations extends App
{
  class Person(val name: String, favoriteMovie: String, val age:Int = 0) {
    def likes(movie: String): Boolean =
        movie == favoriteMovie
    def hangOutWith(person: Person): String =
        s"$name is hannging out with ${person.name}"
    def unary_+ : Person =
      new Person(s"$name", favoriteMovie, age+1)
    def +(nickname: String): Person =
          new Person(s"$name ($nickname)", favoriteMovie)
    def isAlive: Boolean =
          true
    def apply(): String =
          s"$name and  I like $favoriteMovie"
      def learns(thing: String): String = s"$name learns Scala"
    def learnsScala = this learns "Scala"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))


//  OPERATORS AS METHODS NAME in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom)
  println((mary + "the rockstar")())


  // INFIX NOTATION(method must have single parameter) - Operator Notation(Syntactic Sugar)
  class sum(x: Int)
  {
    def Sum(y: Int) =
      x + y
  }
  val name = new sum(1)
  println(name Sum 5)


  //PREFIX NOTATION ->
  println("Prefix Notation -> ")
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  println((+mary).age)
  println(x)
  println(y)
  //  unary prefix only works with + - ~ !


  //POSTFIX NOTATIONS
  println(mary isAlive)   // only works with scala.language.postfixOps
  println(mary learnsScala)

}
