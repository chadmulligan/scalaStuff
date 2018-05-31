package recfun

object tests {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def balance(chars: List[Char]): Boolean = {
    
    def count(acc: Int, chars: List[Char]): Int =
      if (chars.isEmpty) acc
      else if (chars.head.toString==")" && acc<1) -1
      else if (chars.head.toString=="(") count(acc+1, chars.tail)
      else if (chars.head.toString==")") count(acc-1, chars.tail)
      else count(acc, chars.tail)
      
      (count(0, chars) == 0)
  }                                               //> balance: (chars: List[Char])Boolean
  
balance("".toList) == true                        //> res0: Boolean = true
balance("(".toList) == false                      //> res1: Boolean = true
balance(")".toList) == false                      //> res2: Boolean = true
balance("x".toList) == true                       //> res3: Boolean = true
balance("((".toList) == false                     //> res4: Boolean = true
balance(")(".toList) == false                     //> res5: Boolean = true
balance("x(".toList) == false                     //> res6: Boolean = true
balance("()".toList) == true                      //> res7: Boolean = true
balance("))".toList) == false                     //> res8: Boolean = true
balance("x)".toList) == false                     //> res9: Boolean = true
balance("(x".toList) == false                     //> res10: Boolean = true
balance(")x".toList) == false                     //> res11: Boolean = true
balance("xx".toList) == true                      //> res12: Boolean = true
balance("(((".toList) == false                    //> res13: Boolean = true
balance(")((".toList) == false                    //> res14: Boolean = true
balance("x((".toList) == false                    //> res15: Boolean = true
balance("()(".toList) == false                    //> res16: Boolean = true
balance("))(".toList) == false                    //> res17: Boolean = true
balance("x)(".toList) == false                    //> res18: Boolean = true
balance("(x(".toList) == false                    //> res19: Boolean = true
balance(")x(".toList) == false                    //> res20: Boolean = true
balance("xx(".toList) == false                    //> res21: Boolean = true
balance("(()".toList) == false                    //> res22: Boolean = true
balance(")()".toList) == false                    //> res23: Boolean = true
balance("x()".toList) == true                     //> res24: Boolean = true
balance("())".toList) == false                    //> res25: Boolean = true
balance(")))".toList) == false                    //> res26: Boolean = true
balance("x))".toList) == false                    //> res27: Boolean = true
balance("(x)".toList) == true                     //> res28: Boolean = true
balance(")x)".toList) == false                    //> res29: Boolean = true
balance("xx)".toList) == false                    //> res30: Boolean = true
balance("((x".toList) == false                    //> res31: Boolean = true
balance(")(x".toList) == false                    //> res32: Boolean = true
balance("x(x".toList) == false                    //> res33: Boolean = true
balance("()x".toList) == true                     //> res34: Boolean = true
balance("))x".toList) == false                    //> res35: Boolean = true
balance("x)x".toList) == false                    //> res36: Boolean = true
balance("(xx".toList) == false                    //> res37: Boolean = true
balance(")xx".toList) == false                    //> res38: Boolean = true
balance("xxx".toList) == true                     //> res39: Boolean = true
balance("((((".toList) == false                   //> res40: Boolean = true
balance(")(((".toList) == false                   //> res41: Boolean = true
balance("x(((".toList) == false                   //> res42: Boolean = true
balance("()((".toList) == false                   //> res43: Boolean = true
balance("))((".toList) == false                   //> res44: Boolean = true
balance("x)((".toList) == false                   //> res45: Boolean = true
balance("(x((".toList) == false                   //> res46: Boolean = true
balance(")x((".toList) == false                   //> res47: Boolean = true
balance("xx((".toList) == false                   //> res48: Boolean = true
balance("(()(".toList) == false                   //> res49: Boolean = true
balance(")()(".toList) == false                   //> res50: Boolean = true
balance("x()(".toList) == false                   //> res51: Boolean = true
balance("())(".toList) == false                   //> res52: Boolean = true
balance(")))(".toList) == false                   //> res53: Boolean = true
balance("x))(".toList) == false                   //> res54: Boolean = true
balance("(x)(".toList) == false                   //> res55: Boolean = true
balance(")x)(".toList) == false                   //> res56: Boolean = true
balance("xx)(".toList) == false                   //> res57: Boolean = true
balance("((x(".toList) == false                   //> res58: Boolean = true
balance(")(x(".toList) == false                   //> res59: Boolean = true
balance("x(x(".toList) == false                   //> res60: Boolean = true
balance("()x(".toList) == false                   //> res61: Boolean = true
balance("))x(".toList) == false                   //> res62: Boolean = true
balance("x)x(".toList) == false                   //> res63: Boolean = true
balance("(xx(".toList) == false                   //> res64: Boolean = true
balance(")xx(".toList) == false                   //> res65: Boolean = true
balance("xxx(".toList) == false                   //> res66: Boolean = true
balance("((()".toList) == false                   //> res67: Boolean = true
balance(")(()".toList) == false                   //> res68: Boolean = true
balance("x(()".toList) == false                   //> res69: Boolean = true
balance("()()".toList) == true                    //> res70: Boolean = true
balance("))()".toList) == false                   //> res71: Boolean = true
balance("x)()".toList) == false                   //> res72: Boolean = true
balance("(x()".toList) == false                   //> res73: Boolean = true
balance(")x()".toList) == false                   //> res74: Boolean = true
balance("xx()".toList) == true                    //> res75: Boolean = true
balance("(())".toList) == true                    //> res76: Boolean = true
balance(")())".toList) == false                   //> res77: Boolean = true
balance("x())".toList) == false                   //> res78: Boolean = true
balance("()))".toList) == false                   //> res79: Boolean = true
balance("))))".toList) == false                   //> res80: Boolean = true
balance("x)))".toList) == false                   //> res81: Boolean = true
balance("(x))".toList) == false                   //> res82: Boolean = true
balance(")x))".toList) == false                   //> res83: Boolean = true
balance("xx))".toList) == false                   //> res84: Boolean = true
balance("((x)".toList) == false                   //> res85: Boolean = true
balance(")(x)".toList) == false                   //> res86: Boolean = true
balance("x(x)".toList) == true                    //> res87: Boolean = true
balance("()x)".toList) == false                   //> res88: Boolean = true
balance("))x)".toList) == false                   //> res89: Boolean = true
balance("x)x)".toList) == false                   //> res90: Boolean = true
balance("(xx)".toList) == true                    //> res91: Boolean = true
balance(")xx)".toList) == false                   //> res92: Boolean = true
balance("xxx)".toList) == false                   //> res93: Boolean = true
balance("(((x".toList) == false                   //> res94: Boolean = true
balance(")((x".toList) == false                   //> res95: Boolean = true
balance("x((x".toList) == false                   //> res96: Boolean = true
balance("()(x".toList) == false                   //> res97: Boolean = true
balance("))(x".toList) == false                   //> res98: Boolean = true
balance("x)(x".toList) == false                   //> res99: Boolean = true
balance("(x(x".toList) == false                   //> res100: Boolean = true
balance(")x(x".toList) == false                   //> res101: Boolean = true
balance("xx(x".toList) == false                   //> res102: Boolean = true
balance("(()x".toList) == false                   //> res103: Boolean = true
balance(")()x".toList) == false                   //> res104: Boolean = true
balance("x()x".toList) == true                    //> res105: Boolean = true
balance("())x".toList) == false                   //> res106: Boolean = true
balance(")))x".toList) == false                   //> res107: Boolean = true
balance("x))x".toList) == false                   //> res108: Boolean = true
balance("(x)x".toList) == true                    //> res109: Boolean = true
balance(")x)x".toList) == false                   //> res110: Boolean = true
balance("xx)x".toList) == false                   //> res111: Boolean = true
balance("((xx".toList) == false                   //> res112: Boolean = true
balance(")(xx".toList) == false                   //> res113: Boolean = true
balance("x(xx".toList) == false                   //> res114: Boolean = true
balance("()xx".toList) == true                    //> res115: Boolean = true
balance("))xx".toList) == false                   //> res116: Boolean = true
balance("x)xx".toList) == false                   //> res117: Boolean = true
balance("(xxx".toList) == false                   //> res118: Boolean = true
balance(")xxx".toList) == false                   //> res119: Boolean = true
balance("xxxx".toList) == true                    //> res120: Boolean = true
}