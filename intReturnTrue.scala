// Check a given integer and return true if it is within 20 of 100 or 300
object intReturnTrue extends App {
  def test(x: Int): Boolean =
    {
      Math.abs(100 - x) <= 20 || Math.abs(300 - x) <= 20
    }
  println("Wynik: " + test(112))
  println("Wynik: " + test(200))
  println("Wynik: " + test(222))
  println("Wynik: " + test(60))
}
