package com
import scala.io.StdIn;
object FibonacciScala {
  def findFibonacci(getinput: Int): Int = {
    if (getinput == 1 || getinput == 2) {
      return 1;
    } else {
      return findFibonacci(getinput - 1) + findFibonacci(getinput - 2);
    }
  }

  def main(args: Array[String]) {
    print("Enter a Number to find the Nth number using recursive fibonacci : ");
    val getinput = StdIn.readInt();

    println("Nth number using 'RECURRSION' loop is : "
      + findFibonacci(getinput));
  }
}