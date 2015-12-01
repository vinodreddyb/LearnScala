object sum {
 def sum(f: Int => Int) : (Int,Int) => Int = {
  def sumF(a: Int, b: Int): Int =
   if (a > b) 0
   else f(a) + sumF(a+1,b)
   sumF
 }                                                //> sum: (f: Int => Int)(Int, Int) => Int
  def sumCube = sum(x => x * x* x)                //> sumCube: => (Int, Int) => Int
  sumCube(1,2)                                    //> res0: Int = 9
  sum(x=> x * x * x)(1,2)                         //> res1: Int = 9
  
  def sumNew(f: Int => Int)(a: Int, b: Int) : Int =
  if(a > b) 0  else  f(a) + sumNew(f)(a + 1, b)   //> sumNew: (f: Int => Int)(a: Int, b: Int)Int
  
  sumNew(x => x * x * x) (1,2)                    //> res2: Int = 9
}