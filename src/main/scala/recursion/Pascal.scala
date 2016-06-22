package recursion

object Solution {

  //x is row, y is column
  def pascal(x: Int, y: Int): Int = {
    if (y == 0 || y == x) 1 else pascal(x - 1, y - 1) + pascal(x - 1, y)
  }

  def main(args: Array[String]): Unit = {
    val row = io.StdIn.readInt()
    (0 until row).foreach { current =>
      println((0 to current).map(pascal(current, _)).mkString(" "))
    }
  }
}