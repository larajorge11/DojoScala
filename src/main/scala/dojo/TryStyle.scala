package dojo

import scala.util.Try

object TryStyle {

  def parseInt(s: String): Try[Int] = {
    Try(s.toInt)
  }

  def tryParseInt(): Int = parseInt("2").recover {
    case e: Exception => 0
  }.get

  println(tryParseInt())

  // OPTIONAL, EITHER, TRY (RECOVER)--> Toma los posibles errores y retorna un valor
}
