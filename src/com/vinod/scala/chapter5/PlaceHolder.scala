package com.vinod.scala.chapter5

object PlaceHolder {
  
  def safeString(s:String, f: String => String) = {
    if(s != null) f(s) else s
  }
  
  def main(args: Array[String]): Unit = {
    val plcaeholder = safeString("Vinod", _.reverse)
    val normal = safeString("Vinod", s => s.reverse)
    println(plcaeholder)
    println(normal)
  }
}