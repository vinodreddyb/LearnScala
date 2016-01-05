package com.vinod.scala.chapter5

object HighOrderFunction {
  
  def safeString(s:String, f: String => String) : String = {
    if(s != null) f(s) else s
  }
  
  def reverser(s:String) = s.reverse
  
  def main(args: Array[String]): Unit = {
    val reverse = safeString("Vinod", reverser)
    println(reverse)
  }
}