package lectures.part2_OOP
import playground.Cinderella

object PackagingAndImports extends App
{
  // package members are accesible by their simple name
  val writer = new Writer("Daniel", "Rock the JVM", 2018)

   // import the package
//   val princess = new Cinderella   // import playground.Cinderella
  val princess = new playground.Cinderella  // fully qualified name

  // packages are in hierarchy

  // package Object

}
