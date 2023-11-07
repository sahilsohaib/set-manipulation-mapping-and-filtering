object SetManipulation {
  def main(args: Array[String]): Unit = {
    val originalSet = Set(1, 2, 3, 4, 5)

    // Mapping: Doubling each element in the set
    val doubledSet = originalSet.map(_ * 2)

    // Filtering: Selecting only even elements from the set
    val evenSet = originalSet.filter(_ % 2 == 0)

    println(s"Original Set: $originalSet")
    println(s"Doubled Set: $doubledSet")
    println(s"Even Set: $evenSet")
  }
}
