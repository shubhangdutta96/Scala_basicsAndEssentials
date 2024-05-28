package lectures.part3fp

object WhatsaFunction extends App
{
  val adder = new Function2[Int, Int, Int]
    { // adder is of type = (Int, Int) => Int
      override def apply(a:Int, b: Int) = a + b
    }
    println(adder(2, 3))

    // Function types = Function2[a, b, Result] === (a, b) => Result

  def concatenator: (String, String) => String = new Function2[String, String, String] {
    def apply(a: String, b: String) = a + " " + b
  }

  println(concatenator("Hello", "Scala World!"))

  def stringToIntConverter = new Function1[String, Int] {
    override def apply(string: String): Int = string.toInt
  }

  println(stringToIntConverter("3")) 
}
