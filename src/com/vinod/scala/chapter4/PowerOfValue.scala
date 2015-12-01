
package com.vinod.scala.chapter4

object PowerOfValue {
  
  @annotation.tailrec
  def power(x: Int , y: Int, z: Double = 1.0): Double = {
    if( y < 1) z
    else power( x, y-1, z * x)
  }
  
  def hi() = {
    println("Hi")
  }
  def plus(sum:Int) : Int = {
    sum
  }
  def stringFy[A,B,C]( t:(A,B,C)) : (A, String, B, String, C, String) = {
    (t._1,t._1.toString(),t._2, t._2.toString(),t._3,t._3.toString())
  }
  
  def main(args: Array[String]): Unit = {
    val s = power(2,4)
    println(s)
    
    val st : (Int, String,Char,String, Int, String) = stringFy( (1,'c',3))
    println(st)
    
    hi()
    val sum = plus {1 + 2}
    println(sum)
  }
}