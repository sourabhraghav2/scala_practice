object ReverseString extends App {
  def reverse(str: String): String = {
    val resp = str.length == 0 match {
      case false =>
        str.charAt(str.length - 1) + reverse(str.substring(0, str.length - 1))
      case _ => ""
    }
    resp
  }
  val reversed = reverse("Sorabh")
  print("Reversed string : " + reversed)
}
