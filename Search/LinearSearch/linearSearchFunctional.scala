object main {
  def search[T](xs: List[T], x: T): Option[T] = xs.find(_ == x)
}