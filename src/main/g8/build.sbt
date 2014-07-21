name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.0.1"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"
