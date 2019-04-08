object main {
  def search[T](xs: List[T], x: T): Option[Int] = {
    var result: Option[Int] = None
    for (i <- 0 until xs.length) {
      if (x == xs(i)) {
        result = Some(i)
      }
    }

    result
  }
}