package $organization$.$name;format="lower,word"$


import org.scalatest._
import sparktest.SparkTestUtils


class $classname$Spec extends SparkTestUtils with ShouldMatchers {
  sparkTest("spark filter") {
    val data = sc.parallelize(1 to 1e6.toInt)
    data.filter{_ % 2 == 0}.count should be (5e5.toInt)
  }

  sparkTest("spark PI") {
    val pi = $classname$.calculatePi(sc, 10)
    pi should equal (3.14 +- 0.01)
  }

  test("non-spark code") {
    val x = 17
    val y = 3
    x + y should be (20)
  }
}
