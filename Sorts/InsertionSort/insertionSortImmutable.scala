object main {
  def insertionSort(xs: List[Int]): List[Int] = xs match {
    case Nil => Nil
    case x :: xs => insert(x, insertionSort(xs))
  }

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case Nil => x :: Nil
    case y :: ys => if (x < y) x :: y :: ys else y :: insert(x, ys)
  }
}