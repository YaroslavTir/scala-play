import scala.collection.mutable.{ListBuffer, ArrayBuffer}

object VectorPlay {
  def main(args: Array[String]) {
    val vector: Vector[Int] = Vector(1, 1, 2, 3, 4, 4, 5)
    val arrayBuffer = ArrayBuffer(1, 2, 3)
    val list: List[Int] = List(1, 2, 3)
    val listBuffer: ListBuffer[Int] = ListBuffer(1, 2, 3)

    println(vector diff arrayBuffer)
    println(vector distinct)
    println("drop")
    println(vector drop 2)
    println(vector dropWhile (_ < 2))
    println(vector filter (_ % 2 == 0))
    println(vector filterNot (_ % 2 == 0))
    println(vector find (_ == 4))
    println(vector.foldLeft(0)((m: Int, n: Int) => m + n))
    println(vector.foldRight(0)((m: Int, n: Int) => m + n))
    println(vector.head)
    println(vector :+ 10)

  }


}
