package com.vinod.scala.collections

import scala.collection.mutable.Map
import scala.collection.immutable.ListMap

object TestMap {
  def main(args: Array[String]): Unit = {
    var m = Map[String,String]()
    m += ("AP" -> "Amravathi")
    m += ("TN" -> "Chennai")
    m += ("TS" -> "Hyderabad")
    m += ("KA" -> "Bangalore")
    m.foreach( K => print (s" ${K._1} = ${K._2}"))
    
    //sort by key
    
    var so = m.toSeq.sortBy(_._1)
    
    println(ListMap(so:_*))
    println(so)
    
    println(m.max)
    //Max using keys iterator
    println(m.keysIterator.max)
    
     m += ("KAA" -> "Bangalore")
      m += ("K" -> "Bangalore")
    // Find max using keysIterator and reduceLeft
    println(m.keysIterator.reduceLeft((x,y) => if(x.length < y.length) x else y))
    
  }
}