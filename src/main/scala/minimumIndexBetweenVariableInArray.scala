object minimumIndexBetweenVariableInArray extends App {
//claculatr minimum index distance Sub-array
  def findMinimumDistance(list: List[Int], x: Int, y: Int): Option[Int] = {
    var ix = -1
    var iy = -1
    var flag = false;
    var minDistance: Option[Int] = None

    for ((eachValue, index) <- list.zipWithIndex) {
      if (x == eachValue) {
        ix = index
        flag = true
      }
      if (y == eachValue) {
        iy = index
        flag = true
      }
      if (flag && ix > -1 && iy > -1 && math.abs(ix - iy) < minDistance
            .getOrElse(Int.MaxValue)) {
        minDistance = Some(math.abs(ix - iy))
        flag = false

      }
    }
    minDistance
  }

  val list = List(1, 2, 3, 2)
  val minDistaceResult = findMinimumDistance(list, 1, 2)
  print("minDistaceResult : " + minDistaceResult)

}
