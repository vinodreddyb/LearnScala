object chapter4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(110); 

	def fives(c:Int , n:Int): Unit = {
		if(c <= n) {
			println(c)
			fives( c + 5, n)
		}
	};System.out.println("""fives: (c: Int, n: Int)Unit""");$skip(15); 
	
	fives(0,50)}
	
	@
}
