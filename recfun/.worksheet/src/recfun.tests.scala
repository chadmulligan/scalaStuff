package recfun

object tests {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(392); 
  
  def balance(chars: List[Char]): Boolean = {
    
    def count(acc: Int, chars: List[Char]): Int =
      if (chars.isEmpty) acc
      else if (chars.head.toString==")" && acc<1) -1
      else if (chars.head.toString=="(") count(acc+1, chars.tail)
      else if (chars.head.toString==")") count(acc-1, chars.tail)
      else count(acc, chars.tail)
      
      (count(0, chars) == 0)
  };System.out.println("""balance: (chars: List[Char])Boolean""");$skip(30); val res$0 = 
  
balance("".toList) == true;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(29); val res$1 = 
balance("(".toList) == false;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(29); val res$2 = 
balance(")".toList) == false;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(28); val res$3 = 
balance("x".toList) == true;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(30); val res$4 = 
balance("((".toList) == false;System.out.println("""res4: Boolean = """ + $show(res$4));$skip(30); val res$5 = 
balance(")(".toList) == false;System.out.println("""res5: Boolean = """ + $show(res$5));$skip(30); val res$6 = 
balance("x(".toList) == false;System.out.println("""res6: Boolean = """ + $show(res$6));$skip(29); val res$7 = 
balance("()".toList) == true;System.out.println("""res7: Boolean = """ + $show(res$7));$skip(30); val res$8 = 
balance("))".toList) == false;System.out.println("""res8: Boolean = """ + $show(res$8));$skip(30); val res$9 = 
balance("x)".toList) == false;System.out.println("""res9: Boolean = """ + $show(res$9));$skip(30); val res$10 = 
balance("(x".toList) == false;System.out.println("""res10: Boolean = """ + $show(res$10));$skip(30); val res$11 = 
balance(")x".toList) == false;System.out.println("""res11: Boolean = """ + $show(res$11));$skip(29); val res$12 = 
balance("xx".toList) == true;System.out.println("""res12: Boolean = """ + $show(res$12));$skip(31); val res$13 = 
balance("(((".toList) == false;System.out.println("""res13: Boolean = """ + $show(res$13));$skip(31); val res$14 = 
balance(")((".toList) == false;System.out.println("""res14: Boolean = """ + $show(res$14));$skip(31); val res$15 = 
balance("x((".toList) == false;System.out.println("""res15: Boolean = """ + $show(res$15));$skip(31); val res$16 = 
balance("()(".toList) == false;System.out.println("""res16: Boolean = """ + $show(res$16));$skip(31); val res$17 = 
balance("))(".toList) == false;System.out.println("""res17: Boolean = """ + $show(res$17));$skip(31); val res$18 = 
balance("x)(".toList) == false;System.out.println("""res18: Boolean = """ + $show(res$18));$skip(31); val res$19 = 
balance("(x(".toList) == false;System.out.println("""res19: Boolean = """ + $show(res$19));$skip(31); val res$20 = 
balance(")x(".toList) == false;System.out.println("""res20: Boolean = """ + $show(res$20));$skip(31); val res$21 = 
balance("xx(".toList) == false;System.out.println("""res21: Boolean = """ + $show(res$21));$skip(31); val res$22 = 
balance("(()".toList) == false;System.out.println("""res22: Boolean = """ + $show(res$22));$skip(31); val res$23 = 
balance(")()".toList) == false;System.out.println("""res23: Boolean = """ + $show(res$23));$skip(30); val res$24 = 
balance("x()".toList) == true;System.out.println("""res24: Boolean = """ + $show(res$24));$skip(31); val res$25 = 
balance("())".toList) == false;System.out.println("""res25: Boolean = """ + $show(res$25));$skip(31); val res$26 = 
balance(")))".toList) == false;System.out.println("""res26: Boolean = """ + $show(res$26));$skip(31); val res$27 = 
balance("x))".toList) == false;System.out.println("""res27: Boolean = """ + $show(res$27));$skip(30); val res$28 = 
balance("(x)".toList) == true;System.out.println("""res28: Boolean = """ + $show(res$28));$skip(31); val res$29 = 
balance(")x)".toList) == false;System.out.println("""res29: Boolean = """ + $show(res$29));$skip(31); val res$30 = 
balance("xx)".toList) == false;System.out.println("""res30: Boolean = """ + $show(res$30));$skip(31); val res$31 = 
balance("((x".toList) == false;System.out.println("""res31: Boolean = """ + $show(res$31));$skip(31); val res$32 = 
balance(")(x".toList) == false;System.out.println("""res32: Boolean = """ + $show(res$32));$skip(31); val res$33 = 
balance("x(x".toList) == false;System.out.println("""res33: Boolean = """ + $show(res$33));$skip(30); val res$34 = 
balance("()x".toList) == true;System.out.println("""res34: Boolean = """ + $show(res$34));$skip(31); val res$35 = 
balance("))x".toList) == false;System.out.println("""res35: Boolean = """ + $show(res$35));$skip(31); val res$36 = 
balance("x)x".toList) == false;System.out.println("""res36: Boolean = """ + $show(res$36));$skip(31); val res$37 = 
balance("(xx".toList) == false;System.out.println("""res37: Boolean = """ + $show(res$37));$skip(31); val res$38 = 
balance(")xx".toList) == false;System.out.println("""res38: Boolean = """ + $show(res$38));$skip(30); val res$39 = 
balance("xxx".toList) == true;System.out.println("""res39: Boolean = """ + $show(res$39));$skip(32); val res$40 = 
balance("((((".toList) == false;System.out.println("""res40: Boolean = """ + $show(res$40));$skip(32); val res$41 = 
balance(")(((".toList) == false;System.out.println("""res41: Boolean = """ + $show(res$41));$skip(32); val res$42 = 
balance("x(((".toList) == false;System.out.println("""res42: Boolean = """ + $show(res$42));$skip(32); val res$43 = 
balance("()((".toList) == false;System.out.println("""res43: Boolean = """ + $show(res$43));$skip(32); val res$44 = 
balance("))((".toList) == false;System.out.println("""res44: Boolean = """ + $show(res$44));$skip(32); val res$45 = 
balance("x)((".toList) == false;System.out.println("""res45: Boolean = """ + $show(res$45));$skip(32); val res$46 = 
balance("(x((".toList) == false;System.out.println("""res46: Boolean = """ + $show(res$46));$skip(32); val res$47 = 
balance(")x((".toList) == false;System.out.println("""res47: Boolean = """ + $show(res$47));$skip(32); val res$48 = 
balance("xx((".toList) == false;System.out.println("""res48: Boolean = """ + $show(res$48));$skip(32); val res$49 = 
balance("(()(".toList) == false;System.out.println("""res49: Boolean = """ + $show(res$49));$skip(32); val res$50 = 
balance(")()(".toList) == false;System.out.println("""res50: Boolean = """ + $show(res$50));$skip(32); val res$51 = 
balance("x()(".toList) == false;System.out.println("""res51: Boolean = """ + $show(res$51));$skip(32); val res$52 = 
balance("())(".toList) == false;System.out.println("""res52: Boolean = """ + $show(res$52));$skip(32); val res$53 = 
balance(")))(".toList) == false;System.out.println("""res53: Boolean = """ + $show(res$53));$skip(32); val res$54 = 
balance("x))(".toList) == false;System.out.println("""res54: Boolean = """ + $show(res$54));$skip(32); val res$55 = 
balance("(x)(".toList) == false;System.out.println("""res55: Boolean = """ + $show(res$55));$skip(32); val res$56 = 
balance(")x)(".toList) == false;System.out.println("""res56: Boolean = """ + $show(res$56));$skip(32); val res$57 = 
balance("xx)(".toList) == false;System.out.println("""res57: Boolean = """ + $show(res$57));$skip(32); val res$58 = 
balance("((x(".toList) == false;System.out.println("""res58: Boolean = """ + $show(res$58));$skip(32); val res$59 = 
balance(")(x(".toList) == false;System.out.println("""res59: Boolean = """ + $show(res$59));$skip(32); val res$60 = 
balance("x(x(".toList) == false;System.out.println("""res60: Boolean = """ + $show(res$60));$skip(32); val res$61 = 
balance("()x(".toList) == false;System.out.println("""res61: Boolean = """ + $show(res$61));$skip(32); val res$62 = 
balance("))x(".toList) == false;System.out.println("""res62: Boolean = """ + $show(res$62));$skip(32); val res$63 = 
balance("x)x(".toList) == false;System.out.println("""res63: Boolean = """ + $show(res$63));$skip(32); val res$64 = 
balance("(xx(".toList) == false;System.out.println("""res64: Boolean = """ + $show(res$64));$skip(32); val res$65 = 
balance(")xx(".toList) == false;System.out.println("""res65: Boolean = """ + $show(res$65));$skip(32); val res$66 = 
balance("xxx(".toList) == false;System.out.println("""res66: Boolean = """ + $show(res$66));$skip(32); val res$67 = 
balance("((()".toList) == false;System.out.println("""res67: Boolean = """ + $show(res$67));$skip(32); val res$68 = 
balance(")(()".toList) == false;System.out.println("""res68: Boolean = """ + $show(res$68));$skip(32); val res$69 = 
balance("x(()".toList) == false;System.out.println("""res69: Boolean = """ + $show(res$69));$skip(31); val res$70 = 
balance("()()".toList) == true;System.out.println("""res70: Boolean = """ + $show(res$70));$skip(32); val res$71 = 
balance("))()".toList) == false;System.out.println("""res71: Boolean = """ + $show(res$71));$skip(32); val res$72 = 
balance("x)()".toList) == false;System.out.println("""res72: Boolean = """ + $show(res$72));$skip(32); val res$73 = 
balance("(x()".toList) == false;System.out.println("""res73: Boolean = """ + $show(res$73));$skip(32); val res$74 = 
balance(")x()".toList) == false;System.out.println("""res74: Boolean = """ + $show(res$74));$skip(31); val res$75 = 
balance("xx()".toList) == true;System.out.println("""res75: Boolean = """ + $show(res$75));$skip(31); val res$76 = 
balance("(())".toList) == true;System.out.println("""res76: Boolean = """ + $show(res$76));$skip(32); val res$77 = 
balance(")())".toList) == false;System.out.println("""res77: Boolean = """ + $show(res$77));$skip(32); val res$78 = 
balance("x())".toList) == false;System.out.println("""res78: Boolean = """ + $show(res$78));$skip(32); val res$79 = 
balance("()))".toList) == false;System.out.println("""res79: Boolean = """ + $show(res$79));$skip(32); val res$80 = 
balance("))))".toList) == false;System.out.println("""res80: Boolean = """ + $show(res$80));$skip(32); val res$81 = 
balance("x)))".toList) == false;System.out.println("""res81: Boolean = """ + $show(res$81));$skip(32); val res$82 = 
balance("(x))".toList) == false;System.out.println("""res82: Boolean = """ + $show(res$82));$skip(32); val res$83 = 
balance(")x))".toList) == false;System.out.println("""res83: Boolean = """ + $show(res$83));$skip(32); val res$84 = 
balance("xx))".toList) == false;System.out.println("""res84: Boolean = """ + $show(res$84));$skip(32); val res$85 = 
balance("((x)".toList) == false;System.out.println("""res85: Boolean = """ + $show(res$85));$skip(32); val res$86 = 
balance(")(x)".toList) == false;System.out.println("""res86: Boolean = """ + $show(res$86));$skip(31); val res$87 = 
balance("x(x)".toList) == true;System.out.println("""res87: Boolean = """ + $show(res$87));$skip(32); val res$88 = 
balance("()x)".toList) == false;System.out.println("""res88: Boolean = """ + $show(res$88));$skip(32); val res$89 = 
balance("))x)".toList) == false;System.out.println("""res89: Boolean = """ + $show(res$89));$skip(32); val res$90 = 
balance("x)x)".toList) == false;System.out.println("""res90: Boolean = """ + $show(res$90));$skip(31); val res$91 = 
balance("(xx)".toList) == true;System.out.println("""res91: Boolean = """ + $show(res$91));$skip(32); val res$92 = 
balance(")xx)".toList) == false;System.out.println("""res92: Boolean = """ + $show(res$92));$skip(32); val res$93 = 
balance("xxx)".toList) == false;System.out.println("""res93: Boolean = """ + $show(res$93));$skip(32); val res$94 = 
balance("(((x".toList) == false;System.out.println("""res94: Boolean = """ + $show(res$94));$skip(32); val res$95 = 
balance(")((x".toList) == false;System.out.println("""res95: Boolean = """ + $show(res$95));$skip(32); val res$96 = 
balance("x((x".toList) == false;System.out.println("""res96: Boolean = """ + $show(res$96));$skip(32); val res$97 = 
balance("()(x".toList) == false;System.out.println("""res97: Boolean = """ + $show(res$97));$skip(32); val res$98 = 
balance("))(x".toList) == false;System.out.println("""res98: Boolean = """ + $show(res$98));$skip(32); val res$99 = 
balance("x)(x".toList) == false;System.out.println("""res99: Boolean = """ + $show(res$99));$skip(32); val res$100 = 
balance("(x(x".toList) == false;System.out.println("""res100: Boolean = """ + $show(res$100));$skip(32); val res$101 = 
balance(")x(x".toList) == false;System.out.println("""res101: Boolean = """ + $show(res$101));$skip(32); val res$102 = 
balance("xx(x".toList) == false;System.out.println("""res102: Boolean = """ + $show(res$102));$skip(32); val res$103 = 
balance("(()x".toList) == false;System.out.println("""res103: Boolean = """ + $show(res$103));$skip(32); val res$104 = 
balance(")()x".toList) == false;System.out.println("""res104: Boolean = """ + $show(res$104));$skip(31); val res$105 = 
balance("x()x".toList) == true;System.out.println("""res105: Boolean = """ + $show(res$105));$skip(32); val res$106 = 
balance("())x".toList) == false;System.out.println("""res106: Boolean = """ + $show(res$106));$skip(32); val res$107 = 
balance(")))x".toList) == false;System.out.println("""res107: Boolean = """ + $show(res$107));$skip(32); val res$108 = 
balance("x))x".toList) == false;System.out.println("""res108: Boolean = """ + $show(res$108));$skip(31); val res$109 = 
balance("(x)x".toList) == true;System.out.println("""res109: Boolean = """ + $show(res$109));$skip(32); val res$110 = 
balance(")x)x".toList) == false;System.out.println("""res110: Boolean = """ + $show(res$110));$skip(32); val res$111 = 
balance("xx)x".toList) == false;System.out.println("""res111: Boolean = """ + $show(res$111));$skip(32); val res$112 = 
balance("((xx".toList) == false;System.out.println("""res112: Boolean = """ + $show(res$112));$skip(32); val res$113 = 
balance(")(xx".toList) == false;System.out.println("""res113: Boolean = """ + $show(res$113));$skip(32); val res$114 = 
balance("x(xx".toList) == false;System.out.println("""res114: Boolean = """ + $show(res$114));$skip(31); val res$115 = 
balance("()xx".toList) == true;System.out.println("""res115: Boolean = """ + $show(res$115));$skip(32); val res$116 = 
balance("))xx".toList) == false;System.out.println("""res116: Boolean = """ + $show(res$116));$skip(32); val res$117 = 
balance("x)xx".toList) == false;System.out.println("""res117: Boolean = """ + $show(res$117));$skip(32); val res$118 = 
balance("(xxx".toList) == false;System.out.println("""res118: Boolean = """ + $show(res$118));$skip(32); val res$119 = 
balance(")xxx".toList) == false;System.out.println("""res119: Boolean = """ + $show(res$119));$skip(31); val res$120 = 
balance("xxxx".toList) == true;System.out.println("""res120: Boolean = """ + $show(res$120))}
}
