import scala.collection.mutable.ArrayBuffer

//Implementation using pseudo code from CLRS
object main {
  def insertionSort(xs: ArrayBuffer[Int]): Unit = {
    for (j <- 1 to xs.length - 1) {
      val key = xs(j)

      var i = j - 1
      while (i >= 0 && xs(i) > key) {
        xs(i+1) = xs(i)
        i = i - 1
      }
      xs(i+1) = key
    }
  }
}