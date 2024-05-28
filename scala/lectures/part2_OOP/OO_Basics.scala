package lectures.part2_OOP

object OO_Basics extends App 
{
    //  val person = new Person("Shubhang", 20)
    //  println(person.age)
    val writer = Writer("Charles", "Dickens", 1812)
    val novel = Novel("Great Expectations", 1861, writer)
    println(novel.authorAge)
    println(novel.isWrittenBy(writer))
    val counter = new Counter
    //  counter.inc.print
  }
  //class Person(name:String, val age:Int)
  // class parameters are not Feilds to declare it feilds, must add val or var keyword before it

  class Writer(firstName: String, surName: String, val year: Int) {
    def fullName = firstName + " " + surName
  }

  class Novel(name: String, year: Int, author: Writer) {
    def authorAge = year - author.year

    def isWrittenBy(author: Writer) = author == this.author

    def copy(newYear: Int) = new Novel(name, newYear, author)
  }

  class Counter(count: Int = 0) {
    def inc = {
      println("Incrementing")
      new Counter(count + 1) //IMMUTABILITY
    }

    def inc(n: Int): Counter = {
      if (n <= 0) this
      else inc.inc(n - 1)
    }
  }

