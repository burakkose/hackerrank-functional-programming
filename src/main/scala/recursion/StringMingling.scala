package recursion

object Solution {
  def main(args: Array[String]): Unit = {
    val s1 = io.StdIn.readLine()
    val s2 = io.StdIn.readLine()
    println(s1 zip s2 map { case (c1, c2) => c1.toString + c2.toString } mkString)
  }
}