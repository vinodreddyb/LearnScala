package com.vinod.scala.chapter5.excercise

object TypeSafety {
  def conditional1[A](x: A, p: A => Boolean, f: A => String): String = {
    if (p(x)) f(x) else ""
  }

  def typeSafety ( i: Int) : String = {
      val a1 = conditional1[Int](i, _ % 3 == 0, _ => "type")
      val a2 = conditional1[Int](i, _ % 5 == 0, _ => "safe")
      val a3 = conditional1[Int](i, _ % 3 > 0 && i % 5 > 0, x => s"$x")
      a1 + a2 + a3
    
  }
  def main(args: Array[String]): Unit = {
    /*for (i <- 1 to 100) {
      val a1 = conditional1[Int](i, _ % 3 == 0, _ => "type")
      val a2 = conditional1[Int](i, _ % 5 == 0, _ => "safe")
      val a3 = conditional1[Int](i, _ % 3 > 0 && i % 5 > 0, x => s"$x")
      println(a1 + a2 + a3)
    }*/
    
    val sq = 1 to 100 map typeSafety
    println(sq)
  }
}