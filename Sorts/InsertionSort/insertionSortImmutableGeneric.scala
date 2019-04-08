import scala.util.Sorting

object main {
  def sort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = xs match {
    case Nil => Nil
    case x :: xs => insert(x, sort(xs))
  }

  def insert[T](x: T, xs: List[T])(implicit ord: Ordering[T]): List[T] = xs match {
    case Nil => x :: Nil
    case y :: ys => if (ord.lt(x, y)) x :: y :: ys else y :: insert(x, ys)
  }
}