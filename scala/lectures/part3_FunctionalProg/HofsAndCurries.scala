package lectures.part3fp

object HofsAndCurries extends App {
  val aFunction: (Int, (String, (Int => Boolean)) => Int) => (Int => Int) = null

  //  function that applies a func. n times over a value x
  //  nTimes(f, n, x)

  //  nTimes(f, 3, x) = f(f(f(x)))
  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if (n <= 0) x
    else nTimes(f, n - 1, 1)

  //     function f ->
  val f = (x: Int) => x + 1
//  println(nTimes(f, 10, 1))

  def nTimesBetter(f: Int => Int, n: Int): (Int => Int) =
      if (n <= 0) (x: Int) => x
      else (x: Int) => nTimesBetter(f, n - 1)(f(x))
  val f1 = nTimesBetter(f, 10)
//  println(f1(1))

  // Curried Functions -> used to call the functions partially

  def curryFunction(x: Int)(y:String)=
    x+y
  println(curryFunction(1)("Scala"))

  

  def fullName(firstName:String)(lastName:String):String=
  firstName+lastName

  val name = fullName("Shubhang ")
  println(fullName("Shubhang ")("Dutta"))
}
