package com.vinod.scala.chapter5.excercise

object FindMax {
  
  val max = (x:Int, y:Int) => if (x >y) x else y
  
  def pickMax( t: (Int, Int, Int), f: (Int, Int) => Int) : Int = {
    f(t._1, f(t._2,t._3))    
  }
  
  def conditional[A](x:A, p: A => Boolean, f: A => A) = {
    if(p(x)) f(x) else x
  }
  
 
  
  def main(args: Array[String]): Unit = {
   val ma =  pickMax((10,2,3) , max)
   println(ma)
   
   val a = conditional[String]("Hisssssss", _.size > 4 , _.reverse)
   println(a)
   /*for (i <- 1 to 100) {
       val a1 = conditional[Int](i, _ % 3 == 0, x => { print("type"); 0 })
        val a2 = conditional[Int](i, _ % 5 == 0, x => { print("safe"); 0 })
        if (a1 > 0 && a2 > 0) print(i)
        println("")
    }*/
   
  
   
  }
}