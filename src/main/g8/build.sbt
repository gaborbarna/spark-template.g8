name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.5" % "test",
  "org.apache.spark" %% "spark-core" % "1.5.1" % "provided"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"
