// Write a Scala program to compute the sum of the two given integer values. If the two values are the same, then return triples their sum.
object scalabasic extends App {
  def test(x: Int, y: Int): Int =
  {
    if (x == y)
      (x + y) * 3
    else
      x + y
  }
    println("Wynik: " + test(1, 2))
    println("Wynik: " + test(2, 2))
}