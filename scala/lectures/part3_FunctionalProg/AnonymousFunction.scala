package lectures.part3fp

object AnonymousFunction extends App
{
  val adder = (x:Int) => x*2

  val doubler: (Int, Int) => Int = (a: Int, b:Int) => a + b
// if there are multiple parameters put them in parenthesis

  println(doubler(2, 3))

//  MOAR Syntactic Sugar
  val doubler2: (Int, Int) => Int = _ + _   // equivalent to (a: Int, b:Int) => a + b

  val something = () => 3
  // careful
  println(something)  // function itself
  println(something())  // Anonymous Function(lambda function) call -> requires parenthesis while calling
}
