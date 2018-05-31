package patmat

import patmat.Huffman._

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	val sampleTree = makeCodeTree(
  makeCodeTree(Leaf('x', 1), Leaf('e', 1)),
  Leaf('t', 2)
)                                                 //> sampleTree  : patmat.Huffman.Fork = Fork(Fork(Leaf(x,1),Leaf(e,1),List(x, e)
                                                  //| ,2),Leaf(t,2),List(x, e, t),4)

 
  times(List('b', 'a', 'b', 'a', 'c'))            //> res0: List[(Char, Int)] = List((b,2), (a,2), (c,1))
  
	decode(frenchCode, secret)                //> res1: List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
}