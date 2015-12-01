object chapter4 {

	def fives(c:Int , n:Int): Unit = {
		if(c <= n) {
			println(c)
			fives( c + 5, n)
		}
	}
	
	fives(0,50)
	
	@
}