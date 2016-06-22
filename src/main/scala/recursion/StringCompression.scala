package recursion

object Solution {

  def solution(s: String) = {
    def solutionAcc(s: List[Char], prev: Char, count: Int): List[Char] = {
      s match {
        case head :: tail =>
          if (head == prev) solutionAcc(tail, prev, count + 1)
          else if (count != 1) s"${prev}${count}".toList ::: solutionAcc(tail, head, 1)
          else prev :: solutionAcc(tail, head, 1)
        case Nil => s"""${prev}${if (count != 1) count else ""}""".toList ::: Nil
      }
    }
    val keys = s.toList
    keys match {
      case head :: tail => solutionAcc(tail, head, 1) mkString
      case _ => ""
    }
  }

  def main(args: Array[String]): Unit = {
    val text = io.StdIn.readLine()
    println(solution(text))
  }
}