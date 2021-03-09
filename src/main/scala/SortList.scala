object SortList extends App {
  def bubbleSort(list: Seq[Int]): (Int, List[Int]) = {
    list match {
      case first :: Nil => (first, List[Int]())
      case first :: rest => {
        val (max, lastList) = bubbleSort(rest)
        if (first < max)
          (max, first :: lastList)
        else
          (first, max :: lastList)
      }
    }
  }

  def insertionSort(list: Seq[Int]): List[Int] = {
    list.foldRight(List[Int]())((each, acc) => {
      val (first, rest) = acc.partition(_ > each)
      first ::: List(each) ::: rest
    })
  }

  val inputList = Seq(3, 4, 6, 2, 34, 7, 8, 3, 4, 6, 3)
  val insertionSortResult = insertionSort(inputList)
  println("insertionSort : " + insertionSortResult)

  val (first, rest) = bubbleSort(inputList)
  println("bubbleSort : " + first :: rest)

}
