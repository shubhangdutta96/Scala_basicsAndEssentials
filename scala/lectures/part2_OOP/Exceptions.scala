package lectures.part2_OOP

object Exceptions extends App
{
  // 1. throwing exception
//  val exception = throw new RuntimeException

  // 2. how to catch Exception
  def getInt(withExceptions: Boolean) :Int =
  if(withExceptions) throw new RuntimeException("no Int for you")
  else 42

  try
    {
      getInt(true)
    }
  catch
    {
          // same Exception is written to catch with keyword (=>)
      case e : RuntimeException => println("caught a runtime Exceptions")
    }
  finally
    {
      // code that will get executed NO MATTER WHAT
      println("finally")
    }
}
