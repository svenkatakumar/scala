package main

class Person {
  private val a = 10
  def method() : Unit = { println("Hello Method from person " + Person.b); Person.objMethod() }
}

object Person {
  private val b = 20
  def objMethod() : Unit = { 
    val p = new Person();
    println("Object method " + p.a)
    new Person().method() 
  }
}
