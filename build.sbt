name := "simple-lisp-parser"

version := "0.1"

scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2",
  "org.scalatest" %% "scalatest" % "3.2.2" % "test",
  "org.scalatest" %% "scalatest-flatspec" % "3.2.2" % "test"
)