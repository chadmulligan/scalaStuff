package patmat

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import patmat.Huffman._

@RunWith(classOf[JUnitRunner])
class HuffmanSuite extends FunSuite {
  trait TestTrees {
    val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5)
    val t2 = Fork(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), Leaf('d',4), List('a','b','d'), 9)
  }

  test("weight of a larger tree") {
    new TestTrees {
      assert(weight(t1) === 5)
    }
  }

  test("chars of a small tree") {
    new TestTrees {
      assert(chars(t1) === List('a','b'))
    }
  }
  
  test("chars of a larger tree") {
    new TestTrees {
      assert(chars(t2) === List('a','b','d'))
    }
  }
  
  test("make Code Tree"){
    new TestTrees {
      assert(makeCodeTree(Leaf('a',2), Leaf('b',3)).toString == Fork(Leaf('a',2), Leaf('b',3), List('a', 'b'), 5).toString)
    }
  }

  test("string2chars(\"hello, world\")") {
    assert(string2Chars("hello, world") === List('h', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd'))
  }

  test("times"){
    assert(times(List('b', 'a', 'b', 'a', 'c')) === List(('b', 2), ('a', 2), ('c', 1)))
  } 
  
  test("singleton") {
    assert(singleton(List(Leaf('a', 3))) == true )
  }
  
  test("makeOrderedLeafList for some frequency table") {
    assert(makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3))) === List(Leaf('e',1), Leaf('t',2), Leaf('x',3)))
  }

  test("combine of some leaf list") {
    val leaflist = List(Leaf('y', 3), Leaf('e', 3), Leaf('x', 4))
    assert(combine(leaflist) === List(Leaf('x',4), Fork(Leaf('y',3),Leaf('e',3),List('y', 'e'),6)))
  }

  test("decode and encode a very short text should be identity") {
    new TestTrees {
      assert(decode(t1, encode(t1)("ab".toList)) === "ab".toList)
    }
  }
}
