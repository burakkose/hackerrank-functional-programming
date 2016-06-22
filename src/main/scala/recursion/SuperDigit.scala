package recursion

import scala.annotation.tailrec

object Solution {
  def solution(n: String, k: Int) = {
    def sum(nums: String) = {
      @tailrec
      def sumAcc(nums: List[Char], res: Int): Int = {
        nums match {
          case head :: tail => sumAcc(tail, res + head.asDigit)
          case Nil => res
        }
      }
      sumAcc(nums.toList, 0).toString
    }
    @tailrec
    def result(num: String): String ={
      if (num.length == 1) {
        if(num == "0") "9" else num
      }
      else result((sum(num).toInt % 9).toString)
    }
    result((sum(n).toInt % 9 * k % 9).toString)
  }

  def main(args: Array[String]) {
    val Array(n, k) = io.StdIn.readLine().split(" ")
    println(solution(n, k.toInt))
  }
}