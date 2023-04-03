package Module1

import scala.annotation.tailrec

object Module1 extends App {
  def module1(n:Int):Int={
    @tailrec
    def factorial(n:Int,res:Int):Int={
      if(n==0) res
      else factorial(n-1,res*n)
    }
    factorial(n,1)

  }



}
