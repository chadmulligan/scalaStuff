package patmat

import patmat.Huffman._

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(98); 
  println("Welcome to the Scala worksheet");$skip(94); 

	val sampleTree = makeCodeTree(
  makeCodeTree(Leaf('x', 1), Leaf('e', 1)),
  Leaf('t', 2)
);System.out.println("""sampleTree  : patmat.Huffman.Fork = """ + $show(sampleTree ));$skip(42); val res$0 = 

 
  times(List('b', 'a', 'b', 'a', 'c'));System.out.println("""res0: List[(Char, Int)] = """ + $show(res$0));$skip(31); val res$1 = 
  
	decode(frenchCode, secret);System.out.println("""res1: List[Char] = """ + $show(res$1))}
}
