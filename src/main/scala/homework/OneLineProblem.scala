package homework

object OneLineProblem extends App{

  def issuePerformance(): Unit = {
    time{List(1,2,3,4,5).map(_ + 1).head}
    //println(data)
  }

  def improvedPerformance(): Unit = {
    time{
      var data = List(1,2,3,4,5)
      var dat1 = data.map(_ + 1)
      var r = dat1.head
      //println(r)
    }
  }

  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0) + "ns")
    result
  }

  issuePerformance()
  improvedPerformance()
}
