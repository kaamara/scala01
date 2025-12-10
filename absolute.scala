/*  Write a Scala program to get the absolute difference between n and 51.
If n is greater than 51 return triple the absolute difference.
 */
object absolute extends App {
  def test(x: Int): Int =
  {
  val roznica = math.abs(x - 51)
    if (x > 51)
      3 * roznica
    else
      roznica
  }
    println("Wynik: " + test(65))
    println("Wynik: " + test(37))
}
