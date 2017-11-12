package com
import scala.io.StdIn;
object FibonacciUsingForloop {
  def findfibonacci(getinput: Int): Unit = {
    var x, y = 1;
    var fibo = 0;

    for (i <- 3 to getinput) {
      fibo = x + y;
      x = y;
      y = fibo;
      i + getinput;
    }

    println("Nth number using 'FOR' loop is : " + fibo);
  }

  def main(args: Array[String]) {

    print("Enter a Number to find the Nth number using for loop : ");
    val getinput = StdIn.readInt();

    if (getinput == 1) {
      println("if input is 1, then Nth number using 'FOR' loop is : 1");
    } else if (getinput == 2) {
      println("if input is 2 then Nth number using 'FOR' loop is : 1");
    } else if (getinput > 2) {
      findfibonacci(getinput);
    }
  }
}