package homework

object EitherStyle extends App {

  def parse(s: String): Either[Exception, Int] =
    if (s.matches("-?[0-9]+")) Right(s.toInt)
    else Left(new NumberFormatException(s"${s} is not a valid Integer"))

  def reciprocal(i: Int): Either[Exception, Double] =
    if(i == 0) Left(new IllegalArgumentException("hjhjjh"))
    else Right(1.0 / i)

}
