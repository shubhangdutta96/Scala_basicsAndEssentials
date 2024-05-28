package part1_Basics

object ValuesVariablesTypes extends App{
  val x = 5
  //  x=10 the re-assignment of variables  is not allowed in vals
  //  for this there are special datatypes known as VAR
  var y = 10
  y = 20
  //  println(x)
  //  println(y)
  val a =
  {
    if (x > 1) "Hello"
    else "Bye"
  }

  //FUNCTIONS ->
//    def aFunc(name: String, age: Int): String =
//      "Hello my name is " + name + " " + "and my age is " + age
//    println(aFunc("david", 12))
//
//    def factorial(x: Int): Int =
//      if (x <= 0) x else x * factorial(x - 1)
//    println(factorial(5))
//
//    def fibonacci(a:Int): Int=
//      if(a==1) 1 else fibonacci(a-1) + fibonacci(a-2)
//
//      println(fibonacci(5))
//
//      def checkPrime(b: Int): String=
//          if(b/2==0) "Not a prime"
//          else "Prime"
//        println(checkPrime(9))
//
//  def fibonacci2(n: Int):Int =
//    def fibonacciTailrec(x: Int, last: Int, nextToLast: Int): Int=
//      if(n<=2) 1
//      else fibonacciTailrec(2, 1, 1)
//      if(x>=n) last
//      else fibonacciTailrec(x+1, last+nextToLast, last)

  //    INTERPOLATED STRING
  val name = "Shubhang Dutta"
  val age = 20
  val greeting = s"Hi. my name is $name, and I am $age year old"
  println(greeting)
}
