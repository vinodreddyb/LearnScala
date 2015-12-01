object Test {
  def upper(strings : String*) = strings.map(_.toUpperCase())
}

println(Test.upper("Hello", "World!"))