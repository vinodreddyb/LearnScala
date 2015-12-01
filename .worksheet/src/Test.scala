object Test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  def upper(strings : String*) = strings.map(_.toUpperCase());System.out.println("""upper: (strings: String*)Seq[String]""")}
}

println(Test.upper("Hello", "World!"))
