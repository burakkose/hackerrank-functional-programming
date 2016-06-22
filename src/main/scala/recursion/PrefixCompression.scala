package recursion

import scala.annotation.tailrec

object Solution {

  def solution(s1: String, s2: String) = {
    @tailrec
    def prefix(s1: List[Char], s2: List[Char], count: Int): Int = {
      if (s1.isEmpty || s2.isEmpty) count
      else if (s1.head == s2.head) prefix(s1.tail, s2.tail, count + 1)
      else count
    }
    val pre = prefix(s1.toList, s2.toList, 0)
    val pref = s1.take(pre)
    val ns1 = s1.drop(pre)
    val ns2 = s2.drop(pre)
    println(s"${pre} ${pref}")
    println(s"${ns1.length} ${ns1}")
    println(s"${ns2.length} ${ns2}")
  }

  def main(args: Array[String]): Unit = {
    val Array(s1, s2) = io.Source.stdin.getLines().toArray
    solution(s1, s2)
  }
}