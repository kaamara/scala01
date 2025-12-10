//  Write a Scala program to check two given integers, and return true if one of them is 30 or if their sum is 30.
object twoint extends App {
  def test(x: Int, y: Int): Boolean =
  {
    x == 30 || y == 30 || x + y == 30
  }
  println("Wynik: " + test(30, 0))
  println("Wynik: " + test(25, 5))
  println("Wynik: " + test(30, 20))
  println("Wynik: " + test(59, 26))
}
