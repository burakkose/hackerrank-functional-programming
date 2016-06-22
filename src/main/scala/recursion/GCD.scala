package recursion

object Solution {

  def gcd(x: Int, y: Int): Int = {
    if (x == 0) y
    else if (y == 0) x
    else if (x > y) gcd(y, x % y)
    else gcd(x, y % x)
  }

  def acceptInputAndComputeGCD(pair: List[Int]) = {
    println(gcd(pair.head, pair.reverse.head))
  }

  def main(args: Array[String]) {
    acceptInputAndComputeGCD(readLine().trim().split(" ").map(x => x.toInt).toList)
  }
}