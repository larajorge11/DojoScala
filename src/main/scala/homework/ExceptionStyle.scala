package homework

object ExceptionStyle extends App {

  def parse(s: String): Int =
    if (s.matches("-?[0-9]+")) s.toInt
    else throw new NumberFormatException(s"${s} is not a valid Integer")

  def reciprocal(i: Int): Double =
    if (i == 0) throw new IllegalArgumentException("Cannot take reciprocal of 0")
    else 1.0 / i

}
