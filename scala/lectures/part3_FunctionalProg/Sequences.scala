package lectures.part3fp

object Sequences extends App
{
  // sequences
  val aSeq = Seq(1,2,3,4)
  println(aSeq)
  val concatenate = aSeq ++ (Seq(5,6,7,8))
  // ++ -> concatennates the items
  println(concatenate)


  // ranges
//  val aRanges: Seq[Int] = 1 to 10
  val aRanges: Seq[Int] = 1 until 10
  // ('to' and 'until' keyword)
  aRanges.foreach(x=> println(x))
  (1 to 10).foreach(x=> println("Hello"))


  val aList = List(1,2,3,4)
  val prepended = 42 +: aList
  val appended = aList :+ 89
  // trick to remember the operator(+: , :+) -> colon(:) is always to the 'aList' side.
  println(prepended)
  println(appended)
  val apple3 = List.fill(3)("Apple") // Creates a list of length 3 filled with "hello"

  println(apple3)
  println(aList.mkString("-")) // mkString -> used to concatenate elements of a collection into a single string, with an optional separator between elements.


  // arrays
  val aArray = Array(1,2,3,4)
  println(aArray.foreach(x=> println(x)))
  // mutation
  aArray(2) = 0 // syntax sugar for aArray.update(2, 0).
  println(aArray.foreach(x=> println(x)))


  // vectors
  val aVector: Vector[Int] = Vector(1,2,3)
  println(aVector)


  // Vector vs Lists

}
