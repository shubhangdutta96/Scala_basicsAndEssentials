package lectures.part4_PatternMatching

object PatternMatching extends App
{
  trait Expr

  case class Number(n: Int) extends Expr

  case class Sum(e1: Expr, e2: Expr) extends Expr

  case class Prod(e1: Expr, e2: Expr) extends Expr

  def show(e: Expr): String = e match {
    case Number(n) => s"$n"
    case Sum(e1, e2) => show(e1) + "+" + show(e2)
    case Prod(e1, e2) =>
    {
      def mayBeShow(exp: Expr) = exp match
      {
        case Prod(_, _) => show(exp)
        case Number(_) => show(exp)
        case _ => "(" + show(exp) + ")"
      }
      mayBeShow(e1) + " * " + mayBeShow(e2)
    }
  }
  println(show(Sum(Number(2), Number(3))))
  println(show(Prod(Sum(Number(2), Number(3)), Number(4))))
}