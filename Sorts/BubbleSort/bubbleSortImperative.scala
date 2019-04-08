object main {
  def bubbleSort(ys: List[Int]): List[Int] = {
    val xs = ys.toArray

    for {
      i <- 0 until xs.length
      j <- (xs.length - 1) to (i+1) by -1
    } {
      if (xs(j) < xs(j-1)) {
        val tmp = xs(j)
        xs(j) = xs(j-1)
        xs(j-1) = tmp
      }
    }
  return xs.toList
 }
}