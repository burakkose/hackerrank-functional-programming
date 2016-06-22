package recursion

object Solution {

  def solution(s: String): String = {
    def sol(s: List[Char]): List[Char] = {
      s match {
        case odd :: even :: rest => even :: odd :: sol(rest)
        case Nil => Nil
      }
    }
    sol(s.toList).mkString
  }

  def main(args: Array[String]): Unit = {
    io.Source.stdin.getLines().drop(1).foreach(test => println(solution(test)))
  }
}