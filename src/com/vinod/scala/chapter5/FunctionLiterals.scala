package com.vinod.scala.chapter5

object FunctionLiterals {
  
  val doubler = (x:Int) => x * 2
  
  def main(args: Array[String]): Unit = {
    println(doubler(2))
  }
}