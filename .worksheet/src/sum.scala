object sum {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(147); 
 def sum(f: Int => Int) : (Int,Int) => Int = {
  def sumF(a: Int, b: Int): Int =
   if (a > b) 0
   else f(a) + sumF(a+1,b)
   sumF
 };System.out.println("""sum: (f: Int => Int)(Int, Int) => Int""");$skip(35); 
  def sumCube = sum(x => x * x* x);System.out.println("""sumCube: => (Int, Int) => Int""");$skip(15); val res$0 = 
  sumCube(1,2);System.out.println("""res0: Int = """ + $show(res$0));$skip(26); val res$1 = 
  sum(x=> x * x * x)(1,2);System.out.println("""res1: Int = """ + $show(res$1));$skip(103); 
  
  def sumNew(f: Int => Int)(a: Int, b: Int) : Int =
  if(a > b) 0  else  f(a) + sumNew(f)(a + 1, b);System.out.println("""sumNew: (f: Int => Int)(a: Int, b: Int)Int""");$skip(34); val res$2 = 
  
  sumNew(x => x * x * x) (1,2);System.out.println("""res2: Int = """ + $show(res$2))}
}
