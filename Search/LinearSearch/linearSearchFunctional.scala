object main {
  def search[T](xs: List[T], x: T): Option[Int] = {
    def searchIter[T](xs: List[T], i: Int, x: T): Option[Int] = xs match {
      case Nil => None
      case y :: ys => {
        if (x == y) Some(i)
        else {
          searchIter(ys, i+1, x)
        }
      }
    }

    searchIter(xs, 0, x)
  } 
}