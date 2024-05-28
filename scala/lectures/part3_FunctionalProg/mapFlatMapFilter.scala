package lectures.part3fp

object mapFlatMapFilter extends App
{
  val list = List(1,2,3,4)
  println(list)
  println(list.head)
  println(list.tail)

   // map -> It's used to transform each element of the collection according to a given function, producing a new collection of the same type.
   println(list.map(_ + 1))   // map = list[x] = list[x+1]

   // filter
   println(list.filter(_ % 2 == 0))

   // flatMap -> applies a function to each element of a collection and then flattens the results into a single collection.
   val flatMap = (x:Int) => List(x, x+1)
   println(list.flatMap(flatMap))

  //iterating
  val numbers = List(1, 2, 3)
  val chars = List("a", "b", "c")
  val combinations = chars.flatMap(x => numbers.map(y => x+y))  // 'x' and 'y' are uses to iterate in thir respective lists.
  println(combinations)

  // foreach
//  numbers.foreach(x=> println(x + " "))

  // for comprehension
  val combinations1 =
    for
    {
      n <- numbers
      c <- chars
    }
    yield
      {
        n+c
      }
//  println(combinations1)
}
