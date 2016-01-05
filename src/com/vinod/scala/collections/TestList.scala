package com.vinod.scala.collections

import scala.collection.mutable.ListBuffer

object TestList {
  def  add() : ListBuffer[Int] = {
    var li = ListBuffer[Int]()
    for(x <- 1 to 10) {
      li += x
    }
    return li
  }
  
  def main(args: Array[String]): Unit = {
    var lis = add()
    lis.foreach { i => println(s"Element number $i")}
    println("Size----> " + lis.size)
  }
}