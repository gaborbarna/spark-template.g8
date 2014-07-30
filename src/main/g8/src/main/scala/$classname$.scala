package $organization$.$name;format="lower,word"$

import org.apache.spark.{SparkContext, SparkConf}
import scala.math.random


object $classname$ {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("$classname$ task")
    val sc = new SparkContext(conf)
    val slices = if (args.length > 0) args(0).toInt else 2
    val pi = calculatePi(sc, slices)
    println(s"Pi is roughly $$pi")
    sc.stop()
  }

  def calculatePi(sc: SparkContext, slices: Int) = {
    val n = 100000 * slices
    val count = sc.parallelize(1 to n, slices).map {i =>
      val x = random * 2 - 1
      val y = random * 2 - 1
      if (x*x + y*y < 1) 1 else 0
    }.reduce(_ + _)
    4.0 * count / n
  }
}
