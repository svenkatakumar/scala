package main

class Rational(x : Int, y : Int) {
  require(y != 0)
  
  private val n = x 
  private val d = y
  
  def this() = this(1,1)
  def this(x:Int) = this(x, 1)
  
  override def toString = n + "/" + d
  
  def add(r : Rational) : Rational = {
    new Rational( this.n * r.d + r.n * this.d, this.d * r.d)
  }
  
  def + (r:Rational) : Rational = this.add(r)
}

object Main {
  def main(args : Array[String]) {
    println("rational: " + new Rational)
    println("rational: " + new Rational(3))
    println("Rational: " + new Rational(4,5))
    println("Rational: " + new Rational(4,5).add( new Rational(5,6) ) )
    println("Rational: " + (new Rational(4,5) + new Rational(5,6)) )
  }
}