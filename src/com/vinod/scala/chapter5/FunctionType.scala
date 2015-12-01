package com.vinod.scala.chapter5

object FunctionType {
  
  def double(x:Int) : Int =  x * 2
  
  var myDouble : (Int) => Int = double
  
  def max(a:Int, b:Int) : Int = if(a > b) a else b
  
  var myMax : (Int,Int) => Int = max
  var myMax1 = max _  // funtion type with wild card operator _
  
  def logStart() = "=" * 50 + "\nStarting NOW\n" + "=" * 50
  
  val start : () => String = logStart // function type with no input param
  def main(args: Array[String]): Unit = {
     println(myDouble(3))
     println(myMax(2,5))
     println(myMax1(2,4))
     println(start())
  }
}