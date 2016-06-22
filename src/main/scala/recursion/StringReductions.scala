package recursion

object Solution {
  def solution(str: String):String = {
    def solutionAcc(s: List[Char], charset: Set[Char] = Set()): List[Char] = {
      s match {
        case head :: tail =>
          if (!charset.contains(head)) head :: solutionAcc(tail, charset + head)
          else solutionAcc(tail, charset)
        case _ => Nil
      }
    }
    solutionAcc(str.toList).mkString
  }

  def main(args: Array[String]): Unit = {
    val s = io.StdIn.readLine()
    println(solution(s))
  }
}