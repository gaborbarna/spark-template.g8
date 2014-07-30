name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "2.2.0" % "test",
  "org.apache.spark" %% "spark-core" % "1.0.1" % "provided"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"
