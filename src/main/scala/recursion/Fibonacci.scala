package recursion

object Solution {

  def fibonacci(x: Int): Int = {
    def fibonacciAcc(a: Int, b: Int, current: Int): Int = {
      if (current == x) b
      else fibonacciAcc(b, a + b, current + 1)
    }
    if(x < 2) 1
    else fibonacciAcc(0, 1, 2)
  }

  def main(args: Array[String]) {
    println(fibonacci(readInt()))
  }
}
