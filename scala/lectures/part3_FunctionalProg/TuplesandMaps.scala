package lectures.part3fp

object TuplesandMaps extends App
{
//  // tuples -> finite ordered "lists"
//  val aTuple = (2, "hello Scala")
//  println(aTuple)
//  println(aTuple._1)  // 2
//  println(aTuple.copy(_2="good bye java"))
//  println(aTuple.swap)  // (hello scala, 2)
//
//
//  // Maps -> key => values
//  val aMap:Map[String, Int] = Map()  // empty map
//
//  val phoneBook = Map(("Shubh",123), "Ash"-> 456) // a->b = (a,b)
//  println(phoneBook)
//
//  // add pairing
//  val pairing = ("Mary", 789)
//  println(phoneBook + pairing)
//
//  // functionals on Map
//  // Map, flatMap, filter
//  println(phoneBook.map(pair => pair._1.toLowerCase -> pair._2))
//  println(phoneBook.view.mapValues(nums => nums*10).toMap)
//  // mapValues -> used to transform the values of a map while keeping the keys unchanged. It takes a function as a parameter, which is applied to each value in the map, and returns a new map with the same keys but transformed values.
//  println(phoneBook.view.filterKeys(x => x.startsWith("A")).toMap)
//
//  // groupBy Method
//  val list = List("Bob", "James", "Mary", "Jim", "Angela", "Daniel")
//  println(list.groupBy(f => f.charAt(0)))


  // EXERCISES ->
  val aMap1 = Map("JIM"-> 20, "Jim"-> 10)
  println(aMap1)
  println(aMap1.map(pair=>pair._1.toLowerCase -> pair._2))  // keys in Map are unique

  def add(network: Map[String, Set[String]], person:String):Map[String, Set[String]]=
  {
    network + (person -> Set())
  }

  def friend(network: Map[String, Set[String]], a:String, b:String):Map[String, Set[String]]=
  {
    val friendsA = network(a)
    val friendsB = network(b)
    network + (a -> (friendsA + b)) + (b -> (friendsB + a))
  }

  def unfriend(network: Map[String, Set[String]], a:String, b:String):Map[String, Set[String]]=
  {
    val friendsA = network(a)
    val friendsB = network(b)
    network + (a -> (friendsA - b)) + (b -> (friendsB - a))
  }

//  def remove(network: Map[String, Set[String]], person:String):Map[String, Set[String]]=
//  {
//    def removeAux(friends: Set[String], networkAcc: Map[String, Set[String]]): Map[String, Set[String]] =
//      if (friends.isEmpty) networkAcc
//      else removeAux(friends.tail, unFriend(networkAcc, person, friends.head))
//
//      val unfriended = removeAux(network(person), network) // this removes the Set[String] of the corresponding person
//      unfriended - person // this removes the entire person from the Set
//  }

  val empty:Map[String, Set[String]] = Map()
  val network = add(add(empty, "Job"), "Marry")
  println(network)
  println(friend(network, "Marry", "Job"))
  println(unfriend(network, "Marry", "Job"))
}
